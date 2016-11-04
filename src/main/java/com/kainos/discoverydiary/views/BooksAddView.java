package com.kainos.discoverydiary.views;

import io.dropwizard.views.View;

import java.util.List;

/**
 * Created by annem on 04/11/2016.
 */
public class BooksAddView extends View {


    private final List<String> errors;

    public BooksAddView(List<String> errors) {
        super("/Views/books/add.ftl");
        this.errors = errors;
    }

    public List<String> getErrors() {
        return errors;
    }

}
