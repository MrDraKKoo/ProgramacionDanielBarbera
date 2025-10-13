package tema1;

import java.util.Scanner;

public class Tema1ejercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("introduce dos numeros para saber cual es mayor o si son iguales");
        int num1 = in.nextInt();
        int num2 = in.nextInt();


        if (num1 > num2){
            System.out.println(num1+" Es el mayor");
        } else if (num1 == num2) {
            System.out.println("Los números son iguales");
        }else {
            System.out.println(num2+" Es el mayor");
        }


    }
}
