package Ejercicios.UD_2;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int num,fac;


        Scanner sc =new Scanner(System.in);
        System.out.println("Indique numero");
        num=sc.nextInt();

        fac=1;
        while (num!=0){
            fac=fac*num;
            num--;
        }
        System.out.println(fac);
    }
}
