package com.kainos.discoverydiary.Views;

import com.kainos.discoverydiary.models.Book;
import com.kainos.discoverydiary.views.BookView;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

/**
 * Created by conort on 04/11/2016.
 */
public class BookViewTest {

    private BookView view;

    @Before
    public void setup(){
        Book book= mock(Book.class);
        view = new BookView(book);
    }

    @Test
    public void newBook_mockBook_ReturnTrue(){
        Assert.assertTrue(new BookView(mock(Book.class)) instanceof BookView);
    }

    @Test
    public void getBook_Void_ReturnBook(){
        Assert.assertTrue(view.getBook() instanceof Book);
    }
}