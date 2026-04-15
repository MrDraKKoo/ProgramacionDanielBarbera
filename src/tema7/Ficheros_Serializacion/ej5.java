package tema7.Ficheros_Serializacion;

import java.io.*;

public class ej5 {
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
