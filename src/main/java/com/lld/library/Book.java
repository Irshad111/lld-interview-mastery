package com.lld.library;

public class Book {
    private final String isbn;
    private final String title;
    private final String author;

    public Book(String isbn, String title, String author) {
        if (isbn == null || isbn.isBlank()
                || title == null || title.isBlank()
                || author == null || author.isBlank()) {
            throw new IllegalArgumentException("Book details are required");
        }

        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}