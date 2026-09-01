package iniciante.ex1001;

import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int A, B, X;

        A = sc.nextInt();
        B = sc.nextInt();
        X = A + B;

        System.out.println("X = " + X);

        sc.close();
    }
}