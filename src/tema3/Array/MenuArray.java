package tema3.Array;

import java.util.Scanner;

import static tema3.Array.MyArray.*;

public class MenuArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Que opción quieres realizar:");
        System.out.println("a) Un procedimiento que imprima el array.");
        System.out.println("b) Una función que devuelva el máximo del array.");
        System.out.println("c) Una función que devuelva el mínimo del array.");
        System.out.println("d) Una función que devuelva la media.");
        System.out.println("e) Una función que te diga si un elemento existe en el array o no.");
        System.out.println("f) Una función que haga la suma de dos vectores (arrays).");
        System.out.println("g) Una función que haga la resta de dos vectores (arrays).");
        System.out.println("h) Una función que haga el producto escalar de dos vectores (arrays).");
        System.out.println("i) Haz una función que invierta el orden de un array. Por ejemplo:");
        System.out.println("j) Haz un procedimiento que invierta el orden de un array.");
        System.out.println("k) Haz una función que nos indique si un array es capicua o no. El siguiente array por ejemplo es capicua.");
        System.out.println("l) Haz un programa con un menú que te permita introducir uno o dos vectores y hacer todas las operaciones anteriores.");
        char opcion = in.next().charAt(0);

        switch (opcion){
            case 'a':
                int [] array;
                array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                imprimirArray(array);
                break;
            case 'b':
                array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                maxArray(array);
                break;
            case 'c':
                array = new int[] {1,2,3,4,5,6,7,8,9};
                minArray(array);
                break;
            case 'd':
                array = new int[] {1,2,3,4,5,6,7,8,9};
                mediaArray(array);
                break;
            case 'e':
                System.out.println("Dime un numero para ver si esta en el array");
                int num = in.nextInt();
                array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                boolean resultado = existeSiNo(array,num);
                if (resultado){
                    System.out.println("Si esta en el array");
                }else{
                    System.out.println("No esta en el array");
                }
                break;
            case 'f':
                int [] array2;
                array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                array2 = new int []{10,11,12,13,14,15,16,17,18};
                suma2Vectores(array, array2);
                break;
            case 'g':
                array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                array2 = new int []{10,11,12,13,14,15,16,17,18};
                resta2Vectores(array, array2);
                break;
            case 'h':
                break;
            case 'i':
                break;
            case 'j':
                break;
            case 'k':
                break;
            case 'l':
                break;
        }

    }
}
