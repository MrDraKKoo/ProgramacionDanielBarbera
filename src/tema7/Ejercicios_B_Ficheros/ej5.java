package tema7.Ejercicios_B_Ficheros;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ej5 {
    public static void main(String[] args) {
        Path rutaCarpeta = Paths.get("/home/danbartor/Documents/ejBficheros/Diccionario");
        try {
            Files.createDirectory(rutaCarpeta);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (BufferedReader br = new BufferedReader(new FileReader("/home/danbartor/Documents/ejBficheros/diccionario.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    char letra = Character.toUpperCase(linea.charAt(0));
                    String rutaDestino = rutaCarpeta + "/" + letra + ".txt";

                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaDestino, true))) {
                        bw.write(linea);
                        bw.newLine();
                    }
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}