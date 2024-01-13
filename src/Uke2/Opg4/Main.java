package Uke2.Opg4;
import java.util.*;
public class Main {
    // Hashsets er uorganisert (framfor lists).
    // I tillegg oppstår kun like elementer en gang.
    public static void main(String[] args) {
        // a)
        Set<String> mengde1 = new HashSet<>(Arrays.asList("Kåre", "Emil", "Victoria", "Pernille"));
        Set<String> mengde2 = new HashSet<>(Arrays.asList("Pernille", "Thomas", "Astrid", "Olav"));

        for(String i : mengde1) {
            System.out.println(i);
        }

        for(String i : mengde2) {
            System.out.println(i);
        }

        // b)
        // Beholder kun mengdene som finnes begge steder:
        Set<String> snitt = new HashSet<>(mengde1);
        snitt.retainAll(mengde2);
        System.out.println(snitt);

        // c)
        // Med union beholder vi alle elementene til begge mengdene,
        // unntatt ekstra kopier av dem:
        Set<String> union = new HashSet<>(mengde1);
        union.addAll(mengde2);
        System.out.println(union);
    }
}
