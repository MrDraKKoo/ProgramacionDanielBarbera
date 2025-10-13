package tema2;

import java.util.Scanner;

public class Tema2ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double num1 = in.nextDouble();
        System.out.println("Introduce otro numero");
        double num2 = in.nextDouble();

        if (num1 > num2){
            double resta = num1 - num2;
            System.out.println("El primer numero es mayor y su reste es = "+resta);
        }else {
            double resta = num2 - num1;
            System.out.println("El segundo numero es mayor asi que la resta es = "+resta);
        }
    }
}
