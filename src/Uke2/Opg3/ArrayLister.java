package Uke2.Opg3;
import java.util.*;
public class ArrayLister {
    public static void main(String[] args) {
        // a)
        ArrayList<Integer> tall = new ArrayList<>(Arrays.asList(1, 3, 3, 10, 123));
        System.out.println("Nr 4: " + tall.get(3) + "\nNr 5: " + tall.get(4));

        // b)
        System.out.println(tall.size());
        tall.add(1, 50);
        System.out.println(tall.size());

        // c)
        int test = 50;
        if(tall.contains(test)) {
            System.out.println("Tallet finnes!");
        }
        else {
            System.out.println("Tallet finnes ikke!");
        }

        // d)
        int element = 3;
        int forstePos = tall.indexOf(element);
        int sistePos = tall.lastIndexOf(element);
        System.out.println(forstePos + "\n" + sistePos);

        // e)
        tall.clear();
        if(tall.isEmpty()) {
            System.out.println("Listen er tom!");
        }
        else {
            System.out.println("Listen er ikke tom");
        }
    }
}

