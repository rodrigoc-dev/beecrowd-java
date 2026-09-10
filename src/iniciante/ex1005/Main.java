package iniciante.ex1005;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, total;
        A = sc.nextDouble();
        B = sc.nextDouble();
        total = (A + B) / 2;

        System.out.printf("MEDIA = %.5f%n", total);
        sc.close();
    }

}
