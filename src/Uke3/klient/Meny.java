package Uke3.klient;

import Uke3.adt.FilmarkivADT;
import Uke3.impl.*;

public class Meny {
    // Objektvariabler:
    private Tekstgrensesnitt tekstgr;
    private FilmarkivADT filmarkiv;

    // Konstruktører:
    public Meny(FilmarkivADT filmarkiv){
        tekstgr = new Tekstgrensesnitt();
        this.filmarkiv = filmarkiv;
    }
    public void start(){
        filmarkiv.leggTilFilm(new Film(1, 2019, "John Johnson", "Capabara", "Paramount", Sjanger.CRIME));
        filmarkiv.leggTilFilm(new Film(2, 2000, "Olav Nilsen", "Gunshot", "Valve Movies AS", Sjanger.ACTION));
        filmarkiv.leggTilFilm(new Film(3, 2021, "Pernille Myking", "The Guy", "Dreamworks", Sjanger.COMEDY));
        filmarkiv.leggTilFilm(new Film(4, 1950, "Benedicte Olsen", "The Computer Revolution", "Disney", Sjanger.DOCUMENTARY));
        filmarkiv.leggTilFilm(new Film(5, 2023, "Olaug Jacobsen", "Dragon Attack", "Rushmore", Sjanger.FANTASY));
    }
}
