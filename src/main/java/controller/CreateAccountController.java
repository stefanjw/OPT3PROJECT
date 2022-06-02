
package controller;


import controller.navigation.LoginScreenNavigation;
import controller.navigation.iNavigation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.Gebruiker;

import java.io.IOException;

public class CreateAccountController {



    @FXML
    private Text ErrorMessage;

    @FXML
    private AnchorPane rootPane;

    @FXML
    private Button SubmitButton;

    @FXML
    private TextField voornaamText;

    @FXML
    private TextField achternaamText;

    @FXML
    private TextField EmailText;

    @FXML
    private TextField GebruikersnaamText;

    @FXML
    private TextField leeftijdText;

    @FXML
    private TextField WachtwoordText;
    iNavigation screen;


    public boolean checkIfEmpty() {
        return voornaamText.getText().isEmpty() ||
        achternaamText.getText().isEmpty() ||
        EmailText.getText().isEmpty() ||
        leeftijdText.getText().isEmpty() ||
                GebruikersnaamText.getText().isEmpty() ||
                WachtwoordText.getText().isEmpty();

    }
    public void GoestoLoginMenu(javafx.event.ActionEvent actionEvent) throws IOException {

        if(!checkIfEmpty() && Gebruiker.checkGebruikersnaam(GebruikersnaamText.getText()) ) {

            new Gebruiker(GebruikersnaamText.getText(), WachtwoordText.getText(), voornaamText.getText(), achternaamText.getText(), EmailText.getText(), Integer.parseInt(leeftijdText.getText()));
            screen = new LoginScreenNavigation();
            screen.go(rootPane);
        }
        else{
            ErrorMessage.setText("U heeft niet alle velden ingevuld!");
        }
    }



}






