package com.kainos.discoverydiary.views;

import com.kainos.discoverydiary.models.Book;
import io.dropwizard.views.View;

import java.util.List;

/**
 * Created by annem on 03/11/2016.
 */
public class BooksListView extends View {

    private final List<Book> books;

    public BooksListView(List<Book> books) {
        super("/Views/books/list.ftl");
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }


}
