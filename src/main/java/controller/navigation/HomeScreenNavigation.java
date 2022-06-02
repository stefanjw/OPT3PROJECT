package controller.navigation;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HomeScreenNavigation implements iNavigation {


    @Override
    public void go(AnchorPane rootPane) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/HomeScreen.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    }

