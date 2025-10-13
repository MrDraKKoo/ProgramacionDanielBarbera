package tema2;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Tema2ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num1 = in.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = in.nextInt();
        System.out.println("Introduce un ultimo numero");
        int num3 = in.nextInt();
        if (num1 < num2 && num2 < num3){
            System.out.println("Los numero estan ordenados de menor a mayor");
        }else {
            System.out.println("No esta ordenado de menor a mayor");
        }


    }
}
