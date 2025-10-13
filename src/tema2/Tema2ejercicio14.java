package tema2;

import java.util.Scanner;

public class Tema2ejercicio14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero de noches");
        int noches = in.nextInt();
        System.out.println("Introduce el numero de personas");
        int personas = in.nextInt();
        double precio = noches * personas*15;
        double descuento = 0.75;


        if (personas > 5 && noches >= 7) {
            precio = precio * descuento;
            System.out.println("El precio es = " + precio);
        }else{
            System.out.println("El precio es = " + precio);
        }
    }
}
