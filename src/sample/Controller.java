package sample;

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

public class Controller implements Initializable {

    @FXML
    private ImageView about;

    @FXML
    private ImageView student;

    @FXML
    private ImageView parent;

    @FXML
    private ImageView alumni;

    @FXML
    private ImageView recruiter;

    @FXML
    private ImageView stat;

    @FXML
    private ImageView back;

    @FXML
    private AnchorPane rootpane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    private void loadnext1(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Placement/Placement_About/sample2.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void loadnext2(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Placement/Placement_Student/sample7.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void loadnext3(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Placement/Placement_Parent/sample4.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void loadnext4(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Placement/Placement_Alumni/sample3.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void loadnext5(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Placement/Placement_Recruit/sample5.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void loadnext6(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Placement/Placement_Stat/sample6.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void goback(MouseEvent event) throws IOException {
        StackPane pane = FXMLLoader.load(getClass().getResource("/Welcome/Welcome.fxml)"));
        rootpane.getChildren().setAll(pane);

    }
}