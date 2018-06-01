package Placement_Student;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main7 extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("sample7.fxml"));
        primaryStage.setTitle("Placements About");
        primaryStage.setScene(new Scene(root, 750, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}