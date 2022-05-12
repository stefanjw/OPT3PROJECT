package model;

import java.util.ArrayList;

public class Bestelling {

    private Product product;
    private ArrayList<Product> winkelmand;

public Bestelling(){
    winkelmand= new ArrayList<>();
}

public void getProduct(Product product){
    winkelmand.add(product);
    }

    public void RemoveProduct(Product product){
    winkelmand.remove(product);
    }


    public ArrayList<Product> getWinkelmand() {
        return winkelmand;
    }


    public Product getProduct() {
        return product;
    }



}


