package tema3.Array;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();

        int tamanyo = 20;
        int minasTotales = 6;

        char[] tablero = new char[tamanyo];
        char[] tableroReal = new char[tamanyo];

        for (int i = 0; i < tamanyo; i++) {
            tablero[i] = 'X';
            tableroReal[i] = '0';
        }

        int minasColocadas = 0;
        while (minasColocadas < minasTotales) {
            int pos = r.nextInt(tamanyo);
            if (tableroReal[pos] != '*') {
                tableroReal[pos] = '*';
                minasColocadas++;
            }
        }

        for (int i = 0; i < tamanyo; i++) {
            if (tableroReal[i] != '*') {
                int contador = 0;
                if (i > 0 && tableroReal[i - 1] == '*') contador++;
                if (i < tamanyo - 1 && tableroReal[i + 1] == '*') contador++;
                tableroReal[i] = (char) ('0' + contador);
            }
        }

        boolean juegoTerminado = false;
        int casillasDescubiertas = 0;

        while (!juegoTerminado) {
            mostrarTablero(tablero);
            System.out.println("Elige una posición (1-20):");
            int opcion = in.nextInt() - 1;

            if (opcion < 0 || opcion >= tamanyo) {
                System.out.println("Posición incorrecta.");
                continue;
            }

            if (tableroReal[opcion] == '*') {
                System.out.println("¡BOOM! Has pisado una mina. Has perdido.");
                juegoTerminado = true;
                mostrarTablero(tableroReal);
            } else if (tablero[opcion] == 'X') {
                tablero[opcion] = tableroReal[opcion];
                casillasDescubiertas++;
                if (casillasDescubiertas == tamanyo - minasTotales) {
                    System.out.println("¡¡Has descubierto todas las casillas sin minas! ¡Has ganado!");
                    mostrarTablero(tableroReal);
                    juegoTerminado = true;
                }
            } else {
                System.out.println("Ya habías descubierto esa posición.");
            }
        }
    }

    public static void mostrarTablero(char[] tablero) {
        for (char c : tablero) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
