package tema7.Ficheros_Serializacion;

import java.io.*;

public class ej4 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Daniel", 20);
        try (FileOutputStream fos=new FileOutputStream("Persona.dat");
             ObjectOutputStream salida = new ObjectOutputStream(fos)){
            salida.writeObject(persona1);
            System.out.println("Objeto serializado con exito");
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
