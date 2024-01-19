package Uke3.test;

import Uke3.impl.*;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class FilmarkivTest {
    Filmarkiv arkiv;

    @BeforeEach
    public void oppsett() {
        arkiv = new Filmarkiv(10);
        arkiv.leggTilFilm(new Film(1, 1999, "Ola Nordmann", "The Movie", "Paramount", Sjanger.ANIMATION));
        arkiv.leggTilFilm(new Film(2, 2000, "Olav Nilsen", "Gunshot", "Valve Movies AS", Sjanger.ACTION));
        arkiv.leggTilFilm(new Film(3, 2021, "Pernille Myking", "The Guy", "Dreamworks", Sjanger.COMEDY));
        arkiv.leggTilFilm(new Film(4, 1950, "Benedicte Olsen", "The Computer Revolution", "Disney", Sjanger.DOCUMENTARY));
        arkiv.leggTilFilm(new Film(5, 2023, "Olaug Jacobsen", "Dragon Attack", "Rushmore", Sjanger.FANTASY));
    }

    @Test
    public void testFinnFilm() {
        Film forventet = new Film(1, 1999, "Ola Nordmann", "The Movie", "Paramount", Sjanger.ANIMATION);
        Film resultat = arkiv.finnFilm(1);
        assertEquals(forventet, resultat);
    }

    @Test
    public void testLeggTilFilm() {
        Film forventet = new Film(6, 2021, "Kari Olsen", "Keyboard", "HBO MAX", Sjanger.ROMANCE);
        arkiv.leggTilFilm(forventet);
        Film resultat = arkiv.finnFilm(6);
        assertEquals(forventet, resultat);
    }


    @Test
    public void testSlettFilm() {
        boolean forventet = true;
        boolean resultat = arkiv.slettFilm(2);
        assertEquals(forventet, resultat);
        assertNull(arkiv.finnFilm(2));
    }


}
