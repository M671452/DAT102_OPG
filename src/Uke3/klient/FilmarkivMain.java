package Uke3.klient;

import Uke3.adt.FilmarkivADT;
import Uke3.impl.*;

public class FilmarkivMain {
    public static void main(String[] args) {
        FilmarkivADT filma = new Filmarkiv(100);
        Meny meny = new Meny(filma);
        meny.start();
    }
}
