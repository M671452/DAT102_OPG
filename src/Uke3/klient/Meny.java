package Uke3.klient;

import Uke3.adt.FilmarkivADT;

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
// legg inn en del forhåndsdefinerte filmer for å teste metodene
// ..
// TODO
    }
}
