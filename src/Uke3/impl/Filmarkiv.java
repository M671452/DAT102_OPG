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
    public Film finnfilm(int nr) {
        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {

    }

    @Override
    public boolean slettFilm(int filmnr) {
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        return new Film[0];
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        return new Film[0];
    }

    @Override
    public int antall(Film.Sjanger sjanger) {
        return 0;
    }

    @Override
    public int antall() {
        return 0;
    }
}
