package Welcome;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Welcome extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {

        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("Welcome.fxml")), 1400, 700);
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
