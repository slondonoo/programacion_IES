package Entregas.UD_2;

import java.util.Scanner;

public class botaDoble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        altura=0;

        System.out.println("Indique altura de la bota");
        altura= sc.nextInt();

        while (altura<4){
            System.out.println();
            System.out.println("Indique un número mayor a 3");
            altura=sc.nextInt();
        }

        for (int i = 0; i < altura; i++){
            for (int j = 0; j < 12; j++) {
                if (j==6){
                System.out.print(" ");
                }
                if (i==altura-1 || i==altura-2||j==0 || j==1 || j==6|| j==7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
