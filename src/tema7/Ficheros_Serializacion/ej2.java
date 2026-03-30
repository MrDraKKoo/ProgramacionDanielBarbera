package tema7.Ficheros_Serializacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/danbartor/Serializacion/usuario.txt"))){
          String linea;
           while ((linea = br.readLine()) != null) {
               System.out.println(linea);
          }
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
