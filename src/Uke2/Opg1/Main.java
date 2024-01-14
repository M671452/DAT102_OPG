package Uke2.Opg1;

public class Main {
    static void skrivTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] hTab = {1, 2, 3, 4};
        skrivTab(hTab);

        // a) Hva blir skrevet ut?
        // Svar: "1 2 3 4" "2 3 4 5".
        for (int i = 0; i < hTab.length; i++) {
            hTab[i]++;
        }
        skrivTab(hTab);

        // b) Hva blir skrevet ut?
        // Svar: "2 3 4 5" "1 2 3 4" "2 3 4 5".
        for (int t : hTab) {
          t++;
        }

        skrivTab(hTab);
        Heltall[] rTab = new Heltall[4];
        rTab[0] = new Heltall(1);
        rTab[1] = new Heltall(2);
        rTab[2] = new Heltall(3);
        rTab[3] = new Heltall(4);

        // c) Hvorfor fungerer ikke denne?
        // skrivTab(rTab);
        // Svar: Fordi skrivTab()-metoden kun tar inn endimensjonale heltalls-tabeller,
        // og ikke egne objekter. Må i så tilfelle endre metoden til å ta inn
        // "Hetall[] tab" istedenfor "int[] tab".

        // d) Hva blir skrevet ut?
        // Svar: "1 2 3 4" (og forsåvidt alt annet før dette).
        for (Heltall t : rTab) {
            System.out.print(t + " ");
        }
        System.out.println();

        // e) Hva blir skrevet ut?
        // Svar: "2 3 4 5" (og forsåvidt alt annet før dette).
        for (Heltall t : rTab) {
            t.inkrementer();
        }
        for (Heltall t : rTab) {
            System.out.print(t + " ");
        }
        System.out.println();
}
}
