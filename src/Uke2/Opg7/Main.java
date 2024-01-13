package Uke2.Opg7;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // e)
        ArrayList<Student> studenter = new ArrayList<>();

        studenter.add(new Student("667654", "Ola", "Jacobsen", "Oslo"));
        studenter.add(new Student("657454", "Kari", "Nordmann", "Bergen"));
        studenter.add(new Student("54353", "Per", "Myking", "Oslo"));
        studenter.add(new Student("749454", "Pål", "Sørensen", "Stavanger"));
        studenter.add(new Student("345345", "Nils", "Hansen", "Bergen"));

        // f)
        Collections.sort(studenter);
        System.out.println(studenter);
    }
}
