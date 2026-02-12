package tema5.Excepciones;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] array = new double[5];
        int i = 0;
        while (i < array.length) {
            try {
                System.out.println("Introduce un valor numerico para la posicion " + i);
                array[i] = in.nextDouble();
                i++;
            } catch (InputMismatchException ex) {
                System.err.println("Error: " + ex.getMessage());
                System.err.println("Valor introducido incorrecto");
                in.nextLine();
            }
        }
        System.out.println("Array completado: "+ Arrays.toString(array));
    }
}

