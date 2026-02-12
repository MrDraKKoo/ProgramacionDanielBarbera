package tema5.Excepciones;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random random1 = new Random();
        int random1a100= random1.nextInt(100) + 1;
        int random1a10=random1.nextInt(10) + 1;
        int posicion = 0;
        int[] array = new int[random1a100];
        for (int i = 0; i < array.length; i++) {
            array[i]= random1a10;
        }
        int opcion =0;
        while (opcion >= 0) {
            try {
                System.out.println("Que posicion del array quieres ver? Si introduces un valor negativo saldrás del programa");
                posicion = in.nextInt();
                System.out.println("La posicion "+posicion+" es "+array[posicion]);
            } catch (InputMismatchException ex) {
                System.err.println("Error: " + ex.getMessage());
                System.err.println("Valor introducido incorrecto");
                in.nextLine();
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("Error: " + ex.getMessage());
                in.nextLine();
            } finally {
                System.out.println("Introduce un numero positivo para continuar y uno negativo para salir");
                opcion = in.nextInt();
            }
        }
    }
}
