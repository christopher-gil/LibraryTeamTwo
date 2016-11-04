package com.kainos.discoverydiary.resources;

import com.codahale.metrics.annotation.Timed;
import com.kainos.discoverydiary.BookDataStore;
import com.kainos.discoverydiary.config.DiscoveryDiaryConfiguration;
import com.kainos.discoverydiary.models.Book;
import com.kainos.discoverydiary.views.BookView;
import com.kainos.discoverydiary.views.BooksListView;
import io.dropwizard.views.View;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;

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

    @Path("/list")
    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View bookList(){
        return new BooksListView(bookDataStore.getBooks());
    }

    @Path("/{id}")
    @GET
    @Timed
    @Produces(MediaType.TEXT_HTML)
    public View getBook(@PathParam("id") int id){
        return new BookView(bookDataStore.getBook(id));
    }

    @Path("/borrow")
   @POST
   @Timed
   @Produces(MediaType.TEXT_HTML)
   public Response borrow(@FormParam("borrower") String borrower, @FormParam("id") int id){
       Book book = bookDataStore.getBook(id);
       book.setIsBorrowed(true);
       book.setBorrowedOn(DateTime.now());
       book.setBorrowedBy(borrower);
       URI uri = UriBuilder.fromUri("/book/"+id).build();
       return Response.seeOther(uri).build();
   }

   @Path("/return")
  @POST
  @Timed
  @Produces(MediaType.TEXT_HTML)
  public Response borrow(@FormParam("id") int id){
      Book book = bookDataStore.getBook(id);
      book.setIsBorrowed(false);
      book.setBorrowedOn(null);
      book.setBorrowedBy(null);
      URI uri = UriBuilder.fromUri("/book/"+id).build();
      return Response.seeOther(uri).build();
  }
}
