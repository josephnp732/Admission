package Intro;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Intro_Controller implements Initializable {

    @FXML
    private ImageView welcome;

    @FXML
    private AnchorPane rootpane;

    @FXML
    private void welcome(MouseEvent event) throws IOException {
        StackPane pane = FXMLLoader.load(getClass().getResource("/Welcome/Welcome.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
