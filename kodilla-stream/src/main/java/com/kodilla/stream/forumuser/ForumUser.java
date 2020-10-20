package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int id;
    private final String username;
    private final char gender;
    private final LocalDate birthDate;
    private final int publishedPosts;

    public ForumUser(int id, String username, char gender, LocalDate birthDate, int publishedPosts) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.birthDate = birthDate;
        this.publishedPosts = publishedPosts;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}
