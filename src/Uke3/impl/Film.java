package Uke3.impl;

import java.util.*;

public class Film {
    // Objektvariabler:
    private int filmnr; // Unik ID
    private int lanseringsAar;
    private String filmskaper;
    private String tittel;
    private String filmSelskap;
    private Sjanger sjanger;

    // Konstruktør:
    public Film (int filmnr, int lanseringsAar, String filmskaper, String tittel, String filmSelskap, Sjanger sjanger) {
        this.filmnr = filmnr;
        this.lanseringsAar = lanseringsAar;
        this.filmskaper = filmskaper;
        this.tittel = tittel;
        this.filmSelskap = filmSelskap;
        this.sjanger = sjanger;
    }

    // Tom versjon:
    public Film() {
        this(0, 0, "", "", "", null);
    }

    // Get- og set-metoder:
    public int getFilmnr() {
        return filmnr;
    }

    public void setFilmnr(int filmnr) {
        this.filmnr = filmnr;
    }

    public int getLanseringsAar() {
        return lanseringsAar;
    }

    public void setLanseringsAar(int lanseringsAar) {
        this.lanseringsAar = lanseringsAar;
    }

    public String getFilmskaper() {
        return filmskaper;
    }

    public void setFilmskaper(String filmskaper) {
        this.filmskaper = filmskaper;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public String getFilmSelskap() {
        return filmSelskap;
    }

    public void setFilmSelskap(String filmSelskap) {
        this.filmSelskap = filmSelskap;
    }

    public Sjanger getSjanger() {
        return sjanger;
    }

    public void setSjanger(Sjanger sjanger) {
        this.sjanger = sjanger;
    }

    // Equals- og hashCode-metoder:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return filmnr == film.filmnr;
    }

    @Override
    public int hashCode() {
        return Objects.hash(filmnr);
    }
}
