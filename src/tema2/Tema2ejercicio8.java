package tema2;

import java.util.Scanner;

public class Tema2ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el valor en euros");
        double euros = in.nextDouble();
        double dolar = 1.17;
        double conversion = euros * dolar;
        System.out.println("Tu valor en dolares sería = "+conversion);
    }
}
