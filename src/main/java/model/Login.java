package model;

import java.util.ArrayList;

public class Login {

    private Gebruiker ingelogdeGebruiker;
    private static ArrayList<Gebruiker> bevoegdeGebruikers = new ArrayList<>();

    public Login() {

bevoegdeGebruikers = Gebruiker.getAlleGebruikers();
    }

    private Boolean accountBevoegd(String username) {
        for (Gebruiker bevoegdeGebruiker : bevoegdeGebruikers) {
            if (bevoegdeGebruiker.getGebruikersnaam().equals(username)) {
                this.ingelogdeGebruiker = bevoegdeGebruiker;
                return true;
            }
        }
        return false;
    }

    public Boolean LogIn(String gebruikersnaam, String wachtwoord) {

        return accountBevoegd(gebruikersnaam) && ingelogdeGebruiker.getWachtwoord().equals(wachtwoord);


    }

    public Gebruiker getIngelogdeGebruiker() {
        return ingelogdeGebruiker;
    }
}
