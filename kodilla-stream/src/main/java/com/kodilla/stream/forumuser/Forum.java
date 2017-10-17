package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forum {
    public ArrayList<ForumUser> getUserList(){
        ArrayList<ForumUser> forumUsers = new ArrayList<>();
        forumUsers.add(new ForumUser(1, "szejk1", 'm', LocalDate.of(1990, 11, 21), 12));
        forumUsers.add(new ForumUser(2, "szejk2", 'f', LocalDate.of(2010, 11, 21), 0));
        forumUsers.add(new ForumUser(3, "szejk3", 'm', LocalDate.of(1410, 11, 21), 12));
        forumUsers.add(new ForumUser(4, "szejk4", 'f', LocalDate.of(2010, 11, 21), 12));
        forumUsers.add(new ForumUser(5, "szejk5", 'm', LocalDate.of(1999, 11, 21), 12));
        forumUsers.add(new ForumUser(6, "szejk6", 'f', LocalDate.of(2010, 11, 21), 12));
        forumUsers.add(new ForumUser(7, "szejk7", 'm', LocalDate.of(1990, 11, 21), 0));
        return forumUsers;
    }
}
