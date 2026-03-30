package tema7.Ficheros_Serializacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej3 {
    public static void main(String[] args) {
        int numPalabras = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("/home/danbartor/Serializacion/texto.txt"))){
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] trozos = linea.split(" ");

                if (!linea.isEmpty()){
                    numPalabras = numPalabras + trozos.length;
                }            }
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("Numero de palabras: "+numPalabras);
    }
}
