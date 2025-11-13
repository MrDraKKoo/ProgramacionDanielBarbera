package tema3;

import java.sql.SQLDataException;
import java.util.Scanner;

public class Tema3Ejercicio9 {
    public static void priamide (char caracter,int lineas){
        for (int numlienas = 1; numlienas <= lineas; numlienas++) {
            for (int numesapcios = 1; numesapcios <= lineas - numlienas; numesapcios++) {
                System.out.print(" ");
            }
            for (int numcaracteres = 1; numcaracteres <= (2 * numlienas - 1); numcaracteres++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime que caracter quieres");
        char caracter = in.next().charAt(0);
        System.out.println("el numero de lienas de la priamide");
        int lineas = in.nextInt();
        priamide(caracter, lineas);
    }
}
