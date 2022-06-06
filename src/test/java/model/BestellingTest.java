package model;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BestellingTest {

    Gebruiker jaap = new Gebruiker("", "", "", "", "", 6);
       Product product =Product.maakProduct("appel", 101, 0.69);
    Product product2 =Product.maakProduct("peer", 102, 0.10);
    Bestelling a = new Bestelling(jaap);

    @BeforeEach
    void before(){
        Product.maakProduct("appel", 101, 0.69);
        Gebruiker jaap = new Gebruiker("", "", "", "", "", 19);

    }

    @Test
    public void BerekenTotalePrijs(){
        a.addProduct(product);
        a.addProduct(product);
        a.addProduct(product2);
        assertEquals(1.48, a.getTotalePrijs());
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
        a.removeProduct(product);
        assertFalse(a.getWinkelmand().contains(product));
    }

    @Test
    public void getKorting() {
        a.addProduct(product);

        assertEquals(0.7, a.GetKorting());
    }
    @Test
    public void berekenPrijsMetKorting() {
        a.addProduct(product);
        a.berekenTotalePrijs();
        assertEquals(0.48, a.berekenPrijsMetKorting(), 0.1);
    }

}