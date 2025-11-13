package tema3;

import java.util.Scanner;

public class Tema3Ejercicio5 {
    public static int tabla (int num){
        int multipicacion = 1;
        int contador = 1;
        int resultado = 0;
        if (num > 10 || num < 1) {
            System.out.println("El numero introducido no es valido");
        }else {
            while (contador <= 10) {
                resultado = num * multipicacion;
                System.out.println( num +" * "+ multipicacion+ " = " +resultado);
                multipicacion++;
                contador++;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 10");
        int num = in.nextInt();
        int tabla = tabla(num);
    }
}
