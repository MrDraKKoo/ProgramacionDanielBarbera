package tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static void primoONo (int num){
        int divisor = 2;
        int NOprimo = 0;
        int primo = 0;

        while (divisor < num){
            if (num % divisor ==0){
                NOprimo++;
            }else {
                primo++;
            }
            divisor++;
        }
        if (NOprimo > 0){
            System.out.println("No es primo");
        }else {
            System.out.println("Es primo");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero entero positivo");
        int num = in.nextInt();
        while (num >0) {
            primoONo(num);
            System.out.println("vuelve a introducir un numero,o introduce 0 o <0 para salir");
            num = in.nextInt();
        }
    }
}
