package iniciante.ex1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int peca1, peca2, qntd1, qntd2;
        double valor1, valor2, total;

        peca1 = sc.nextInt();
        qntd1 = sc.nextInt();
        valor1 = sc.nextDouble();
        peca2 = sc.nextInt();
        qntd2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = (qntd1 * valor1) + (qntd2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
