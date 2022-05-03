package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GebruikerTest {

    @Test
    void zoekGebruiker() {
        Gebruiker.opslaanGebruiker(new Gebruiker("jaap", "86"));
        assertNotNull(Gebruiker.ZoekGebruiker("jaap"));
    }

    @Test
    void checkGebruikersnaam() {
        Gebruiker a = new Gebruiker("jaap", "lol");
        assertEquals("jaap", a.getGebruikersnaam());
    }

    @Test
    void verwijderAccount() {
        Gebruiker a = new Gebruiker("jaap", "lol");
        a.verwijderAccount();
        assertNull(Gebruiker.ZoekGebruiker("jaap"));
        Gebruiker b = new Gebruiker("henk", "lol");
        assertNotNull(Gebruiker.ZoekGebruiker("henk"));
    }

}