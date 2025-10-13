package tema2;

import java.util.Scanner;

public class Tema2ejercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero");
        double num1 = in.nextDouble();
        System.out.println("Dime otro numero");
        double num2 = in.nextDouble();
        System.out.println("Dime el ultimo numero");
        double num3 = in.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("Este es el numero más grande = "+num1);
        }else if (num2 > num1 && num2 > num3) {
            System.out.println("Este es el numero más grande = " + num2);
        }else {
            System.out.println("Este es el numero más alto = "+num3);
        }
    }
}
