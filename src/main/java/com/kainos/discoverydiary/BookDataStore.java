package com.kainos.discoverydiary;

import com.google.common.collect.Lists;
import com.kainos.discoverydiary.models.Book;

import java.util.List;

public class BookDataStore {

    public void constructBooks(){
        books.add(new Book("Real World SharePoint 2007"));
        books.add(new Book("Windows Command-Line"));
        books.add(new Book("Computer Organization And Design"));
        books.add(new Book("Perl Cookbook"));
        books.add(new Book("Marketing"));
    }

    private static List<Book> books = Lists.newArrayList();

    public List<Book> getPeople() {
        return books;
    }



}
