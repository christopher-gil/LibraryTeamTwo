package com.kainos.discoverydiary;

import com.google.common.collect.Lists;
import com.kainos.discoverydiary.models.Book;
import org.joda.time.DateTime;

import java.util.List;

public class BookDataStore {

    public void constructBooks() {
        books.add(new Book(1, "Real World SharePoint 2007", "Hiller", "Development", "Wrox", DateTime.now() ,
                "SharePoint Guide", "Belfast"));
        books.add(new Book(2, "Windows Command-Line", "William Stanek", "Development", "MK", DateTime.now(),
                "Windows Command Line Guide", "Belfast"));
        books.add(new Book(3, "Computer Organization And Design", "Patterson & Hennessy", "Development", "O'Reilly",
                DateTime.now(), "Discussion of Computer Organisation and Design and the hardware/software interface",
                "Belfast"));
        books.add(new Book(4, "Perl Cookbook", "Christiansen & Torkington", "Development", "Mercer", DateTime.now(),
                "Perl Information and Guidance", "Belfast"));
        books.add(new Book(5, "Marketing", "Mercer", "Development", "HB", DateTime.now(), "Marketing Treatise",
                "Belfast"));
    }

    private static List<Book> books = Lists.newArrayList();

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(int id) {
        return books.stream().filter(b -> b.getId() == id).findFirst().get();
    }
}
