package model;

import java.util.ArrayList;

public class Gebruiker {

    private String Gebruikersnaam;
    private String wachtwoord;
    private String naam;
    private String Achternaam;
    private String email;
    private static ArrayList<Gebruiker> alleGebruikers = new ArrayList<>();

    public Gebruiker(String Gebruikersnaam, String wachtwoord ){
        this.Gebruikersnaam=getGebruikersnaam();
        this.wachtwoord=wachtwoord;
     alleGebruikers.add(this);
    }

    public String getGebruikersnaam() {
        return Gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public Gebruiker ZoekGebruiker(String Gebruikersnaam){
          for(Gebruiker a : alleGebruikers){
             if(Gebruikersnaam.equals(a.Gebruikersnaam)){
                 return a;
             }
          }
          return null;
    }

    public static Boolean checkGebruikersnaam(String gebruiksnaam){
        for (Gebruiker a : alleGebruikers) {
            if (a.getGebruikersnaam().equals(gebruiksnaam)){
                return false;
            }
        }
        return true;
    }

    public void verwijderAccount(){
          alleGebruikers.remove(this);
    }
}
