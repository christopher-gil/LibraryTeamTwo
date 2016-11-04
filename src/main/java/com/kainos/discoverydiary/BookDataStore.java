package com.kainos.discoverydiary;

import com.google.common.collect.Lists;
import com.kainos.discoverydiary.models.Book;
import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class BookDataStore {

    public void constructBooks() {
        books.add(new Book(1, "Real World SharePoint 2007", "Technical", "Hiller", "Wrox", DateTime.now(),
                "SharePoint Guide", "Belfast"));
        books.add(new Book(2, "Windows Command-Line", "Non-technical", "William Stanek", "MK", DateTime.now(),
                "Windows Command Line Guide", "Belfast"));
        books.add(new Book(3, "Computer Organization And Design", "Technical", "Patterson & Hennessy", "O'Reilly",
                DateTime.now(), "Discussion of Computer Organisation and Design and the hardware/software interface",
                "Belfast"));
        books.add(new Book(4, "Perl Cookbook", "Technical", "Christiansen & Torkington", "Mercer", DateTime.now(),
                "Perl Information and Guidance", "Belfast"));
        books.add(new Book(5, "Marketing", "Non-Technical", "Mercer", "HB", DateTime.now(), "Marketing Treatise",
                "Belfast"));
    }

    private static List<Book> books = Lists.newArrayList();

    public List<Book> getBooks() {
        return books;
    }

    public Book getBook(int id) {
        return books.stream().filter(b -> b.getId() == id).findFirst().get();
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

