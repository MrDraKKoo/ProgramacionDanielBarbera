package tema3;

import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static void tabla (int num){
        int multipicacion = 1;
        int contador = 1;
        int resultado = 0;

        if (num > 10 || num < 1) {
            System.out.println("El numero introducido no es valido");
        }else {
            for(contador=1; contador <=10; contador++){
                resultado = num * multipicacion;
                System.out.println( num +" * "+ multipicacion+ " = " +resultado);
                multipicacion++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 10");
        int num = in.nextInt();
        tabla(num);
    }
}
