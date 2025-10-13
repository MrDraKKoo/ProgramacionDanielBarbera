package tema2;

import java.util.Scanner;

public class Tema2ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero");
        double num1 = in.nextDouble();
        System.out.println("Dime otro numero");
        double num2 = in.nextDouble();
        System.out.println("Dime el ultimo numero");
        double num3 = in.nextDouble();
        double media1 = (num1 + num2 + num3) / 3;
        int media2 = (int) ((num1 + num2 + num3) / 3);
        System.out.println("La media con decimales es = "+media1);
        System.out.println("La media sin decimales es = "+media2);
    }
}
