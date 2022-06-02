package model;

import java.util.ArrayList;

public class Login {
    private static Login login;
    private Gebruiker ingelogdeGebruiker;
    private static ArrayList<Gebruiker> bevoegdeGebruikers = new ArrayList<>();

    public Login() {

bevoegdeGebruikers = Gebruiker.getAlleGebruikers();
    }

        // singleton een persoon ingelogd op applicatie en makkelijke aanroep andere classes.
        public static Login getInstance() {
            if (login == null) {
                login = new Login();
            }

            return login;
        }
    // methode om de actuele Gebruiker als ingelogde gebruiker te zetten
    private Boolean accountBevoegd(String username) {
        for (Gebruiker bevoegdeGebruiker : bevoegdeGebruikers) {
            if (bevoegdeGebruiker.getGebruikersnaam().equals(username)) {
                this.ingelogdeGebruiker = bevoegdeGebruiker;
                return true;
            }
        }
        return false;
    }
   // controleren of de gebruikersnaam en wachtwoord overeenkomen met de ingevulde wachtwoord en gebruikersnaam.
    public Boolean LogIn(String gebruikersnaam, String wachtwoord) {

        return accountBevoegd(gebruikersnaam) && ingelogdeGebruiker.getWachtwoord().equals(wachtwoord);


    }
    //uitloggen
    public void logUit(){
        this.ingelogdeGebruiker = null;

    }

    public Gebruiker getIngelogdeGebruiker() {
        return ingelogdeGebruiker;
    }
}
