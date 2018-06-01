package Departments.Dept;

import Welcome.Welcome;
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

public class Department_Controller implements Initializable {

    @FXML
    private ImageView ise;

    @FXML
    private ImageView cse;

    @FXML
    private ImageView tce;

    @FXML
    private ImageView ece;

    @FXML
    private ImageView eee;

    @FXML
    private ImageView mech;

    @FXML
    private ImageView civil;

    @FXML
    private ImageView back;

    @FXML
    private AnchorPane rootpane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Do Nothing here

    }

    @FXML
    private void loadnext_civil(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Departments/Dept_Civil/Civil.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void loadnext_ece(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Departments/Dept_ECE/ECE.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void loadnext_tce(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Departments/Dept_TCE/TCE.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void loadnext_cse(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Departments/Dept_CSE/CSE.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void loadnext_ise(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Departments/Dept_ISE/ISE.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void loadnext_mech(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Departments/Dept_Mech/Mech.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void loadnext_eee(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/Departments/Dept_EEE/EEE.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void goback(MouseEvent event) throws IOException {
        StackPane pane = FXMLLoader.load(getClass().getResource("/Welcome/Welcome.fxml"));
        System.out.println("Hello");
        rootpane.getChildren().setAll(pane);

    }

}