package tema7.Ejercicios_B_Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/danbartor/Documents/ejBficheros/alumnos_notas.txt"))) {
            String[] nombres = new String[10];
            double[] medias = new double[10];
            int posicion= 0;
            String linea;
            while ((linea = br.readLine()) != null) {
                //array para separar
                String[] trozos = linea.split(" ");
                //separo el nombre completo de las notas
                nombres[posicion] = trozos[0] + " " + trozos[1];

                double suma = 0;
                int contadorNotas = 0;

                for (int i = 2; i < trozos.length; i++) {
                    suma += Double.parseDouble(trozos[i]);
                    contadorNotas++;
                }
                //guardo la media en otro array en la misma posicion que la del nombre
                medias[posicion] = suma / contadorNotas;
                posicion++;
            }
            //recorro todos los alumnos
            for (int i = 0; i < posicion; i++) {

                double notaMasAlta = -1;

                //guardo la posicion de la nota maxima actual
                int notaMaxActual = 0;

                //busco la nota maxima
                for (int j = 0; j < posicion; j++) {
                    if (medias[j] > notaMasAlta) {
                        notaMasAlta = medias[j];
                        notaMaxActual = j;
                    }
                }

                System.out.println(nombres[notaMaxActual] + " media: " + medias[notaMaxActual]);

                //cambio media alumno ya printeado
                medias[notaMaxActual] = -1;
            }

        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
