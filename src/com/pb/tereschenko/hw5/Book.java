package com.pb.tereschenko.hw5;

public class Book {
    private String bookTitle;
    private String bookAuthor;
    private int yearEdition;


    public Book(String bookTitle, String bookAuthor, int yearEdition) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.yearEdition = yearEdition;

    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getYearEdition() {
        return yearEdition;
    }
}
