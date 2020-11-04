package Ejercicios.UD_2;

import java.util.Scanner;

public class ejCademas2 {
    public static void main(String[] args) {
        /* Juego acierta la contraseña
        el primer jugador indica la contraseña el segundo debe acertar cual es la contraseña
        pistas1: se indica el nùmero de caracteres y la primera y ultima letra
        */
        Scanner sc= new Scanner(System.in);

        String mis,pas;

        System.out.println("Ingresa la palabra misteriosa");
        mis=sc.nextLine();
        int lmis=mis.length();

        char plmis = mis.charAt(0);
        char ulmis= mis.charAt(lmis-1);

        System.out.println("La palabra contiene "+lmis+" carateres");
        System.out.println("La primera palabra "+plmis);
        System.out.println("La última palabra "+ulmis);
        System.out.println();

        System.out.println("Descifra la palabra misteriosa");
        pas=sc.nextLine();
        while (!mis.equals(pas)){
            System.out.println("Descifra la palabra misteriosa");
            pas=sc.nextLine();
        }
        System.out.println("Acertaste!");





    }

}
