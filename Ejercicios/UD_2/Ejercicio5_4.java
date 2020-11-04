package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio5_4 {
    public static void main(String[] args) {
        /* Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.*/
        Scanner sc = new Scanner(System.in);

        int num1, num2;
        System.out.println("Introduzca el primer número");
        num1=sc.nextInt();
        System.out.println("Introduzca el segundo número");
        num2=sc.nextInt();

        if (num1%2==0 && num2%2==0){
            System.out.println("Los dos números son pares");
        } else if (num1%2==0 || num2%2==0) {
            System.out.println("Hay un número par");
        } else {
            System.out.println("No hay números pares");
        }
    }
}
