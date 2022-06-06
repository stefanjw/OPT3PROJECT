package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class KortingTest {
    Gebruiker nieuw = new Gebruiker("", "", "", "","",9);



    @Test
    public void testSetKorting() {
        nieuw = Login.getInstance().getIngelogdeGebruiker();

    }

    @Test
    public void berekenKoringBoven() {
        KortingBoven65 b = new KortingBoven65();
        b.BerekenKorting();
        assertEquals(0.8, b.geefKoring(), 0.0);
    }

    @Test
    public void berekenKoringOnder() {
        Korting b = new KortingOnder18();
        b.BerekenKorting();
        assertEquals(0.7, b.geefKoring(), 0.0);

    }

     @Test
    public void geefKOrting() {

        Bestelling a = new Bestelling(nieuw);
        var prod1 = Product.maakProduct("appel", 101, 3.0);
       var prod2= Product.maakProduct("peer", 10, 3.0);
        a.addProduct(prod1);
        AantalProductenKorting c = new AantalProductenKorting(a);

  assertEquals(1.0, c.geefKoring(), 0.0);
  a.addProduct(prod1);
  a.addProduct(prod1);
  assertEquals(0.8, c.geefKoring(), 0.0);
  a.addProduct(prod1);
  a.addProduct(prod1);
  assertEquals(0.6, c.geefKoring(), 0.0);

    }




}