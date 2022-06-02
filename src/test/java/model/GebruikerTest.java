package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GebruikerTest {

    Gebruiker a = new Gebruiker("jaap", "lol", "","", "", 19);
    @Test
    void zoekGebruiker() {
        Gebruiker.opslaanGebruiker(new Gebruiker("jaap", "86", "", "", "", 19));
        assertNotNull(Gebruiker.ZoekGebruiker("jaap"));
        assertNull((Gebruiker.ZoekGebruiker("Roos")));
    }

    @Test
    void checkGebruikersnaam() {

        assertEquals("jaap", a.getGebruikersnaam());
    }

    @Test
    void verwijderAccount() {

        a.verwijderAccount();
        assertNull(Gebruiker.ZoekGebruiker("jaap"));
        Gebruiker b = new Gebruiker("henk", "lol", "", "", "",70);
        assertNotNull(Gebruiker.ZoekGebruiker("henk"));
    }

}