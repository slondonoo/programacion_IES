package Ejercicios.UD_2;

import java.util.Scanner;

public class ejCadenas {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String p1,p2;
        int lp1,lp2;

        System.out.println("Ingresa dos palabras");
        p1=sc.nextLine();
        p2=sc.nextLine();

        lp1=p1.length();
        lp2=p2.length();
        if (lp1<lp2){
            System.out.println(p1+" es la palabra mas larga");
        } else if (lp1>lp2){
            System.out.println(p2+" es la palabra mas larga");
        } else {
            System.out.println("las palabras contienen los mismos caracteres");
        }
    }
}
