package com.lld.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private Library library;
    private BookCopy copy;

    @BeforeEach
    void setUp() {
        library = new Library();
        Book book = new Book("ISBN-101", "Clean Code", "Robert Martin");
        copy = new BookCopy("COPY-1", book);

        library.addBookCopy(copy);
        library.registerMember(new Member("MEM-1", "Aman"));
    }

    @Test
    void shouldSearchByTitle() {
        assertEquals(1, library.searchByTitle("clean").size());
    }

    @Test
    void shouldBorrowAvailableCopy() {
        Loan loan = library.borrowBook("MEM-1", "COPY-1");

        assertTrue(loan.isActive());
        assertFalse(copy.isAvailable());
    }

    @Test
    void shouldRejectBorrowingUnavailableCopy() {
        library.borrowBook("MEM-1", "COPY-1");

        assertThrows(IllegalStateException.class,
                () -> library.borrowBook("MEM-1", "COPY-1"));
    }

    @Test
    void shouldReturnBorrowedCopy() {
        Loan loan = library.borrowBook("MEM-1", "COPY-1");
        library.returnBook(loan);

        assertFalse(loan.isActive());
        assertTrue(copy.isAvailable());
    }

    @Test
    void shouldRejectReturningTwice() {
        Loan loan = library.borrowBook("MEM-1", "COPY-1");
        library.returnBook(loan);

        assertThrows(IllegalStateException.class,
                () -> library.returnBook(loan));
    }

    @Test
    void shouldRejectUnknownMember() {
        assertThrows(IllegalArgumentException.class,
                () -> library.borrowBook("UNKNOWN", "COPY-1"));
    }

    @Test
    void shouldRejectUnknownCopy() {
        assertThrows(IllegalArgumentException.class,
                () -> library.borrowBook("MEM-1", "UNKNOWN"));
    }
}