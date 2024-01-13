package Uke2.Opg2;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Rektangel r = new Rektangel(2, 3);
        r.tegn();

        Trekant t = new Trekant(3);
        t.tegn();

        ArrayList<Figur> liste = new ArrayList<>();
        liste.add(0, new Rektangel(5, 5));
        liste.add(1, new Trekant(3));

        for(int i = 0; i < liste.size(); i++) {
            liste.get(i).tegn();
            System.out.println();
        }
    }
}
