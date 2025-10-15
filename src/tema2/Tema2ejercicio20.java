package tema2;

import java.util.Scanner;

public class Tema2ejercicio20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime 1 numero entero");
        int primero = in.nextInt();
        System.out.println("Dime otro numero entero");
        int segundo = in.nextInt();

        if (primero > segundo) {
            System.out.println("El mayor es " + primero);
        } else {
            for (int i = primero; i <= segundo; i++) {
                if (i % 2 != 0)
                    System.out.println(i);
            }
        }
    }
}





