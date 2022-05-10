package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    Gebruiker a = new Gebruiker("goed", "goed");
    Gebruiker b = new Gebruiker("jaap " , "jaap");
    Login log = new Login();

    @Test
    void logIn() {

        // condition coverage
       assertFalse(log.LogIn("fout", "goed"));
       assertFalse(log.LogIn("goed", "fout"));
    }
    @Test
    void logIn2() {
        //descision coverage
        assertFalse(log.LogIn("jaap", "goed"));
        assertTrue(log.LogIn("goed", "goed"));

    }
    @Test
    void logIn3() {

        //condition/decision coverage
        assertFalse(log.LogIn("fout", "fout"));
        assertTrue(log.LogIn("goed", "goed"));

    }
    @Test
    void logIn4() {
        //modified condition/decision coverage
        assertFalse(log.LogIn("fout", "goed"));
        assertFalse(log.LogIn("goed", "fout"));
        assertTrue(log.LogIn("goed", "goed"));
    }
    @Test
    void logIn5() {
        //multiple condition coverage
        assertFalse(log.LogIn("fout", "fout"));
        assertFalse(log.LogIn("fout", "goed"));
        assertFalse(log.LogIn("goed", "fout"));
        assertTrue(log.LogIn("goed", "goed"));

    }



}