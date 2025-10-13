package tema2;

import java.util.Scanner;

public class Tema2ejercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el valor en dolares");
        double dolar = in.nextDouble();
        double euros = 1.17;
        double conversion = dolar / euros;
        System.out.println("Tu valor en euros sería = "+conversion);
    }
}

