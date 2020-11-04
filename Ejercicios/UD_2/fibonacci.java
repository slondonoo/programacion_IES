package Ejercicios.UD_2;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int num,y,x1,x2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Indique el número máximo");
        num = sc.nextInt();

        x1=0;
        x2=1;
        for (int i = 0; i < num ; i++) {
            System.out.print(x1);
            y=x1+x2;
            x1=x2;
            x2=y;
        }
        
    }
}
