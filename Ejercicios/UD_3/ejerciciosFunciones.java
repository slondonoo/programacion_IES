package Ejercicios.UD_3;

public class ejerciciosFunciones {
    /*
    Actividad 6: Crear una función que, mediante un booleano, indique si el carácter
    que se pasa como parámetro de entrada corresponde con una vocal.
    Actividad 7: Diseñar una función que nos diga si un número es primo.
    Actividad 8: Escribir una función a la que se le pase un número entero
     y devuelva el número de divisores primos que tiene.*/
    public static void main(String[] args) {


    }
    //Actividad 4: Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos
    public static int mayor2(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    // Actividad 5: Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números. Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde cero
    public static int mayor3(int a, int b, int c) {
        if (mayor2(a,b)>c){
            return mayor2(a,b);
        } else {
            return c;
        }
    }
}
