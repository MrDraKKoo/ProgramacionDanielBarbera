package tema1;

import java.util.Scanner;

public class Tema1ejercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce 2 numeros para poder operar");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int suma = num1 + num2;
        int producto = num1 * num2;
        int resta = num1 - num2;
        int división = num1 / num2;
        int resto = num1 % num2;
        System.out.println("La sume es ="+suma);
        System.out.println("El producto es ="+producto);
        System.out.println("La resta es ="+resta);
        System.out.println("La división es ="+división);
        System.out.println("El resto es ="+resto);

    }
}
