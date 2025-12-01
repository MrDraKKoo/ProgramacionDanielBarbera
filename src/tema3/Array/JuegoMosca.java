package tema3.Array;

import java.util.Random;
import java.util.Scanner;

public class JuegoMosca {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int mosca;
        int[] array;
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("Introduce un numero del 1 al 15, si tienes suerte cazaras la mosca");
        int eleccion = in.nextInt();
        int random2= random.nextInt(array.length);
        mosca= array[random2];
        while (!comprobar(eleccion,mosca)) {
            System.out.println("has fallado");
            if (eleccion + 1 == mosca || eleccion - 1 == mosca){
                System.out.println("Casi aciertas pero la mosca se ha asustado y ha cambiado ");
                int random3= random.nextInt(array.length);
                mosca = array[random3];
            }
            System.out.println("Vuelve a introducir un numero entre el 1 y el 15");
            eleccion = in.nextInt();
        }
        System.out.println("Le has dado a la mosca, has ganado!");
    }
    public static  boolean comprobar (int eleccion, int mosca){
        if (eleccion == mosca) {
            return true;
        }
        return false;
    }
}

