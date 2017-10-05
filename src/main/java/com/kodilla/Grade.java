package com.kodilla;

public class Grade {
    private Integer grade;
    private String przedmiot;

    public Grade(Integer grade, String przedmiot) {
        this.grade = grade;
        this.przedmiot = przedmiot;
    }

    public Grade(Integer grade, String przedmiot, String description) {
        this.grade = grade;
        this.przedmiot = przedmiot;
    }

    public Integer getGrade() {
        return grade;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

}
