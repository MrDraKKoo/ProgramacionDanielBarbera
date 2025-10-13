package tema1;

import java.util.Scanner;

public class Tema1ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce dos numeros reales");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if (num1 >= 1 && num2 >= 1){
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
        }else{
            System.out.println("Has introducido un número que no es real");
        }
    }
}
