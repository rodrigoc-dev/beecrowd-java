package iniciante.ex1005;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, peso1, peso2, pesoTotal, total;
        A = sc.nextDouble();
        B = sc.nextDouble();
        peso1 = A * 3.5;
        peso2 = B * 7.5;
        pesoTotal = 11;

        total = (peso1 + peso2) / pesoTotal;

        System.out.printf("MEDIA = %.5f%n", total);
        sc.close();
    }

}
