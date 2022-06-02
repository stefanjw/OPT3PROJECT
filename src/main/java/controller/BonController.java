package controller;

import controller.navigation.ShopNavigation;
import controller.navigation.iNavigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import model.Bon;
import model.Gebruiker;
import model.Login;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class BonController implements Initializable {
    iNavigation screen;
    Bon bon;
    Gebruiker gebruiker;

        @FXML
        private AnchorPane rootPane;

        @FXML
        private Text bonText;

        @FXML
        private Button backToShop;

        @FXML
        void backToShop(ActionEvent event) throws IOException {
            screen = new ShopNavigation();
            screen.go(rootPane);


    }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        int i = Login.getInstance().getIngelogdeGebruiker().getBonnen().size() - 1;
         bonText.setText(Login.getInstance().getIngelogdeGebruiker().getBonnen().get(i).printBon());

    }

}
