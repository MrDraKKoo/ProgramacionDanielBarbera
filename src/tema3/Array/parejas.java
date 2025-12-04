package tema3.Array;

import java.util.Random;
import java.util.Scanner;

public class parejas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] animales;
        animales = new String[]{"León","León","Mandril","Mandril","Suricata","Suricata","Facóquero","Facóquero","Tigre","Tigre","Puma","Puma","Cebra","Cebra","Elefante","Elefante","Jirafa","Jirafa","Mono","Mono"
        };
        int[] posiciones;
        posiciones= new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        boolean[] visibles = new boolean[20];
        Random r = new Random();

        for (int i = 0; i < animales.length; i++) {
            int posAleatoria = r.nextInt(20);
            String temp = animales[i];
            animales[i] = animales[posAleatoria];
            animales[posAleatoria] = temp;
        }
        System.out.println("Dime la posicion que quieres levantar:");
        int opcion1 = in.nextInt() - 1;
        System.out.println("Dime la segunda posicion que quieres levantar:");
        int opcion2 = in.nextInt() - 1;
        comprobarParejas(animales,opcion1,opcion2);
        mostrarTablero(animales, visibles);

    }

    public static void comprobarParejas(String[] animales, int opcion1, int opcion2) {
        if (animales[opcion1] .equals (animales[opcion2])){
            System.out.println("Son pareja");
        }else {
            System.out.println("NO son pareja");
        }
    }
    public static void mostrarTablero(String[] animales, boolean[] visibles) {
        for (int i = 0; i < 20; i++) {
            if (visibles[i]) {
                System.out.print(animales[i] + "  ");
            } else {
                System.out.print("X  ");
            }
        }
        System.out.println();
    }

}
