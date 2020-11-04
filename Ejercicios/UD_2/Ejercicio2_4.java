package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio2_4 {
    public static void main(String[] args) {
        /* Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3)
        y calcule su equivalencia en metros (1 milla = 1609 m)*/
        Scanner sc= new Scanner(System.in);

        double millas;

        System.out.println("Introduce la longitud en millas");
        millas= sc.nextDouble();

        System.out.println("Equivale a "+millas*1609+"m");
    }
}
