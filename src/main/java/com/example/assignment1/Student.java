package com.example.assignment1;

import javafx.scene.image.Image;

import java.util.List;
import java.util.Locale;

public class Student {
    private String firstName;
    private String lastName;
    private int studentNumber;
    private List<String> activities;
    private Image studentImage;

    public Student(String firstName, String lastName, int studentNumber, List<String> activities) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);

        String fileName = String.format("images/pic.jpeg");
        studentImage = new Image(getClass().getResource(fileName).toExternalForm());

    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        if(firstName.length() >= 2){
           firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
            this.firstName = firstName;
        }else{
            throw new IllegalArgumentException("Please provide a valid firstname");

        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length() >= 2){
            lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
            this.lastName = lastName;
        }else{
            throw new IllegalArgumentException("Please provide a valid lastname");

        }
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        if(studentNumber >= 100000000 && studentNumber <= 999999999){
            this.studentNumber = studentNumber;
        }else{
            throw new IllegalArgumentException("Please provide a valid Student Number");
        }
    }

    public List<String> getActivities() {
        return activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }
}
