package tema2;

import java.util.Scanner;

public class Tema2ejercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numeor del mes");
        int nummes = in.nextInt();
        System.out.println("Introduce el año");
        int anyos = in.nextInt();

        if (nummes > 12 || nummes < 1) {
            System.out.println("No es un número de mes");
        } else if (nummes == 1 || nummes == 3 || nummes == 5 || nummes == 7 || nummes == 8 || nummes == 10 || nummes == 12) {
            System.out.println("Este mes tiene 31 días");
        } else if (nummes == 4 || nummes == 6 || nummes == 9 || nummes == 11) {
            System.out.println("Este mes tiene 30 días");
        } else if (nummes == 2) {
            if ((anyos % 4 == 0 && anyos % 100 != 0) || (anyos % 400 == 0)) {
                System.out.println("Este mes tiene 29 días");
            } else {
                System.out.println("Este mes tiene 28 días");
            }
        }
    }
}