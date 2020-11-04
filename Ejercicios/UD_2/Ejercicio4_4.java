package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio4_4 {
    public static void main(String[] args) {
        /* Sería interesante disponer de un programa que pida como entrada
        un número decimal y lo muestre redondeando al entero más próximo.
        ej: 2,3 -> 2      4,8 -> 5 */
        double num;

        Scanner sc =new Scanner(System.in);

        System.out.println("Ingrese número");
        num=sc.nextDouble();

        System.out.println(Math.round(num));

    }
}
