package com.example.assignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("student-view.fxml"));
        Scene scene = new Scene(root, 360, 560);
        stage.sizeToScene();
        stage.setTitle("College One Card");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }




}