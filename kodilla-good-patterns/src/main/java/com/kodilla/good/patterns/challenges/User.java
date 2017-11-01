package com.kodilla.good.patterns.challenges;

public class User {
    private final String nickname;
    private final String email;

    public User(String nickname, String email) {
        this.nickname = nickname;
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }
}
