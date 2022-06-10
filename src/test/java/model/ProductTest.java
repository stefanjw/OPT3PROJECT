package model;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ProductTest {
    Product product;
    Product a = Product.maakProduct("peer", 101, 0.69);



    @Test
    public void getNaam() {
        assertEquals("peer", a.getNaam());
    }


    @Test
    public void getProduct(){

        Product b = Product.maakProduct("appel", 101, 0.69);
        assertFalse(product.getProductenLijst().contains(b));
        assertTrue(product.getProductenLijst().contains(a));

    }

    @Test
     public void maakProduct() {
       assertTrue(product.getProductenLijst().contains(a));



    }


}