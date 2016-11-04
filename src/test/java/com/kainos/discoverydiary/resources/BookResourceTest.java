package com.kainos.discoverydiary.resources;

import com.codahale.metrics.MetricRegistry;
import com.kainos.discoverydiary.BookDataStore;
import io.dropwizard.testing.junit.ResourceTestRule;
import io.dropwizard.views.ViewMessageBodyWriter;
import io.dropwizard.views.ViewRenderer;
import io.dropwizard.views.freemarker.FreemarkerViewRenderer;
import jersey.repackaged.com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ciaram on 03/11/2016.
 */
public class BookResourceTest {

    private BookResource bookResource;
    private BookDataStore bookDataStore = new BookDataStore();

    private static List<ViewRenderer> renders = Lists.<ViewRenderer>newArrayList(new FreemarkerViewRenderer());

    @ClassRule
    public static final ResourceTestRule resources = ResourceTestRule.builder()
            .addResource(new BookResource(new BookDataStore()))
            .addProvider(new ViewMessageBodyWriter(new MetricRegistry(), renders))
            .build();

    @Test
    public void TestBookListPopulatedReturnsOK() {

        Response response = resources.client()
                .target("/book/list")
                .request(MediaType.TEXT_HTML_TYPE)
                .get();

        assertEquals(200, response.getStatus());
    }

    @Test
    public void checkBookListNotEmpty(){
        boolean result;
        bookResource = new BookResource(bookDataStore);
        if(bookResource.bookList() != null){
            result = true;
        }else{
            result = false;
        }
        Assert.assertEquals(result, true);
    }

}