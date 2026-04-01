package tema7.Ficheros_Serializacion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Introduce nombre: ");
                    String nombre = in.nextLine();
                    System.out.print("Introduce edad: ");
                    int edad = in.nextInt();
                    listaPersonas.add(new Persona(nombre, edad));
                    System.out.println("Persona añadida correctamente");
                    break;
                case 2:
                    System.out.println("Has salido de la creación de lista de personas");
                    salir = true;
                    break;
                default:
                    System.out.println("Valor incorrecto");
                    break;
            }
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("personas.dat"))) {
            oos.writeObject(listaPersonas);
            System.out.println("Fichero 'personas.dat' actualizado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    } // Cierre del main

    public static void mostrarMenu() {
        System.out.println("\n***Menú***");
        System.out.println("1. Añadir persona a la lista");
        System.out.println("2. Salir y guardar");
        System.out.print("Elige una opción: ");
    }
}