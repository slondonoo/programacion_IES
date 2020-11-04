package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio5_3 {
    public static void main(String[] args) {
        /* Crea un programa que diga si el número introducido por el usuario es impar o no lo es*/
        Scanner sc =new Scanner(System.in);

        int num;
        System.out.println("Indica un número");
        num=sc.nextInt();

        if (num%2==0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
