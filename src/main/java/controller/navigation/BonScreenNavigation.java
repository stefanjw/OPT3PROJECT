package controller.navigation;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class BonScreenNavigation implements iNavigation {


    @Override
    public void go(AnchorPane rootPane) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/BonScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}
