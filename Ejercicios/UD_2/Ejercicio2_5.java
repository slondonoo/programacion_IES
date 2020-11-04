package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio2_5 {
    public static void main(String[] args) {
       /*Crea un programa que pida al usuario una temperatura en grados
       centígrados y calcule (y muestre) a cuántos grados Fahrenheit
       equivalen (F = 9*C/5 + 32)*/
        Scanner sc = new Scanner(System.in);

        double tem;

        System.out.println("Indique temperatura en grados ºC");
        tem=sc.nextDouble();

        System.out.println(tem+"ºC "+ "equivale a: "+(9*tem/5+32)+"F");

    }
}
