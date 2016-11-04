package com.kainos.discoverydiary.views;

import com.kainos.discoverydiary.models.Book;
import io.dropwizard.views.View;

import java.util.List;

/**
 * Created by annem on 03/11/2016.
 */
  public class AdvancedSearchView extends View {
    public AdvancedSearchView() {
        super("/Views/books/advancedSearch.ftl");
    }
}
