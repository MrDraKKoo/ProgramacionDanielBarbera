package tema7.Ejercicios_B_Ficheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/danbartor/Documents/ejBficheros/numeros.txt")))
        {
            int min = 99999999;
            int max = 0;
            String linea;

            while ((linea = br.readLine()) !=null){
                if (Integer.parseInt(linea) > max){
                    max = Integer.parseInt(linea);
                }
                if (Integer.parseInt(linea) < min){
                    min= Integer.parseInt(linea);
                }
            }
            System.out.println("Numero maximo: "+max);
            System.out.println("Numero minimo: "+min);

        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
