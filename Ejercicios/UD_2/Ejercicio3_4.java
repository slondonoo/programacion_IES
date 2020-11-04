package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {
        /* Crea un programa que pida al usuario una longitud en millas
        (por ejemplo, 3) y calcule su equivalencia en kilómetros, usando
        datos de tipo float (1 milla = 1.609 km) */
        Scanner sc= new Scanner(System.in);

        float millas;

        System.out.println("Introduce la longitud en millas");
        millas= sc.nextFloat();

        System.out.println("Equivale a "+millas*1.609+"km");
    }
}
