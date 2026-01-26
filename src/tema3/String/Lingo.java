package tema3.String;

import java.util.Scanner;

public class Lingo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String palabraOculta = "HUESO";
        int intentosMax = 5;
        int intentos = 0;
        boolean adivinada = false;

        System.out.println("Hidden word: " + "-----");
        while (intentos < intentosMax && !adivinada) {
            System.out.print("Try: ");
            String intento = in.nextLine().toUpperCase();

            if (intento.length() != 5) {
                System.out.println("La palabra debe tener 5 letras.");
                continue;
            }

            char[] hint = new char[5];


            for (int i = 0; i < 5; i++) {
                hint[i] = '-';
            }

            char[] palabraArray = palabraOculta.toCharArray();
            char[] intentoArray = intento.toCharArray();
            boolean[] usado = new boolean[5];


            for (int i = 0; i < 5; i++) {
                if (intentoArray[i] == palabraArray[i]) {
                    hint[i] = '*';
                    usado[i] = true;
                }
            }


            for (int i = 0; i < 5; i++) {
                if (hint[i] == '*') continue; // ya marcada
                for (int j = 0; j < 5; j++) {
                    if (!usado[j] && intentoArray[i] == palabraArray[j]) {
                        hint[i] = intentoArray[i];
                        usado[j] = true;
                        break;
                    }
                }
            }


            System.out.print("Hint: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(hint[i]);
            }
            System.out.println();


            boolean correcta = true;
            for (int i = 0; i < 5; i++) {
                if (hint[i] != '*') {
                    correcta = false;
                    break;
                }
            }

            if (correcta) {
                System.out.println("¡Felicidades la has acertado!");
                adivinada = true;
            }

            intentos++;
        }

        if (!adivinada) {
            System.out.println("¡Se te acabaron los intentos! La palabra era: " + palabraOculta);
        }

        in.close();
    }
}

