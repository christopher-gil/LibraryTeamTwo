package com.kainos.discoverydiary;

import com.google.common.collect.Lists;
import com.kainos.discoverydiary.models.Book;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookDataStore {

    public void constructBooks() {
        books.add(new Book(1, "Real World SharePoint 2007", "Technical", "Hiller", "Wrox", DateTime.now(),
                "SharePoint Guide", "Belfast", "https://www.asme.org/getmedia/c2c8ea5a-b690-4ba7-92bb-34bd1432862b/book_guide_hero_books.aspx"));
        books.add(new Book(2, "Windows Command-Line", "Non-technical", "William Stanek", "MK", DateTime.now(),
                "Windows Command Line Guide", "Belfast", "https://www.asme.org/getmedia/c2c8ea5a-b690-4ba7-92bb-34bd1432862b/book_guide_hero_books.aspx"));
        books.add(new Book(3, "Computer Organization And Design", "Technical", "Patterson & Hennessy", "O'Reilly",
                DateTime.now(), "Discussion of Computer Organisation and Design and the hardware/software interface",
                "Belfast", "https://www.asme.org/getmedia/c2c8ea5a-b690-4ba7-92bb-34bd1432862b/book_guide_hero_books.aspx"));
        books.add(new Book(4, "Perl Cookbook", "Technical", "Christiansen & Torkington", "Mercer", DateTime.now(),
                "Perl Information and Guidance", "Belfast", "https://www.asme.org/getmedia/c2c8ea5a-b690-4ba7-92bb-34bd1432862b/book_guide_hero_books.aspx"));
        books.add(new Book(5, "Marketing", "Non-Technical", "Mercer", "HB", DateTime.now(), "Marketing Treatise",
                "Belfast", "https://www.asme.org/getmedia/c2c8ea5a-b690-4ba7-92bb-34bd1432862b/book_guide_hero_books.aspx"));
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

    public ArrayList<Book> getTechnical(List<Book> allbooks) {

            ArrayList<Book> technical = new ArrayList<>();

            for (Book book: allbooks) {
                if (book.getCategory().equalsIgnoreCase("Technical")) {
                    technical.add(book);
                }
            }
            return technical;
        }

    public ArrayList<Book> getNonTechnical(List<Book> allbooks) {

        ArrayList<Book> technical = new ArrayList<>();

        for (Book book: allbooks) {
            if (book.getCategory().equalsIgnoreCase("Non-Technical")) {
                technical.add(book);
            }
        }
        return technical;
    }
    }
