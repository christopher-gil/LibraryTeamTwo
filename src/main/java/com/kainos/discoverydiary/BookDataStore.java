package com.kainos.discoverydiary;

import com.google.common.collect.Lists;
import com.kainos.discoverydiary.models.Book;
import org.joda.time.DateTime;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<Book> getSearchedBooks(String author, DateTime datePublished, String description, String category) {
        List<Book> searchedBooks = books;
        if(author != ""){
            searchedBooks = books.stream().filter((i) -> i.getAuthor() == author).collect(Collectors.toList());
        }
        if(datePublished != null){
            searchedBooks = books.stream().filter((i) -> i.getDatePublished() == datePublished).collect(Collectors.toList());
        }
        if(description != ""){
            searchedBooks = books.stream().filter((i) -> i.getDescription() == description).collect(Collectors.toList());
        }
        if(category != ""){
            searchedBooks = books.stream().filter((i) -> i.getCategory() == category).collect(Collectors.toList());
        }
        return searchedBooks;
    }
}
