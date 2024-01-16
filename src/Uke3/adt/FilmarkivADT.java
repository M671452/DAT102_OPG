package Uke3.adt;

import Uke3.impl.*;

public interface FilmarkivADT {
    /**
     * Hente en film med gitt nr fra arkivet.
     * @param nr nummer på film som skal hentes.
     * @return film med gitt nr. Om nr ikke finnes, returneres null.
     */
    Film finnfilm(int nr);

    /**
     * Legger til en ny film.
     * @param nyFilm
     */
    void leggTilFilm(Film nyFilm);

    /**
     * Sletter en fil med gitt nr.
     * @param filmnr nr på film som skal slettes.
     * @return true dersom filmen ble slettet, false ellers.
     */
    boolean slettFilm(int filmnr);

    /**
     * Søker og henter filmer meden gitt delstreng i tittelen.
     * @param delstreng som må være i tittel.
     * @return tabell med filmer som har delstreng i tittel.
     */
    Film[] soekTittel(String delstreng);

    /**
     * Søker og henter filmer med et gitt delstreng i filmprodusent.
     * @param delstreng
     * @return tabell
     */
    Film[] soekProdusent(String delstreng);

    /**
     * Finner antall filmer med en gitt sjanger.
     * @param sjanger
     * @return antall filmer av en gitt sjanger.
     */
    int antall(Film.Sjanger sjanger);

    /**
     * @return antall filmer i arkivet
     */
    int antall();
}
