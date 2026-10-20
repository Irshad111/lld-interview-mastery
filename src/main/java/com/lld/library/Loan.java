package com.lld.library;

import java.time.LocalDateTime;

public class Loan {
    private final Member member;
    private final BookCopy bookCopy;
    private final LocalDateTime borrowedAt;
    private LocalDateTime returnedAt;

    public Loan(Member member, BookCopy bookCopy) {
        if (member == null || bookCopy == null) {
            throw new IllegalArgumentException("Member and copy are required");
        }

        this.member = member;
        this.bookCopy = bookCopy;
        this.borrowedAt = LocalDateTime.now();
    }

    public Member getMember() {
        return member;
    }

    public BookCopy getBookCopy() {
        return bookCopy;
    }

    public LocalDateTime getBorrowedAt() {
        return borrowedAt;
    }

    public LocalDateTime getReturnedAt() {
        return returnedAt;
    }

    public boolean isActive() {
        return returnedAt == null;
    }

    public void returnBook() {
        if (!isActive()) {
            throw new IllegalStateException("Loan is already returned");
        }

        bookCopy.returnCopy();
        returnedAt = LocalDateTime.now();
    }
}