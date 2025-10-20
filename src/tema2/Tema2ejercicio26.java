package tema2;

import java.util.Scanner;

public class Tema2ejercicio26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int divisor = 2;
        int NOprimo = 0;
        int primo = 0;

        while (divisor < num){
            if (num % divisor ==0){
                NOprimo++;
            }else {
                primo++;
            }
            divisor++;
        }
        if (NOprimo > 0){
            System.out.println("No es primo");
        }else {
            System.out.println("Es primo");
        }
    }
}

