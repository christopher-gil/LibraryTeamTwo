package com.kainos.discoverydiary;

import com.google.common.collect.Lists;
import com.kainos.discoverydiary.models.Book;
import org.joda.time.DateTime;

import java.util.List;

public class BookDataStore {

    public void constructBooks() {
        books.add(new Book(1, "Real World SharePoint 2007", "", "Development", "Wrox", DateTime.now(), "", ""));
        books.add(new Book(2, "Windows Command-Line", "", "Development", "MK", DateTime.now(), "", ""));
        books.add(new Book(3, "Computer Organization And Design", "", "Development", "O'Reilly", DateTime.now(), "", ""));
        books.add(new Book(4, "Perl Cookbook", "", "Development", "Mercer", DateTime.now(), "", ""));
        books.add(new Book(5, "Marketing", "", "Development", "Mercer", DateTime.now(), "", ""));
    }

    private static List<Book> books = Lists.newArrayList();

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(int id) {
        return books.stream().filter(b -> b.getId() == id).findFirst().get();
    }
}
