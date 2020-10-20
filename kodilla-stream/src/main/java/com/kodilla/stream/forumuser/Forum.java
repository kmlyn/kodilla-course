package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(1, "jsmith", 'M', LocalDate.of(1995, 5, 5), 10));
        userList.add(new ForumUser(2, "amargot", 'F', LocalDate.of(1995, 4, 25), 20));
        userList.add(new ForumUser(3, "jalexander", 'M', LocalDate.of(1990, 12, 5), 15));
        userList.add(new ForumUser(4, "kolsen", 'M', LocalDate.of(2002, 5, 5), 10));
        userList.add(new ForumUser(5, "araster", 'F', LocalDate.of(1991, 7, 15), 50));
        userList.add(new ForumUser(6, "jjasper", 'M', LocalDate.of(1993, 12, 5), 0));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
