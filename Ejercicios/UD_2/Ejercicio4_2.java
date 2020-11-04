package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio4_2 {
    public static void main(String[] args) {
        /* Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
        Hay que tener en cuenta que la media puede contener decimales. */
        Scanner sc = new Scanner(System.in);
        double n1, n2;

        System.out.println("Ingrese primera nota");
        n1=sc.nextDouble();
        System.out.println("Ingrese segunda nota");
        n2=sc.nextDouble();

        System.out.println("La media de las notas es: "+((n1+n2)/2));

    }
}
