package com.kainos.discoverydiary.models;

import org.joda.time.DateTime;

public class Book {

    private int id;
    private String title;
    private String category;
    private String author;
    private String publisher;
    private DateTime datePublished;
    private String description;
    private String location;
    private Boolean isBorrowed;
    private DateTime borrowedOn;
    private String borrowedBy;

    public Book() {
    }

    public Book(String title){
        this.title = title;
    }

    public Book(int id,
                String title,
                String category,
                String author,
                String publisher,
                DateTime datePublished,
                String description,
                String location) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.publisher = publisher;
        this.datePublished = datePublished;
        this.description = description;
        this.location = location;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() { return category; }

    public void setCategory(String category) { this.category = category; }

    public String getAuthor() { return author; }

    public void setAuthor(String author) { this.author = author; }

    public String getPublisher() { return publisher; }

    public void setPublisher(String publisher) { this.publisher = publisher; }

    public DateTime getDatePublished() { return datePublished; }

    public void setDatePublished(DateTime datePublished) { this.datePublished = datePublished; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    public Boolean getBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        isBorrowed = borrowed;
    }

    public DateTime getBorrowedOn() {
        return borrowedOn;
    }

    public void setBorrowedOn(DateTime borrowedOn) {
        this.borrowedOn = borrowedOn;
    }

    public String getBorrowedBy() {
        return borrowedBy;
    }

    public void setBorrowedBy(String borrowedBy) {
        this.borrowedBy = borrowedBy;
    }
}
