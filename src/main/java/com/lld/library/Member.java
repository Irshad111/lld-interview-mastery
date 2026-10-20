package com.lld.library;

public class Member {
    private final String memberId;
    private final String name;

    public Member(String memberId, String name) {
        if (memberId == null || memberId.isBlank()
                || name == null || name.isBlank()) {
            throw new IllegalArgumentException("Member details are required");
        }

        this.memberId = memberId;
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }
}