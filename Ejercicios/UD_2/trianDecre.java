package Ejercicios.UD_2;

import java.util.Scanner;

public class trianDecre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alt;

        System.out.println("Indique altura triangulo");
        alt=sc.nextInt();

        for (int i = 0; i < alt; i++) {
            for (int j = 0; j <= i; j++) {
                if (i==j) {
                    System.out.print("*");
                } else {
                    System.out.print("+");
                }



            }
            System.out.println();
        }

    }
}
