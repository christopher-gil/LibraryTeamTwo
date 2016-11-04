package com.kainos.discoverydiary.views;

import com.kainos.discoverydiary.models.Book;
import io.dropwizard.views.View;

/**
 * Created by conort on 04/11/2016.
 */
public class BookView extends View {

    private final Book book;

    public BookView(Book book) {
        super("/Views/books/book.ftl");
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
