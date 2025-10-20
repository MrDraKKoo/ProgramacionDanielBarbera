package tema2;

import java.util.Scanner;

public class Tema2ejercicio25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero el cual quires saber su factorial");
        int num = in.nextInt();
        int resultado = 1;
        if (num < 0){
            System.out.println("Introduce un numero entero");
        }else {
            for (int n = 1; n <= num; n++) {
                resultado = resultado * n;
            }
            System.out.println("El factorial de " + num + " es " + resultado);
        }
    }
}
