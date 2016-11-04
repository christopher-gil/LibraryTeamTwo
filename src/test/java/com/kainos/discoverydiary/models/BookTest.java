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
    public void setup() {
        book = new Book();
    }

    @Test
    public void bookConstructor_Empty_ReturnsInstanceOfBook() {
        Assert.assertTrue(new Book() instanceof Book);
    }

    @Test
    public void bookConstructor_ValidTitle_ReturnsInstanceOfBook(){
        Assert.assertTrue(new Book(1, "Real World SharePoint 2007", "", "Development", "Wrox", DateTime.now(), "", "", "") instanceof Book);
    }

    @Test
    public void setterAndGetter_ValidTitle_ReturnsValidTitle() {
        String title = "Perl Cookbook";
        book.setTitle(title);
        Assert.assertEquals(title, book.getTitle());
    }

    @Test
    public void setterAndGetter_ValidAuthor_ReturnsValidAuthor() {
        String author = "Christiansen";
        book.setAuthor(author);
        Assert.assertEquals(author, book.getAuthor());
    }

    @Test
    public void setterAndGetter_ValidDatePublished_ReturnsValidDatePublished() {
        DateTime date = new DateTime(2013, 11, 15, 8,0, 0);
        String expectedDate = "15/11/2013";
        book.setDatePublished(date);
        Assert.assertEquals(expectedDate, book.getDatePublished());
    }

    @Test
    public void setterAndGetter_ValidDescription_ReturnsValidDescription() {
        String description = "This book is great!!";
        book.setDescription(description);
        Assert.assertEquals(description, book.getDescription());
    }

    @Test
    public void setterAndGetter_ValidCategory_ReturnsValidCategory() {
        String category = "Tech";
        book.setCategory(category);
        Assert.assertEquals(category, book.getCategory());
    }

    @Test
    public void setterAndGetter_ValidId_ReturnsValidId() {
        int id = 2;
        book.setId(id);
        Assert.assertEquals(id, book.getId());
    }
}