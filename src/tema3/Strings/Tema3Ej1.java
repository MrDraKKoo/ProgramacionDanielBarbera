package tema3.Strings;

import java.util.Locale;
import java.util.Scanner;

public class Tema3Ej1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println(
                "a) Una función que reciba una cadena y devuelva esta cadena invertida y en mayúsculas.\n" +
                "b) Una función que reciba una cadena y devuelva el número de vocales.\n" +
                "c) Una función que reciba una cadena y devuelva la palabra de mayor longitud.\n" +
                "d) Una función que reciba dos cadenas y devuelva el número de veces que la segunda cadena está incluida en la primera.\n" +
                "e) Una función que reciba una cadena y devuelva el número de palabras que contiene.\n" +
                "f) Una función que reciba un número de teléfono, por ejemplo 34555332211” y lo convierta al formato (+34)-555-332211.\n" +
                "g) Un procedimiento que reciba una cadena y muestre por pantalla el histograma de frecuencias de las vocales (las veces que se repiten)"
        );
        char opcion = in.next().charAt(0);
        switch (opcion){
            case 'a':
                System.out.println("Intrduce una cadena separada por espacios");
                String cadena = in.nextLine();
                char [] invertida;
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
        }
        }
    public static String[] invertidaMayus(String[] partes){
        return partes;
    }
}
