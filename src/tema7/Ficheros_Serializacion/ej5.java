package tema7.Ficheros_Serializacion;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ej5 {
    public static void main(String[] args) {
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream("Persona.dat"))) {
            Persona personaLeida = (Persona) entrada.readObject();
            System.out.println("Nombre: " + personaLeida.getNombre()+"\n Edad: " + personaLeida.getEdad());
        } catch (IOException ioe) {
            System.out.println("Error al acceder al archivo: " + ioe.getMessage());
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error: No se encontró la clase del objeto leído.");
            cnfe.printStackTrace();
        }
    }
}
