package tema5.Excepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Gato> lista_gatos = new ArrayList<>();

        while (lista_gatos.size() < 5) {
            Gato gato = new Gato();
            try {
                System.out.println("\nIntroduce el nombre del gato " + lista_gatos.size() + ":");
                gato.setNombre(in.nextLine());
                System.out.println("Introduce la edad del gato:");
                int edad = in.nextInt();
                in.nextLine();
                gato.setEdad(edad);
                lista_gatos.add(gato);
                System.out.println("Gato guardado");
            } catch (InputMismatchException ex) {
                System.out.println("Error: "+ex.getMessage());
                in.nextLine();
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
        System.out.println("Lista de gatos guardados");
        for (Gato lista : lista_gatos) {
            System.out.println("Nombre: " + lista.getNombre());
            System.out.println("Edad: " + lista.getEdad());
        }
    }
}