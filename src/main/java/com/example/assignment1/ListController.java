package com.example.assignment1;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ListController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private Student student;

    @FXML
    private ListView<String> moreActivities;



    public void switchToStudent(ActionEvent event) throws IOException {
        updateList();
        Parent root = FXMLLoader.load(getClass().getResource("student-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    };

    public void setClient(Student student) {
        this.student = student;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        moreActivities.getItems().addAll("Horse Riding","Book Reading","Shooting","Programming",
                "Listening Music","Dancing","Rick Rolling","Joking","Sky Diving");
        moreActivities.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    public void updateList(){
        ObservableList list = moreActivities.getSelectionModel().getSelectedItems();

        for(Object item: list){
            student.AddActivity((String)item);
        }


    }


}
