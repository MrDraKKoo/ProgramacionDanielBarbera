package tema2;

import java.util.Scanner;

public class Tema2ejercicio16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el numero de precio");
        double precio = in.nextDouble();
        System.out.println("Ingrese el tipo de moneda, E para euros D para dolares");
        char moneda = in.next().charAt(0);

        if (moneda != 'D' && moneda != 'd' && moneda != 'E' && moneda != 'e') {
            System.out.println("El tipo de moneda es invalido");
        } else if (moneda == 'E' || moneda == 'e') {
            precio = precio * 1.10;
            System.out.println("El precio es " + precio + " dolares");
        } else {
            precio = precio / 1.10;
            System.out.println("El precio es " + precio + " euros");
        }
    }
}