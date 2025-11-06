package tema3;

import java.util.Scanner;

public class Tema3Ejercicio3 {

    public static boolean validRadius(double r){
        if (r >0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el valor del radio del circulo, tiene que ser >0");
        double r = in.nextInt();

    }

}
