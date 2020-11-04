package Ejercicios.UD_2;

import java.util.Scanner;

public class trianguloPascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;

        System.out.println("Indique el número de filas del triangulo");
        altura = sc.nextInt();

        for (int i = 0; i < altura+1; i++) {
            for (int j = 0; j <= i; j++) {
                if (j==0||i==j) {
                    System.out.print(1);
                } else {

                    System.out.print("*");
                }

            }
            System.out.println();
            char x;

        }
    }
}
