package controller;

import controller.navigation.LoginScreenNavigation;
import controller.navigation.ShopNavigation;
import controller.navigation.iNavigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HomeController {

    @FXML
    private Button ShopButton;

    @FXML
    private AnchorPane rootPane;
    private iNavigation screen;

    public void back(ActionEvent actionEvent) throws IOException {
        screen = new LoginScreenNavigation();
        screen.go(rootPane);
    }
    @FXML
    void GoToShop(ActionEvent event) throws IOException {
        screen = new ShopNavigation();
        screen.go(rootPane);

    }

}
