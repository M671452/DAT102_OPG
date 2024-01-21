package Uke3.klient;

import Uke3.impl.*;
import Uke3.adt.FilmarkivADT;
import java.util.*;

public class Tekstgrensesnitt  {

    // Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt
    public Film lesFilm(){
        Scanner les = new Scanner(System.in);

        System.out.println("Skriv inn film nummer: ");
        int filmNr = les.nextInt();
        les.nextLine();

        System.out.println("Skriv inn utgivelsesår: ");
        int utgivelse = les.nextInt();
        les.nextLine();

        System.out.println("Skriv inn filmskaper: ");
        String filmSkaper = les.nextLine();

        System.out.println("Skriv inn film tittel: ");
        String tittel = les.nextLine();

        System.out.println("Skriv inn filmselskap: ");
        String selskap = les.nextLine();

        System.out.println("Skriv inn sjanger: ");
        Sjanger sjanger = Sjanger.valueOf(les.nextLine().toUpperCase());

        return (new Film(filmNr, utgivelse, filmSkaper, tittel, selskap, sjanger));
    }

    // Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
    public static void skrivUtFilm(Film film) {
        System.out.println("Filmnr.: " + film.getFilmnr() +
                "\nLanseringsår: " + film.getLanseringsAar() +
                "\nFilmskaper: " + film.getFilmskaper() +
                "\nTittel: " + film.getTittel() +
                "\nFilmselskap: " + film.getFilmSelskap() +
                "\nSjanger: " + film.getSjanger());
    }

    // Skriver ut alle filmer med en spesiell delstreng i tittelen
    public static void skrivUtFilmDelstrengITittel(FilmarkivADT arkiv, String delstreng) {
        Film[] filmer = arkiv.soekTittel(delstreng);
        for (Film film : filmer) {
                skrivUtFilm(film);
        }
    }
    // Skriver ut alle filmer av en produsent (produsent er delstreng)
    public void skrivUtFilmProdusent(FilmarkivADT arkiv, String delstreng) {
        Film[] filmer = arkiv.soekProdusent(delstreng);
        for (Film film : filmer) {
            skrivUtFilm(film);
        }
    }

    // Skriver ut en enkel statistikk som inneholder antall filmer totalt
    // og hvor mange det er i hver sjanger.
    public void skrivUtStatistikk(FilmarkivADT arkiv) {
        int totAnt = arkiv.antall();

    }
}

