package Ejercicios.UD_2;

import java.util.Scanner;

public class Ejercicio5_6 {
    public static void main(String[] args) {
        /* Crea un programa que contenga una constante llamada gravedad=9,8,
        solicite al usuario el valor de "tiempo", y calcule y muestre la velocidad
        (velocidad=gravedad x tiempo).
        Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"*/

        double tiempo;
        Scanner sc = new Scanner(System.in);
        final double grav=9.8;

        System.out.println("Determine el valor de la variable t (tiempo)");
        tiempo=sc.nextDouble();

        if (tiempo<0){
            System.out.println("Tiempo incorrecto");
        } else {
            System.out.println("La velocidad es: "+grav*tiempo +"m/s");
        }

    }
}
