package com.test.model;

public class BookCategory {
    private Integer bookCategoryId;

    private String bookCategoryName;

    public BookCategory(Integer bookCategoryId, String bookCategoryName) {
        this.bookCategoryId = bookCategoryId;
        this.bookCategoryName = bookCategoryName;
    }

    public BookCategory() {
        super();
    }

    public Integer getBookCategoryId() {
        return bookCategoryId;
    }

    public void setBookCategoryId(Integer bookCategoryId) {
        this.bookCategoryId = bookCategoryId;
    }

    public String getBookCategoryName() {
        return bookCategoryName;
    }

    public void setBookCategoryName(String bookCategoryName) {
        this.bookCategoryName = bookCategoryName;
    }
}