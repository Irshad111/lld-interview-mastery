package com.lld.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<BookCopy> copies = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();
    private final List<Loan> loans = new ArrayList<>();

    public void addBookCopy(BookCopy copy) {
        if (copy == null || copies.contains(copy)) {
            throw new IllegalArgumentException("Invalid or duplicate copy");
        }
        copies.add(copy);
    }

    public void registerMember(Member member) {
        if (member == null || members.contains(member)) {
            throw new IllegalArgumentException("Invalid or duplicate member");
        }
        members.add(member);
    }

    public List<BookCopy> searchByTitle(String title) {
        if (title == null || title.isBlank()) {
            return List.of();
        }

        return copies.stream()
                .filter(copy -> copy.getBook().getTitle()
                        .toLowerCase()
                        .contains(title.toLowerCase()))
                .toList();
    }

    public Loan borrowBook(String memberId, String copyId) {
        Member member = members.stream()
                .filter(m -> m.getMemberId().equals(memberId))
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("Member not registered"));

        BookCopy copy = copies.stream()
                .filter(c -> c.getCopyId().equals(copyId))
                .findFirst()
                .orElseThrow(() ->
                        new IllegalArgumentException("Copy not registered"));

        copy.borrow();

        Loan loan = new Loan(member, copy);
        loans.add(loan);
        return loan;
    }

    public void returnBook(Loan loan) {
        if (loan == null || !loans.contains(loan)) {
            throw new IllegalArgumentException("Loan not registered in library");
        }

        loan.returnBook();
    }

    public List<Loan> getLoans() {
        return List.copyOf(loans);
    }
}