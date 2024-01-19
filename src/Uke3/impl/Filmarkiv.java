package Uke3.impl;

import Uke3.adt.*;
import java.util.*;

public class Filmarkiv implements FilmarkivADT {
    // Objektvariabler:
    private Film[] filmer;

    // Konstruktør:
    public Filmarkiv(int antall) {
        filmer = new Film[antall];
    }

    // Metode for å endre tabell om full:
    private void utvidKapasitet() {
        Film[] nyTab = new Film[filmer.length * 2];
        nyTab = Arrays.copyOf(filmer, nyTab.length);
        filmer = nyTab;
    }

    @Override
    public Film finnFilm(int nr) {
        for (Film film : filmer) {
            if (film != null && film.getFilmnr() == nr) {
                return film;
            }
        }
        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        for (int i = 0; i < filmer.length; i++) {
            if (filmer[i] == null) {
                filmer[i] = nyFilm;
                break;
            }
        }
    }

    @Override
    public boolean slettFilm(int filmnr) {
        for (int i = 0; i < filmer.length; i++) {
            if (filmer[i].getFilmnr() == filmnr) {
                filmer[i] = null;
                for (int j = i; j < filmer.length - 1; j++) {
                    filmer[j] = filmer[j + 1];
                }
                filmer[filmer.length - 1] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        List<Film>  match = new ArrayList<>();
        for (Film film : filmer) {
            if (film.getTittel().contains(delstreng)) {
                match.add(film);
            }
        }
        return trimTab(match.toArray(new Film[match.size()]), match.size());
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        List<Film>  match = new ArrayList<>();
        for (int i = 0; i < filmer.length; i++) {
            if (filmer[i].getFilmskaper().contains(delstreng)) {
                match.add(filmer[i]);
            }
        }
        return trimTab(match.toArray(new Film[match.size()]), match.size());
    }

    @Override
    public int antall(Sjanger sjanger) {
        int antall = 0;
        for (int i = 0; i < filmer.length; i++) {
            if (filmer[i].getSjanger() == sjanger) {
                antall++;
            }
        }
        return antall;
    }

    @Override
    public int antall() {
        int antall = 0;
        for (Film film : filmer) {
            if (film != null)
                antall++;
        }
        return antall;
    }

    // Hjelpemetode for trimming av tabeller:
    private Film[] trimTab(Film[] tab, int n) {
        Film[] nyTab = new Film[n];
        int i = 0;
        while (i < n) {
            nyTab[i] = tab[i];
            i++;
        }
        return nyTab;
    }
}
