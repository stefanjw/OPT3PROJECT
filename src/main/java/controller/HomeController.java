package controller;

import controller.navigation.LoginScreenNavigation;
import controller.navigation.iNavigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HomeController {

    @FXML
    private AnchorPane rootPane;
    private iNavigation screen;
    public void back(ActionEvent actionEvent) throws IOException {
        screen = new LoginScreenNavigation();
        screen.go(rootPane);

    }

}
