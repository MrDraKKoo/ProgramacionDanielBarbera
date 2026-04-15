package tema7.Ficheros_Serializacion;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombre = in.nextLine();
        System.out.println("Introduce tu edad:");
        int edad = in.nextInt();

        Path ruta = Paths.get("/home/danbartor/Serializacion/usuario.txt");

        try {
            if (Files.notExists(ruta)) {
                Files.createFile(ruta);
            }

        }  catch (IOException ioe) {
            ioe.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/danbartor/Serializacion/usuario.txt"))) {
            String linea = "Nombre: "+nombre+"\n"+"Edad: "+edad;
            bw.write(linea);

            }catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
