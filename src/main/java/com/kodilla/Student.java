package com.kodilla;

public class Student {
    private final String firstName;
    private final String lastName;
    private final String PESEL;

    public Student(String firstName, String lastName, String PESEL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.PESEL = PESEL;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPESEL() {
        return PESEL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return getPESEL().equals(student.getPESEL());
    }

    @Override
    public int hashCode() {
        return getPESEL().substring(0,3).hashCode();
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", PESEL='" + PESEL + '\'' +
                '}';
    }
}
