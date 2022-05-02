package controller.navigation;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public interface iNavigation {
    void go(AnchorPane rootPane) throws IOException;
}