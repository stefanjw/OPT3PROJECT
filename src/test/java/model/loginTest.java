package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {


    @Test
    void logIn() {
        Gebruiker a = new Gebruiker("r", "g");

      Login log = new Login();

      assertEquals("r", log.getIngelogdeGebruiker().getGebruikersnaam());

    }
}