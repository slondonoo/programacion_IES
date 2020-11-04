package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio5_5 {
    public static void main(String[] args) {
        /* Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres. */
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Escriba tres números (separados por enter)");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el mayor");
        }
        if (num2 > num3 && num2 >num1){
            System.out.println(num2 + " es el mayor");
        }
        if (num3>num1 && num3 >num2){
            System.out.println(num3 + " es el mayor");
        }
    }
}