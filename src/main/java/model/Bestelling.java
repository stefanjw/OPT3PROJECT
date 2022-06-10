package model;

import java.util.ArrayList;

public class Bestelling {
    private Gebruiker besteller;
    private ArrayList<Product> winkelmand;
    private double totalePrijs = 0;
    private double prijsMetKorting=0;
    Korting korting;
    Bon bon;


    public Bestelling(Gebruiker besteller) {
        this.besteller = besteller;

        this.winkelmand = new ArrayList<>();
    }

    // totale prijs van de bestelling berekenen
    public void berekenTotalePrijs() {
        for (Product product : winkelmand) {
            totalePrijs +=  product.getPrijs();
        }
    }
    public void berekenTotalePrijsMetKorting() {
        besteller.getLeeftijd();
        prijsMetKorting = getTotalePrijs()*getKorting();
        prijsMetKorting = Math.round(prijsMetKorting*100);
        prijsMetKorting = prijsMetKorting /100;

    }
    public double getTotalePrijsMetKorting(){
        return prijsMetKorting;
    }



    public double getTotalePrijs(){
        return totalePrijs;
    }

    //product toevoegen aan de winkelmand van een Gebruiker.
    public void addProduct(Product product) {
        this.winkelmand.add(product);
    }

    public void removeProduct(Product product) {
        this.winkelmand.remove(product);
    }


    public ArrayList<Product> getWinkelmand() {
        return winkelmand;
    }


    public double getKorting() {

        if (besteller.getLeeftijd() < 18) {
            korting = new KortingOnder18();
            korting.BerekenKorting();
            return korting.geefKoring();
        }
        if (besteller.getLeeftijd() > 65) {
            korting = new KortingBoven65();
            korting.BerekenKorting();
            return korting.geefKoring();
        }
        else {
            korting = new AantalProductenKorting(this);
            korting.BerekenKorting();
            return korting.geefKoring();
        }
    }

    public Bon getBonWithBtw(){
        return new BonWithBtw(this);
    }
    public Bon getBonWithoutBtw(){
        return new BonWithoutBtw(this);
    }

      public void maakBon(){
        berekenTotalePrijs();
        berekenTotalePrijsMetKorting();
        if(besteller.getLeeftijd()<18){
             bon= new BonWithoutBtw(this);
        }
        else{
           bon= new BonWithBtw(this);
        }
        bon.printBon();
        Login.getInstance().getIngelogdeGebruiker().addBon(bon);

        }
    public Gebruiker getBesteller() {
        return besteller;
    }

    public double berekenPrijsMetKorting(){
        return getTotalePrijs() * getKorting();
    }
}


