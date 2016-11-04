package com.kainos.discoverydiary;

import com.google.common.collect.Lists;
import com.kainos.discoverydiary.models.Book;
import org.joda.time.DateTime;

import java.util.List;

public class BookDataStore {

    private static List<Book> books = Lists.newArrayList();
    private static int id =0;

    public List<Book> getBooks() {
        return books;
    }

    public void registerResource(String title, String category, String author, String publisher, DateTime datePublishedToDateTime, String description, String location) {
        Book book = new Book(++id, title, category, author, publisher, datePublishedToDateTime, description, location);
        books.add(book);
    }


    public Book getBook(int id) {
        return books.stream().filter(b -> b.getId() == id).findFirst().get();
    }

}
