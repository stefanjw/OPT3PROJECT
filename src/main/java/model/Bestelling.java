package model;

import java.util.ArrayList;

public class Bestelling {



    private Gebruiker besteller;
    private Product product;
    private ArrayList<Product> winkelmand;
    private double totalePrijs;
    Korting korting;


    public Bestelling(Gebruiker besteller) {
        this.besteller = besteller;

        winkelmand = new ArrayList<>();
    }

    // totale prijs van de bestelling berekenen
    public double berekenTotalePrijs() {
        for (Product product : winkelmand) {
            totalePrijs += product.getPrijs();

        }
        return totalePrijs;
    }
    //product toevoegen aan de winkelmand van een Gebruiker.
    public void addProduct(Product product) {
        winkelmand.add(product);
    }

    public void RemoveProduct(Product product) {
        winkelmand.remove(product);
    }


    public ArrayList<Product> getWinkelmand() {
        return winkelmand;
    }


    public Double GetKorting() {

        if (besteller.getLeeftijd() < 18) {
            korting = new kortingOnder18();
            return korting.geefKoring();
        }
        if (besteller.getLeeftijd() > 65) {
            korting = new kortingBoven65();
            return korting.geefKoring();
        } else {
            korting = new AantalProductenKorting(this);
            return korting.geefKoring();
        }
    }
      public void maakBon(){

        Bon bon = new Bon(this);
        bon.printBon();
        Login.getInstance().getIngelogdeGebruiker().addBon(bon);

        }
    public Gebruiker getBesteller() {
        return besteller;
    }



}


