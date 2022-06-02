package controller;

import controller.navigation.BonScreenNavigation;
import controller.navigation.HomeScreenNavigation;
import controller.navigation.iNavigation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import model.Bestelling;
import model.Login;
import model.Product;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ShopController implements Initializable {

    @FXML
    private AnchorPane rootPane;

        @FXML
        private TableView<Product> ArtikelenTableview;

        @FXML
        private TableColumn<Product, String> naamKolom;

        @FXML
        private TableColumn<Product, Long> artikelnummerKolom;

        @FXML
        private TableColumn<Product, String> prijsKolom;

    @FXML
    private Button BackButton;

    @FXML
    private Button addProduct;

    @FXML
    private Button GoToBonButton;



    iNavigation screen;
    private Bestelling bestelling;


    @FXML
    void GoToBon(ActionEvent event) throws IOException {
        bestelling.maakBon();
        screen = new BonScreenNavigation();
        screen.go(rootPane);

    }

    @FXML
    void GoingBackToMenu(ActionEvent event) throws IOException {
        screen = new HomeScreenNavigation();
        screen.go(rootPane);
    }

    @FXML
    void addProductToWinkelmand(ActionEvent event) {

        bestelling = new Bestelling(Login.getInstance().getIngelogdeGebruiker());
        Product product = ArtikelenTableview.getSelectionModel().getSelectedItem();
        bestelling.addProduct(product);

    }


        ObservableList<Product> list = FXCollections.observableArrayList(
                 Product.maakProduct("appel", 101, 0.69),
                Product.maakProduct("peer", 102, 0.89)
        );

    public void initialize(URL url, ResourceBundle resourceBundle) {

        naamKolom.setCellValueFactory(new PropertyValueFactory<Product, String>("naam"));
        prijsKolom.setCellValueFactory(new PropertyValueFactory<Product, String>("prijs"));
        artikelnummerKolom.setCellValueFactory(new PropertyValueFactory<Product, Long>("artikelnummer"));
        ArtikelenTableview.setItems(list);

    }
    }






