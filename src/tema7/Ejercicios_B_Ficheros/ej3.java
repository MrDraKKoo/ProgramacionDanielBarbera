package tema7.Ejercicios_B_Ficheros;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el nombre del archivo que quieres escribir en el");
        String archivo = in.nextLine();
        System.out.println("Introduce el nombre del archivo que quieres leer");
        String archivo2 = in.nextLine();
        ArrayList<String> lineas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("/home/danbartor/Documents/ejBficheros/"+archivo))) {
            String linea;
            while ((linea = br.readLine()) !=null){
                lineas.add(linea);
            }
        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
        Collections.sort(lineas);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/danbartor/Documents/ejBficheros/"+archivo2))) {
            for (int i = 0; i < lineas.size(); i++) {
                bw.write(lineas.get(i));
                bw.newLine();
            }
        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
