package com.kainos.discoverydiary.resources;

import com.codahale.metrics.annotation.Timed;
import com.kainos.discoverydiary.BookDataStore;
import com.kainos.discoverydiary.config.DiscoveryDiaryConfiguration;
import com.kainos.discoverydiary.views.BookView;
import com.kainos.discoverydiary.views.BooksListView;
import com.kainos.discoverydiary.views.AdvancedSearchView;
import io.dropwizard.views.View;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by ciaram on 03/11/2016.
 */
@Path("/book")
public class BookResource {

    final BookDataStore bookDataStore;

    public BookResource(BookDataStore bookDataStore) {
        this.bookDataStore = bookDataStore;
        bookDataStore.constructBooks();
    }

    @Path("/advancedSearch")
    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
      public View advancedSearch(){
        return new AdvancedSearchView();
      }


    @Path("/list")
    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View bookList() {
        return new BooksListView(bookDataStore.getBooks());
    }

    @Path("/{id}")
    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View getBook(@PathParam("id") int id) {
        return new BookView(bookDataStore.getBook(id));
    }

    @Path("/technical")
    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View technicalResources() {

        return new BooksListView(bookDataStore.getTechnical(bookDataStore.getBooks()));
    }

    @Path("/nonTechnical")
    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View nontechnical() {
        return new BooksListView(bookDataStore.getNonTechnical(bookDataStore.getBooks()));
    }
}
