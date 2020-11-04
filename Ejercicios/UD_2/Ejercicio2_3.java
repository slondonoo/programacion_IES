package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio2_3 {
    public static void main(String[] args) {
        /* Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario */
        Scanner sc= new Scanner(System.in);

        int num1, num2;
        System.out.println("Introduce el primer número");
        num1=sc.nextInt();
        System.out.println("Introduce el segundo número");
        num2=sc.nextInt();

        System.out.println(num1+"/"+num2+"="+num1/num2);
    }
}
