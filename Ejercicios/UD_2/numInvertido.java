package Ejercicios.UD_2;

import java.util.Scanner;

public class numInvertido {
    public static void main(String[] args) {

        double num, cad, cad2=1;


        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese número");
        num=sc.nextDouble();

        while (num!=0){
            cad=num/10;
            num=Math.floor(cad);
            cad=cad-Math.floor(cad);
            cad2=cad2*10+cad*10;
            cad2=Math.floor(cad2);
        }
        System.out.println(cad2);

    }
}
