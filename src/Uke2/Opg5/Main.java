package Uke2.Opg5;
import java.util.*;
public class Main {
    // HashMaps tar inn en datatype og peker på en annen en,
    // f.eks. fra ansattes navn (String) til deres ID-nr (Integer).
    // HashMaps er som HashSets, uorganisert.
    public static void main(String[] args) {
        // a)
        List<String> ord = new ArrayList<>(Arrays.asList("er", "det", "alle", "er", "det", "det"));
        Map<String, Integer> frekvens = new HashMap<>();
        for (String i : ord) {
            if(frekvens.containsKey(i)) {
                frekvens.put(i, frekvens.get(i) + 1);
            }
            else {
                frekvens.put(i, 1);
            }
        }
        System.out.println(frekvens);

        // b)
        // Tar inn et ord og finner frekvensen av ordet (eller gir 0 om det ikke finnes).
        Scanner inn = new Scanner(System.in);
        System.out.println("Skriv inn et ord: ");
        String userOrd = inn.next();
        System.out.println("Frekvensen er: " + frekvens.getOrDefault(userOrd, 0));
    }
}
