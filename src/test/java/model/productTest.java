package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class productTest {
    Product a = new Product("broek", 2, 20.00);

    @Test
     void getProducten() {

assertTrue(Product.getProduct(2).equals(a));


    }



    @Test
    void verwijderProducten() {
    }
}