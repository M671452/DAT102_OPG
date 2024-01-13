package Uke2.Opg8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // d)
        List<NettStudent> s = new ArrayList<>();

        s.add(new NettStudent("667654", "Ola", "Jacobsen", "Oslo", "Oslo"));
        s.add(new NettStudent("657454", "Kari", "Nordmann", "Bergen", "Bergen"));
        s.add(new NettStudent("54353", "Per", "Myking", "Oslo", "Oslo"));
        s.add(new NettStudent("749454", "Pål", "Sørensen", "Stavanger", "Stavanger"));
        s.add(new NettStudent("345345", "Nils", "Hansen", "Bergen", "Bergen"));

        Set<String> hjemby = new HashSet<>();
        for(NettStudent i : s) {
            hjemby.add(i.getHjemsted());
        }

        System.out.println(hjemby);
    }

    // e)
    // Ja, man kan legge en NettStudent til en liste av Student-objekter. Downcasting.

    // f)
    // Ja, man kan legge en Student il en liset av NettStudent-objekter. Upcasting.
}
