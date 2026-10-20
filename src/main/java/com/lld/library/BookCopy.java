package com.lld.library;

public class BookCopy {
    private final String copyId;
    private final Book book;
    private boolean available = true;

    public BookCopy(String copyId, Book book) {
        if (copyId == null || copyId.isBlank() || book == null) {
            throw new IllegalArgumentException("Copy ID and book are required");
        }

        this.copyId = copyId;
        this.book = book;
    }

    public String getCopyId() {
        return copyId;
    }

    public Book getBook() {
        return book;
    }

    public boolean isAvailable() {
        return available;
    }

    public void borrow() {
        if (!available) {
            throw new IllegalStateException("Book copy is unavailable");
        }
        available = false;
    }

    public void returnCopy() {
        if (available) {
            throw new IllegalStateException("Book copy is already available");
        }
        available = true;
    }
}