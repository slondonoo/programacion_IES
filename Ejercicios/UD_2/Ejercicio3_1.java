package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        /*Crea un programa que calcule y muestre la suma de dos
        números de dos cifras (de tipo byte) que introduzca el usuario */

        byte num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primer número");
        num1=sc.nextByte();

        System.out.println("Ingrese segundo número");
        num2=sc.nextByte();

        System.out.println(num1+"+"+num2+"="+(num1+num2));

    }
}
