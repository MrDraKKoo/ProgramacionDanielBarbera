package tema3.Array;

import java.util.Random;
import java.util.Scanner;

public class parejas {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] animales;
        animales = new String[]{
                "León","León","Mandril","Mandril","Suricata","Suricata","Facóquero","Facóquero",
                "Tigre","Tigre","Puma","Puma","Cebra","Cebra","Elefante","Elefante",
                "Jirafa","Jirafa","Mono","Mono"
        };
        boolean[] visibles = new boolean[20];


        Random r = new Random();

        for (int i = 0; i < animales.length; i++) {
            int posAleatoria = r.nextInt(20);
            String temp = animales[i];
            animales[i] = animales[posAleatoria];
            animales[posAleatoria] = temp;
        }

        int parejasEncontradas = 0;

        while (parejasEncontradas < 10) {
            System.out.println("********TABLERO********");
            mostrarTablero(animales,visibles);

            System.out.println("Dime la posicion que quieres levantar:");
            int opcion1 = in.nextInt() - 1;

            System.out.println("Dime la segunda posicion que quieres levantar:");
            int opcion2 = in.nextInt() - 1;

            if (opcion1 < 0 || opcion1 >= 20 || opcion2 < 0 || opcion2 >= 20 || opcion1 == opcion2) {
                System.out.println("Posiciones incorrectas.");
                continue;
            }

            System.out.println(animales[opcion1] + " - " + animales[opcion2]);

            boolean acierto = comprobarParejas(animales, opcion1, opcion2);

            if (acierto) {
                visibles[opcion1] = true;
                visibles[opcion2] = true;
                parejasEncontradas++;
            }

            System.out.println("\n");
        }

        System.out.println("¡¡Has encontrado todas las parejas!!");
    }

    public static boolean comprobarParejas(String[] animales, int opcion1, int opcion2) {
        if (animales[opcion1] .equals (animales[opcion2])) {
            System.out.println("Son pareja");
            return true;
        } else {
            System.out.println("NO son pareja");
            return false;
        }
    }

    public static void mostrarTablero(String[] animales, boolean [] visibles) {
        for (int i = 0; i < 20; i++) {
            if (visibles[i]) {
                System.out.print(animales[i] + " ");
            } else {
                System.out.print("X ");
            }
        }
        System.out.println();
    }
}
