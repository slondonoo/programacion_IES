package Ejercicios.UD_2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio4_5 {
    public static void main(String[] args) {
        /* Escribe un programa que muestre la hora actual */

        LocalTime hora= LocalTime.now();
        System.out.println(hora);

        DateTimeFormatter modhora= DateTimeFormatter.ofPattern("HH:mm");
        String formatFecha = hora.format(modhora);

        System.out.println(formatFecha);
    }
}
