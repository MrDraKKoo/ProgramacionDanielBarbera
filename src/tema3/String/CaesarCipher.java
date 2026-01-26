package tema3.String;

import java.util.Scanner;

public class CaesarCipher {

    public static String encrypt(String mensaje) {
        mensaje = mensaje.toUpperCase();
        char[] caracteres = mensaje.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] >= 'A' && caracteres[i] <= 'Y') {
                caracteres[i] = (char)(caracteres[i] + 1);
            } else if (caracteres[i] == 'Z') {
                caracteres[i] = 'A';
            } else if (caracteres[i] >= '0' && caracteres[i] <= '8') {
                caracteres[i] = (char)(caracteres[i] + 1);
            } else if (caracteres[i] == '9') {
                caracteres[i] = '0';
            }
        }

        return new String(caracteres);
    }

    public static String decrypt(String mensaje) {
        mensaje = mensaje.toUpperCase();
        char[] caracteres = mensaje.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            if (caracteres[i] >= 'B' && caracteres[i] <= 'Z') {
                caracteres[i] = (char)(caracteres[i] - 1);
            } else if (caracteres[i] == 'A') {
                caracteres[i] = 'Z';
            } else if (caracteres[i] >= '1' && caracteres[i] <= '9') {
                caracteres[i] = (char)(caracteres[i] - 1);
            } else if (caracteres[i] == '0') {
                caracteres[i] = '9';
            }
        }

        return new String(caracteres);
    }

    // Main
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un mensaje:");
        String mensaje = in.nextLine();

        String cifrado = encrypt(mensaje);
        System.out.println("Mensaje cifrado: " + cifrado);

        String descifrado = decrypt(cifrado);
        System.out.println("Mensaje descifrado: " + descifrado);
    }
}
