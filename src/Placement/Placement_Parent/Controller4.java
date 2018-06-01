package Placement_Parent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller4 implements Initializable {

    @FXML
    WebView webview = new WebView();

    String filePath = new File("").getAbsolutePath();
    public File f = new File(filePath+"\\src\\HTML\\Parent\\Parent.html");

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        WebEngine webEngine = webview.getEngine();
        webEngine.load(f.toURI().toString());
        //webEngine.load("https://www.cmrit.ac.in/placements/placements-parents/");
    }

    @FXML
    private ImageView back;

    @FXML
    private AnchorPane rootpane;

    @FXML
    private void goback(MouseEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sample/sample.fxml"));
        rootpane.getChildren().setAll(pane);

    }

}
