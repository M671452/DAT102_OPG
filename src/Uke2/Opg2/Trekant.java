package Uke2.Opg2;

import Uke2.Opg2.Figur;

public class Trekant implements Figur {
    private int sidelengde;

    public Trekant(int sidelengde) {
        this.sidelengde = sidelengde;
    }

    @Override
    public double areal() {
        return 0.5 * sidelengde * sidelengde;
    }

    @Override
    public void tegn() {
        for (int i = 1; i <= sidelengde; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
