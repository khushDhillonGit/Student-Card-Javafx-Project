package com.example.assignment1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {

    @FXML
    private ListView<String> activitiesList;

    @FXML
    private Label firstLabel;

    @FXML
    private Label lastLabel;

    @FXML
    private ImageView studentImage;

    @FXML
    private Label studentLabel;

    private Student student;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        student = new Student("Khushwinder","Singh",200485179);
        student.AddActivity("Horse Riding");
        student.AddActivity("Chess");
        student.AddActivity("Swimming");

        firstLabel.setText(student.getFirstName());
        lastLabel.setText(student.getLastName());
        studentLabel.setText( String.valueOf(student.getStudentNumber()));

        studentImage.setImage(student.getStudentImage());
        activitiesList.getItems().addAll(student.getActivities());


    }
}