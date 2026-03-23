package tema7.Ejercicios_B_Ficheros;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantas personas quieres crear ?");
        int cantidadPersonas = in.nextInt();
        in.nextLine();
        System.out.println("En que archivo las quieres guardarlas ? el archivo tiene que estar en esta ruta /home/danbartor/Documents/ejBficheros/");
        String archivo = in.nextLine();
        Random random = new Random();
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<String> apellidos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("/home/danbartor/Documents/ejBficheros/usa_nombres.txt"))){

            String linea;
            while ((linea = br.readLine()) !=null){
              nombres.add(linea);
            }

        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader("/home/danbartor/Documents/ejBficheros/usa_apellidos.txt"))){

            String linea;
            while ((linea = br.readLine()) !=null){
                apellidos.add(linea);
            }

        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("/home/danbartor/Documents/ejBficheros/"+archivo))) {
            for (int i = 0; i < cantidadPersonas; i++) {
                String nombreRandom = nombres.get(random.nextInt(nombres.size()));
                String apellidosRandom = apellidos.get(random.nextInt(apellidos.size()));

                String nombrecompleto = nombreRandom + " " + apellidosRandom;
                bw.write(nombrecompleto);
                bw.newLine();
            }
        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
