package model;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class BestellingTest {

    Gebruiker jaap = new Gebruiker("", "", "", "", "", 6);
    Product product =Product.maakProduct("appel", 10, 0.69);
    Product product2 =Product.maakProduct("peer", 11, 0.10);
    Bestelling a = new Bestelling(jaap);



    @Test
    public void BerekenTotalePrijs(){
        a.addProduct(product);
        a.addProduct(product2);
        a.berekenTotalePrijs();

        assertEquals(0.79, a.getTotalePrijs(), 0.01);

    }
    @Test
    public void BerekenTotalePrijsMetKorting(){
        a.addProduct(product);
        a.addProduct(product2);
        a.berekenTotalePrijs();
        a.berekenTotalePrijsMetKorting();
        assertEquals(0.55, a.getTotalePrijsMetKorting(), 0.01);
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
        assertEquals(0.7, a.getKorting());
    }



}