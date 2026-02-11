package tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Gato gato1 = new Gato();
        boolean repetir;

        do {
            try {
                repetir = false;
                System.out.println("Introduce el nombre del gato 1:");
                gato1.setNombre(in.nextLine());
                System.out.println("Introduce la edad del gato 1:");
                gato1.setEdad(in.nextInt());
                in.nextLine();
                gato1.imprimir();
            } catch (InputMismatchException ex) {
                System.err.println("Error: "+ex.getMessage());
                in.nextLine();
                repetir = true;
            } catch (Exception ex) {
                System.err.println("Error: " + ex.getMessage());
                //Comprobar que el error no es de nombre
                if (!ex.getMessage().toLowerCase().contains("nombre")) {
                    in.nextLine();
                }
                repetir = true;
            }
        } while (repetir);
    }
}