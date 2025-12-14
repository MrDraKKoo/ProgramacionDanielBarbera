package tema3.String;

import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Usuario 1, introduce la palabra secreta:");
        String palabra = in.nextLine().toUpperCase();

        for (int i = 0; i < 50; i++) {
            System.out.println();
        }

        char[] palabraArray = palabra.toCharArray();
        char[] palabraOculta = new char[palabraArray.length];

        for (int i = 0; i < palabraOculta.length; i++) {
            if (palabraArray[i] == ' ') {
                palabraOculta[i] = ' ';
            } else {
                palabraOculta[i] = '-';
            }
        }

        int intentos = 6;
        char[] letrasIntentadas = new char[100];
        int totalIntentos = 0;

        while (intentos > 0) {
            System.out.print("Palabra: ");
            for (int i = 0; i < palabraOculta.length; i++) {
                System.out.print(palabraOculta[i]);
            }
            System.out.println();

            System.out.println("Introduce una letra o '!' para intentar adivinar la palabra completa:");
            String entrada = in.nextLine().toUpperCase();

            if (entrada.equals("!")) {
                System.out.println("Introduce la palabra completa:");
                String intentoPalabra = in.nextLine().toUpperCase();
                if (intentoPalabra.equals(palabra)) {
                    System.out.println("¡Felicidades! ¡Has adivinado la palabra!");
                    break;
                } else {
                    intentos--;
                    System.out.println("Palabra incorrecta. Te quedan " + intentos + " intentos.");
                }
                continue;
            }

            char letra = entrada.charAt(0);
            boolean acierto = false;

            for (int i = 0; i < palabraArray.length; i++) {
                if (palabraArray[i] == letra) {
                    palabraOculta[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                intentos--;
                totalIntentos++;
                System.out.println("Letra incorrecta. Te quedan " + intentos + " intentos.");
            }

            dibujarAhorcado(totalIntentos);

            boolean completa = true;
            for (int i = 0; i < palabraOculta.length; i++) {
                if (palabraOculta[i] == '-') {
                    completa = false;
                    break;
                }
            }
            if (completa) {
                System.out.println("¡Felicidades! ¡Has adivinado la palabra!");
                break;
            }

            if (intentos == 0) {
                System.out.println("¡Se te acabaron los intentos! La palabra era: " + palabra);
            }
        }

        in.close();
    }

    public static void dibujarAhorcado(int fallos) {
        System.out.println("Ahorcado:");
        switch (fallos) {
            case 0:
                System.out.println();
                break;
            case 1:
                System.out.println("  O");
                break;
            case 2:
                System.out.println("  O");
                System.out.println("  |");
                break;
            case 3:
                System.out.println("  O");
                System.out.println(" /|");
                break;
            case 4:
                System.out.println("  O");
                System.out.println(" /|\\");
                break;
            case 5:
                System.out.println("  O");
                System.out.println(" /|\\");
                System.out.println(" /");
                break;
            case 6:
                System.out.println("  O");
                System.out.println(" /|\\");
                System.out.println(" / \\");
                break;
        }
    }
}
