package com.kainos.discoverydiary.models;

import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by conort on 04/11/2016.
 */
public class BookTest {

    private Book book;

    @Before
    public void setup(){
        book = new Book();
    }

    @Test
    public void bookConstructor_Empty_ReturnsInstanceOfBook(){
        Assert.assertTrue(new Book() instanceof Book);
    }

    @Test
    public void bookConstructor_ValidTitle_ReturnsInstanceOfBook(){
        Assert.assertTrue(new Book(1, "Real World SharePoint 2007", "", "Development", "Wrox", DateTime.now(), "", "") instanceof Book);
    }

    @Test
    public void setterAndGetter_ValidTitle_ReturnsValidTitle(){
        String title = "Perl Cookbook";
        book.setTitle(title);
        Assert.assertEquals(title, book.getTitle());
    }
}