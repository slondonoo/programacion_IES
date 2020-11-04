package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio5_2 {
    public static void main(String[] args) {
        /*Crea un programa que pida al usuario que introduzca el número 12.
        Después debe decirle si lo ha hecho correctamente o no */

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el número 12");
        num=sc.nextInt();

        if (num==12){
            System.out.println("Número correcto");
        } else {
            System.out.println("Número errado");
        }
    }
}
