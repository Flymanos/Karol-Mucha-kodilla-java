package com.kodilla;

import java.util.ArrayList;

public class Grader {
    private ArrayList<Grade> grades = new ArrayList<>();

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void addGrade(int grade, String przedmiot){
        getGrades().add(new Grade(grade, przedmiot));
    }

    public void listGrades(String przedmiot){
        for (Grade grade : grades){
            if (grade.getPrzedmiot() == przedmiot) System.out.println(grade.getGrade() + " ");
        }
    }
}
