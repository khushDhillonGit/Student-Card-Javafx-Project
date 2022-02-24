package com.example.assignment1;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


import java.net.URL;
import java.util.ResourceBundle;


public class StudentViewController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private static BorderPane mainLayout;

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

//    public void switchToList(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(getClass().getResource("list-view.fxml"));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        ListController cvc = root.getController();
//        cvc.setClient(student);
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//    };

}