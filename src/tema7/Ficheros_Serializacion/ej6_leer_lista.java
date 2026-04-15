package tema7.Ficheros_Serializacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ej6_leer_lista {
    public static void main(String[] args) {
        try (FileInputStream fis=new FileInputStream("/home/danbartor/IdeaProjects/ProgramacionDanielBarbera/Persona.dat");
             ObjectInputStream salida = new ObjectInputStream(fis)){
            Persona persona1 = (Persona) salida.readObject();
            System.out.println("Nombre: "+ persona1.getNombre()+"\n"+"Edad: "+persona1.getEdad());
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

