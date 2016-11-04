package com.kainos.discoverydiary.resources;

import com.codahale.metrics.annotation.Timed;
import com.kainos.discoverydiary.BookDataStore;
import com.kainos.discoverydiary.config.DiscoveryDiaryConfiguration;
import com.kainos.discoverydiary.views.BooksAddView;
import com.kainos.discoverydiary.views.BooksListView;
import io.dropwizard.views.View;
import jersey.repackaged.com.google.common.collect.Lists;
import org.assertj.core.util.Strings;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ciaram on 03/11/2016.
 */
@Path("/book")
public class BookResource {

    final BookDataStore bookDataStore;

    public BookResource(BookDataStore bookDataStore) {
        this.bookDataStore = bookDataStore;
    }

    @Path("/list")
    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View bookList(){
        return new BooksListView(bookDataStore.getBooks());
    }

    @Path("/add")
    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View add(){
        return new BooksAddView(new ArrayList<String>());
    }

    @Path("/add")
    @POST
    @Timed
    @Produces(MediaType.TEXT_HTML)
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public View addBook(@FormDataParam("title") String title,
                        @FormDataParam("category") String category,
                        @FormDataParam("author") String author,
                        @FormDataParam("publisher") String publisher,
                        @FormDataParam("datePublished") String datePublished,
                        @FormDataParam("description") String description,
                        @FormDataParam("location") String location){

        List<String> errors = Lists.newArrayList();

        if (Strings.isNullOrEmpty(title)) {
            errors.add("Enter a valid title");
        }

        if (!errors.isEmpty()) {
            return new BooksAddView(errors);
        }

        DateTime datePublishedToDateTime = DateTime.parse(datePublished); //2016-01-01

        // LOGGER.info("Registering person " + String.format("id: %s name: %s age: %s", idForNewPerson, name, age));
        bookDataStore.registerResource(title, category, author, publisher, datePublishedToDateTime, description, location);

        URI peopleListUri = UriBuilder.fromUri("/book/list").build();
        Response response = Response.seeOther(peopleListUri).build();
        throw new WebApplicationException(response); // valid way to redirect in dropwizard
    }
}
