package tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Introduce un numero entero:");
            int num = in.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("Error: "+ex.getMessage());
            System.out.println("Valor introducido incorrecto");
        }
    }
}
