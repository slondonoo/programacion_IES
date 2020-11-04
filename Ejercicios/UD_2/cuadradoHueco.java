package Ejercicios.UD_2;

import java.util.Scanner;

public class cuadradoHueco {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int alt;

        System.out.println("Indique altura del cuadrado");
        alt=sc.nextInt();

        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < alt; j++) {
                if (i == 0 || i == alt-1 || j == 0 || j == alt-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
    }
}
