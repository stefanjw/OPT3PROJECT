package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class KortingTest {



    @Test
    public void testSetKorting() {
        Bestelling a = new Bestelling();
        ;
    }

    @Test
    public void berekenKoring() {
    }

    @Test
    public void geefKOrting() {

        Bestelling a = new Bestelling();
        var prod1 = Product.maakProduct("appel", 101, 3.0);
       var prod2= Product.maakProduct("peer", 10, 3.0);
        a.getProduct(prod1);
        Korting b = new Korting(a);

  assertEquals(1.0, b.checkProducten(), 0.0);
  a.getProduct(prod1);
  a.getProduct(prod1);
  assertEquals(0.8, b.checkProducten(), 0.0);
  a.getProduct(prod1);
  a.getProduct(prod1);
  assertEquals(0.6, b.checkProducten(), 0.0);



    }
}