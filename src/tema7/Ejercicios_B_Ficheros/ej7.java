package tema7.Ejercicios_B_Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej7 {
    public static void main(String[] args) {
        int numLineas = 0;
        int numPalabras = 0;
        int numcCaracteres = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("/home/danbartor/Documents/ejBficheros/Libros/quijote_cervantes.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                numLineas++;
                numcCaracteres = numcCaracteres + linea.length();
                String[] trozos = linea.split(" ");

                if (!linea.isEmpty()){
                    numPalabras = numPalabras + trozos.length;
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Numeor de lineas: " + numLineas);
        System.out.println("Numero de palabras: " + numPalabras);
        System.out.println("Numero de caracteres: " + numcCaracteres);
    }
}
