package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio4_3 {
    public static void main(String[] args) {
        /* Modificar el ejercicio anterior para que muestre
        la parte entera de la media de tres notas decimales. */
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, media, tra;


        System.out.println("Ingrese primera nota");
        n1=sc.nextDouble();
        System.out.println("Ingrese segunda nota");
        n2=sc.nextDouble();
        System.out.println("Ingrese segunda nota");
        n3=sc.nextDouble();

        media=(n1+n2+n3)/3;
        tra=(int) media;

        System.out.println("La media de las notas es: "+ tra);
    }
}
