package com.kainos.discoverydiary;

import com.kainos.discoverydiary.models.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by conort on 04/11/2016.
 */
public class BookDataStoreTest {

    private BookDataStore bookDataStore;

    @Before
    public void setup(){
        bookDataStore = new BookDataStore();
    }

    @Test
    public void getBooks_exists_returnsInstanceOfArrayList(){
        Assert.assertTrue(bookDataStore.getBooks() instanceof ArrayList);
    }
}