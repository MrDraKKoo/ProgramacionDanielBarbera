package tema7.Ficheros_Serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ej6_lectura {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("personas.dat"))) {
            ArrayList<Persona> listaLeida = (ArrayList<Persona>) ois.readObject();
            System.out.println("\nListado de Personas en el Fichero");
            for (Persona p : listaLeida) {
                System.out.println("Nombre: " + p.getNombre() + "\nEdad: " + p.getEdad()+"\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo 'personas.dat' no existe. Ejecuta primero el ej6_A.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}