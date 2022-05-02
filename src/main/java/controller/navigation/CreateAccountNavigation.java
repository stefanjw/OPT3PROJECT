package controller.navigation;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CreateAccountNavigation implements iNavigation {

    @Override
    public void go(AnchorPane rootPane) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/CreateAccount.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}
