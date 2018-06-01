package Welcome;

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

public class Welcome_Controller implements Initializable {

    @FXML
    private ImageView placement;

    @FXML
    private ImageView department;

    @FXML
    private ImageView back;

    @FXML
    private StackPane rootpane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void load_sample(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void load_department(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Departments/Dept/Department.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void goback(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Intro/Intro.fxml"));
        rootpane.getChildren().setAll(pane);

    }
}
