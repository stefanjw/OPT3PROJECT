
package controller;

import controller.navigation.HomeScreenNavigation;
import controller.navigation.LoginScreenNavigation;
import controller.navigation.iNavigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import model.*;

import java.io.IOException;


class CreateAccountController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button SubmitButton;

    private iNavigation screen;


    public void GoestoLoginMenu(ActionEvent actionEvent) throws IOException {
        screen = new LoginScreenNavigation();
        screen.go(rootPane);

        }


    }
