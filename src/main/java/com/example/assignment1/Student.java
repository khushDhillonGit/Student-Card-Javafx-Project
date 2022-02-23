package com.example.assignment1;

import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private List<String> activities;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        if(firstName.matches("[A-Za-z]]") && firstName.length() >= 2){
            this.firstName = firstName;
        }else{
            throw new IllegalArgumentException("Please provide a valid firstname");

        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.matches("[A-Za-z]]") && lastName.length() >= 2){
            this.lastName = lastName;
        }else{
            throw new IllegalArgumentException("Please provide a valid lastname");

        }
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }
}
