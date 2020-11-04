package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        /* Crea un programa que pida al usuario su año de nacimiento y
        el año actual (usando datos de tipo short) y halle la diferencia
        de ambos para obtener su edad */
        Scanner sc = new Scanner(System.in);
        short nac, act;

        System.out.println("Escriba su año de nacimiento");
        nac=sc.nextShort();
        System.out.println("Escriba el año actual");
        act=sc.nextShort();

        System.out.println("Su edad es: "+(act-nac)+" años");
    }
}
