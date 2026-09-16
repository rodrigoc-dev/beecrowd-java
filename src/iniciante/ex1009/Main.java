package iniciante.ex1009;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeFunc;
        double salario, vendas, total;

        nomeFunc = sc.nextLine();
        salario = sc.nextDouble();
        vendas = sc.nextDouble();

        //calculo:
        total = salario + vendas * 0.15;


        System.out.printf("TOTAL = R$ %.2f%n", total);
        sc.close();
    }
}
