package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio5_1 {
    public static void main(String[] args) {
        /*Crea un programa que pida un número entero al usuario y diga si es positivo
        (mayor que cero) o si, por el contrario, no lo es (usando "else") */
        Scanner sc =new Scanner(System.in);

        int num;

        System.out.println("Indique un número");
        num=sc.nextInt();

        if (num<0) {
            System.out.println("El número es un entero negativo");
        } else {
            System.out.println("El número es un entero positivo");
        }
    }
}
