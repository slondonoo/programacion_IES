package Entregas.UD_2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        /*Escribir un programa que incremente la hora de un reloj tantos segundos como le solicitemos mostrando cada vez la hora nueva.
Se solicitará al usuario por teclado las horas, los minutos y los segundos y el número de segundos que se quiere aumentar la hora.
Supondremos que el usuario siempre introduce valores correctos.
Ejemplo 1:

Introducza horas: 13
Introduzca minutos: 59
Introduzca segundos: 51
Introduzca segundos a incrementar: 10

Aumentando la hora...
13:59:52
13:59:53
13:59:54
13:59:55
13:59:56
13:59:57
13.59:58
13:59:59
14:00:00
14:00:01*/
        Scanner sc = new Scanner(System.in);
        int hora, min, seg, incre;

        System.out.println("Introduzca hora");
        hora = sc.nextInt();
        System.out.println("Introduzca minutos");
        min = sc.nextInt();
        System.out.println("Introduzca segundos");
        seg = sc.nextInt();
        System.out.println("Introduzca el incremento");
        incre = sc.nextInt();

        for (int i = 0; i < incre; i++) {
            System.out.println(hora+":"+min+":"+seg);
            seg++;
            if (seg>59){
                min++;
                seg=0;
            } else if (min>59){
                hora++;
                min=0;
            } else if (hora>23){
                min=0;
                hora=0;
            }
        }
        System.out.println();
    }
}
