package com.kodilla;

import java.util.HashMap;

public class School {
    private HashMap<Student, Grader> studentGraderHashMap = new HashMap<>();

    public void createNewStudent(String firstName, String lastName, String PESEL){
        studentGraderHashMap.put(new Student(firstName, lastName, PESEL), new Grader());
    }


}
