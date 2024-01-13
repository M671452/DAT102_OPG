package Uke2.Opg6;

public class Main {
    // a)
    // "x" er gyldig innenfor metoden "f".
    static int f(int x) {
        x = 2 * x;
        return x;
    }

    static void g(double[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = 2 * a[i];
        }

        // Ikke anbefalt, men lovlig kode:
        a = new double[2];
        a[0] = 1.0;
        a[1] = 2.0;
    }

    public static void main(String[] args) {
        int[] htab = {2, 7};
        int a = 4;
        int b = f(a);

        // b)
        // a er 4 og b er 8.
        double[] tab = {2.0, 5.0};
        g(tab);

        // c
        // tab inneholder nå {4.0, 10.0}

        // d
        // Kun disse er lovlige:
        double d2 = f(3); // Auto-typecasts
        int d4 = f(3);
    }
}
