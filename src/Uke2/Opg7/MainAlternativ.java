package Uke2.Opg7;

import java.util.*;

public class MainAlternativ {
    public static void main(String[] args) {
        ArrayList<StudentAlternativ> s = new ArrayList<>();

        s.add(new StudentAlternativ("667654", "Ola", "Jacobsen", "Oslo"));
        s.add(new StudentAlternativ("657454", "Kari", "Nordmann", "Bergen"));
        s.add(new StudentAlternativ("54353", "Per", "Myking", "Oslo"));
        s.add(new StudentAlternativ("749454", "Pål", "Sørensen", "Stavanger"));
        s.add(new StudentAlternativ("345345", "Nils", "Øvretveit", "Bergen"));

        Collections.sort(s);
        System.out.println(s.toString());
    }
}
