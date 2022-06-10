package model;

import java.util.ArrayList;

public class Product {

    private String naam;
    private long artikelnummer;
    private double prijs;
    private static ArrayList<Product> productenLijst = new ArrayList<>();

    public Product(String naam, long artikelnummer, double prijs){
        this.naam= naam;
        this.artikelnummer= artikelnummer;
        this.prijs=prijs;
        productenLijst.add(this);

    }
    public String getNaam() {
        return naam;
    }

    public long getArtikelnummer() {
        return artikelnummer;
    }

    public double getPrijs() {
        return prijs;
    }

    public static ArrayList<Product> getProductenLijst() {
        return productenLijst;
    }


    //product ophalen
    static Product getProduct(long artikelnummer){
        for(Product a : productenLijst)
        if(a.getArtikelnummer() == artikelnummer){
            return a;
        }
        return null;
    }

   //product aanmaken
    public static Product maakProduct(String naam, long artikelnummer, double prijs){
        if(getProduct(artikelnummer)==null) {
            return new Product(naam, artikelnummer, prijs);
        }
        return  null;
    }
// product verwijderen
    private Product VerwijderProduct(long artikelnummer){
        for(Product a : productenLijst)
            if(a.getArtikelnummer() == artikelnummer){
                productenLijst.remove(a);
            }
        return null;
    }

    public String toString() {
        return "Naam = " + this.naam + "            Prijs = " + this.prijs+ "\n";
    }
}
