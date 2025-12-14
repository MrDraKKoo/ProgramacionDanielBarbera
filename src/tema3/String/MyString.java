package tema3.String;

import java.util.Scanner;

public class MyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Selecciona la letra de la opcion que quieres realizar:");
        System.out.println(
                "a) Una función que reciba una cadena y devuelva esta cadena invertida y en mayúsculas.\n" +
                "b) Una función que reciba una cadena y devuelva el número de vocales.\n" +
                "c) Una función que reciba una cadena y devuelva la palabra de mayor longitud.\n" +
                "d) Una función que reciba dos cadenas y devuelva el número de veces que la segunda cadena está incluida en la primera.\n" +
                "e) Una función que reciba una cadena y devuelva el número de palabras que contiene.\n" +
                "f) Una función que reciba un número de teléfono y lo convierta al formato (+34)-555-332211.\n" +
                "g) Un procedimiento que muestre el histograma de vocales"
        );

        char opcion = in.next().charAt(0);

        switch (opcion) {
            case 'a':
                System.out.println("Introduce un frase:");
                in.nextLine();
                String frase = in.nextLine();
                invertido(frase);
                break;
            case 'b':
                System.out.println("Introduce un frase:");
                in.nextLine();
                String frase2 = in.nextLine();
                System.out.println("Total de vocales: "+contarVocales(frase2));
                break;
            case 'c':
                System.out.println("Introduce un frase:");
                in.nextLine();
                String frase3 = in.nextLine();
                System.out.println("palabra mas larga = "+palabraMasLarga(frase3));
                break;
            case 'd':
                in.nextLine();
                System.out.println("Introduce la cadena principal:");
                String texto = in.nextLine();
                System.out.println("Introduce la subcadena a buscar:");
                String sub = in.nextLine();
                int veces = contarSubcadena(texto, sub);
                System.out.println("La subcadena aparece " + veces + " veces.");
                break;
            case 'e':
                System.out.println("Introduce una frase:");
                in.nextLine(); //
                String frase4 = in.nextLine();
                int numPalabras = contarPalabras(frase4);
                System.out.println("Número de palabras: " + numPalabras);
                break;
            case 'f':
                System.out.println("Introduce un número de teléfono de 11 dígitos:");
                in.nextLine();
                String telefono = in.nextLine();
                String telFormateado = formatearTelefono(telefono);
                System.out.println("Teléfono formateado: " + telFormateado);
                break;
            case 'g':
                System.out.println("Introduce una frase:");
                in.nextLine();
                String frase5 = in.nextLine();
                histogramaVocales(frase5);
                break;

        }

    }

    public static void histogramaVocales(String frase) {
        char[] caracteres = frase.toCharArray();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for (int j = 0; j < caracteres.length; j++) {
            char c = Character.toLowerCase(caracteres[j]);
            if (c == 'a') a++;
            else if (c == 'e') e++;
            else if (c == 'i') i++;
            else if (c == 'o') o++;
            else if (c == 'u') u++;
        }

        System.out.println("a " + a + " " + "*".repeat(a));
        System.out.println("e " + e + " " + "*".repeat(e));
        System.out.println("i " + i + " " + "*".repeat(i));
        System.out.println("o " + o + " " + "*".repeat(o));
        System.out.println("u " + u + " " + "*".repeat(u));
    }


    public static String formatearTelefono(String numero) {
        if (numero.length() != 11) {
            return "Número de teléfono incorrecto";
        }

        char[] digitos = numero.toCharArray();
        String resultado = "(+" + digitos[0] + digitos[1] + ")-";

        for (int i = 2; i <= 4; i++) {
            resultado += digitos[i];
        }
        resultado += "-";

        for (int i = 5; i < digitos.length; i++) {
            resultado += digitos[i];
        }

        return resultado;
    }


    public static int contarPalabras(String frase) {
        String[] palabras = frase.trim().split("\\s+");
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) {
                contador++;
            }
        }

        return contador;
    }


    public static int contarSubcadena(String texto, String subcadena) {
        char[] t = texto.toCharArray();
        char[] s = subcadena.toCharArray();
        int contador = 0;

        for (int i = 0; i <= t.length - s.length; i++) {
            boolean match = true;

            for (int j = 0; j < s.length; j++) {
                if (t[i + j] != s[j]) {
                    match = false;
                    break;
                }
            }

            if (match) {
                contador++;
            }
        }

        return contador;
    }


    public static String palabraMasLarga(String frase) {
        String[] palabras = frase.split(" ");
        String mayor = "";

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > mayor.length()) {
                mayor = palabras[i];
            }
        }

        return mayor;
    }


    private static int contarVocales(String frase2) {
        char[] caracteres = frase2.toCharArray();
        int contador = 0;
        for (int i = 0; i < caracteres.length ; i++) {
            if (Character.toLowerCase(caracteres[i]) == 'a' || Character.toLowerCase(caracteres[i]) == 'e' || Character.toLowerCase(caracteres[i]) == 'i' || Character.toLowerCase(caracteres[i]) == 'o' || Character.toLowerCase(caracteres[i]) == 'u') {
                contador++;
            }
        }
        return contador;
    }

    public static void invertido(String frase){
        char[] caracteres = frase.toCharArray();
        for (int i = caracteres.length - 1; i >= 0; i--) {
            System.out.print(Character.toUpperCase(caracteres[i]));
        }
    }
}
