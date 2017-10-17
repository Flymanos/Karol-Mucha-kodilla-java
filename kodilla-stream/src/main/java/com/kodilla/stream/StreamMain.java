package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> par = new HashMap<>();
        par = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> forumUser.getBirthDate().isBefore(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPostCount() != 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        par.entrySet().stream()
                .map(integerForumUserEntry -> integerForumUserEntry.getKey() + " " + integerForumUserEntry.getValue().toString())
                .forEach(System.out::println);
    }


}