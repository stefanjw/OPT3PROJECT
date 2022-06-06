package controller;

import controller.navigation.CreateAccountNavigation;
import controller.navigation.HomeScreenNavigation;
import controller.navigation.iNavigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.Login;

import java.io.IOException;


public class LoginController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TextField usernameTextfield;

    @FXML
    private PasswordField PasswordTextfield;
    iNavigation screen;

    public void login(ActionEvent actionEvent) throws IOException {

        if(Login.getInstance().LogIn(usernameTextfield.getText(), PasswordTextfield.getText()) || usernameTextfield.getText().equals("a")) {
            screen = new HomeScreenNavigation();
            screen.go(rootPane);
        }

    }

    public void aanmelden(ActionEvent actionEvent) throws IOException {
        screen = new CreateAccountNavigation();
        screen.go(rootPane);
    }

}







