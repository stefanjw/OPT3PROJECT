package model;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BestellingTest {

    Gebruiker jaap = new Gebruiker("", "", "", "", "", 19);
       Product product =Product.maakProduct("appel", 101, 0.69);
    Bestelling a = new Bestelling(jaap);

    @BeforeEach
    void before(){
        Product.maakProduct("appel", 101, 0.69);
        Gebruiker jaap = new Gebruiker("", "", "", "", "", 19);

    }

    @Test
     public void addProduct() {
      a.addProduct(product);

      assertTrue(a.getWinkelmand().contains(product));

    }
    @Test
    public void removeProduct() {
        a.addProduct(product);
        assertTrue(a.getWinkelmand().contains(product));
        a.RemoveProduct(product);
        assertFalse(a.getWinkelmand().contains(product));
    }

    @Test
    public void getKorting() {

    }
}