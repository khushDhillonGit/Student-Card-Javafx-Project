package com.example.assignment1;

import javafx.scene.image.Image;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Student {

    private String firstName;
    private String lastName;
    private int studentNumber;
    private ArrayList<String> activities;
    private Image studentImage;

    /**
     *    Constructor to initialise all the variables and get image to print on one card
     *
     */

    public Student(String firstName, String lastName, int studentNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentNumber(studentNumber);

        activities = new ArrayList<>();
        String fileName = String.format("images/pic.jpeg");
        studentImage = new Image(getClass().getResource(fileName).toExternalForm());

    }

    /**
     *    Getters to get values of variables
     *
     */


    public Image getStudentImage() {return studentImage;}

    public String getFirstName() {return firstName;}

    public String getLastName() {return lastName;}

    public int getStudentNumber() {return studentNumber;}

    public ArrayList<String> getActivities() {return activities;}


    /**
     *    setter to validate firstname and also capitlise first letter
     *
     */

    public void setFirstName(String firstName) {

        if(firstName.length() >= 2){
           firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
            this.firstName = firstName;
        }else{
            throw new IllegalArgumentException("Please provide a valid firstname");

        }

    }

    /**
     *    setter to validate lastname and also capitlise first letter
     *
     */

    public void setLastName(String lastName) {
        if(lastName.length() >= 2){
            lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);
            this.lastName = lastName;
        }else{
            throw new IllegalArgumentException("Please provide a valid lastname");
        }
    }

    /**
     *    setter to validate studentId to be in between 100000000 and 99999999
     *
     */

    public void setStudentNumber(int studentNumber) {
        if(studentNumber >= 100000000 && studentNumber <= 999999999){
            this.studentNumber = studentNumber;
        }else{
            throw new IllegalArgumentException("Please provide a valid Student Number");
        }
    }

    /**
     *    method to add activity into the activity list and validate if not empty
     *
     */
    public void AddActivity(String activity){
        if(!activity.isEmpty()){
            activities.add(activity);
        }else{
            throw new IllegalArgumentException("please provide an activity");
        }
    }


}
