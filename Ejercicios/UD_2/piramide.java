package Ejercicios.UD_2;

import java.util.Scanner;

public class piramide {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int alt,anch;

        System.out.println("Indique la altura del triangulo");
        alt=sc.nextInt();

        anch=2*alt-1;
        System.out.println(anch);

        for (int i = 0; i < alt; i++) {
            for (int j = 0; j < anch; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
