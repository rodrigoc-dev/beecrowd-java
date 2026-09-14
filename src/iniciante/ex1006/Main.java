package iniciante.ex1006;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, peso1, peso2, peso3;
        double pesoTotal, calcPeso1, calcPeso2, calcPeso3, mediaAluno;

        peso1 = 2;
        peso2 = 3;
        peso3 = 5;
        pesoTotal = peso1 + peso2 + peso3;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        calcPeso1 = A * peso1;
        calcPeso2 = B * peso2;
        calcPeso3 = C * peso3;

        mediaAluno = (calcPeso1 + calcPeso2 + calcPeso3) / pesoTotal;

        System.out.printf("MEDIA = %.1f%n", mediaAluno);

        sc.close();

    }
}
