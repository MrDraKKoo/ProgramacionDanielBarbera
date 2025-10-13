package tema2;

import java.util.Scanner;

public class Tema2ejercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = in.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = in.nextInt();
        System.out.println("Introduce un ultimo numero");
        int num3 = in.nextInt();
        if (num1 + 1 == num2 && num2 + 1 == num3) {
            System.out.println("Si estan ordenados consecutivamente");
        }else if (num2 + 1 == num1 && num3 + 1 == num2){
            System.out.println("Si estan ordenados consecutivamente");
        }else {
            System.out.println("No estan ordenados consecutivamente");
        }
    }
}
