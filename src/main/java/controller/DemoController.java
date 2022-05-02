package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DemoController implements Initializable {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private ListView<?> personListView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
