package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {




    @Test
    void logIn() {
        Gebruiker a = new Gebruiker("jaap", "d");
      Login log = new Login();
      assertEquals("jaap", log.getIngelogdeGebruiker().getGebruikersnaam());



    }
}