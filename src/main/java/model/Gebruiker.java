package model;

import java.util.ArrayList;

public class Gebruiker {

    private String Gebruikersnaam;
    private String wachtwoord;
    private int leeftijd;



    private String naam;



    private String achternaam;
    private String email;
    private ArrayList bonnen = new ArrayList();



    private static ArrayList<Gebruiker> alleGebruikers = new ArrayList<>();

    public Gebruiker(String Gebruikersnaam, String wachtwoord, String naam, String achternaam, String email, int leeftijd) {
        this.Gebruikersnaam = Gebruikersnaam;
        this.wachtwoord = wachtwoord;
        this.naam = naam;
        this.achternaam = achternaam;
        this.email = email;
        this.leeftijd = leeftijd;
        opslaanGebruiker(this);
    }

    public String getGebruikersnaam() {
        return Gebruikersnaam;
    }

    public static ArrayList<Gebruiker> getAlleGebruikers() {
        return alleGebruikers;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }



    public static Gebruiker ZoekGebruiker(String Gebruikersnaam) {
        for (Gebruiker a : alleGebruikers) {
            if (Gebruikersnaam.equals(a.Gebruikersnaam)) {
                return a;
            }
        }
        return null;
    }
    public void addBon(Bon bon){
        bonnen.add(bon);

    }
    public ArrayList<Bon> getBonnen() {
        return bonnen;
    }

    //check of er al een acount is met dezelfde gebruikersnaam.
    public static Boolean checkGebruikersnaam(String gebruiksnaam) {
        for (Gebruiker a : alleGebruikers) {
            if (a.getGebruikersnaam().equals(gebruiksnaam)) {
                return false;
            }
        }
        return true;
    }

    public void verwijderAccount() {
        alleGebruikers.remove(this);
    }


    public static void opslaanGebruiker(Gebruiker gebruiker) {
        alleGebruikers.add(gebruiker);
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String toString(){
        return "naam: " + naam +" "+ achternaam +
                "leeftijd: " + leeftijd +
                "email: " + email;

    }
    public String getAchternaam() {
        return achternaam;
    }
    public String getNaam() {
        return naam;
    }
}
