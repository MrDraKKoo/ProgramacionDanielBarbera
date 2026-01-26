package tema3.Array;

import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        int[] array;
        int [] array2;
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        array2 = new int []{10,11,12,13,14,15,16,17,18};
        resta2Vectores(array,array2);

    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void maxArray(int[] array) {
        int max;
        int max1 = 1;
        for (int i = 0; i < array.length; i++) {
            max = array[i];
            if (max > max1) {
                max1 = array[i];
            }
        }
        System.out.println("El numero maximo es: " + max1);
    }

    public static void minArray(int[] array) {
        int min;
        int min1 = 1;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            if (min < min1) {
                min1 = array[i];
            }
        }
        System.out.println("El numero minimo es: " + min1);
    }

    public static void mediaArray(int[] array) {
        int media = 0;
        for (int i = 0; i < array.length; i++) {
            media = media + array[i];
        }
        System.out.println("El rpomedio del array es: " + media / array.length);
    }

    public static boolean existeSiNo(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]){
                return true;
            }
        }
        return false;
    }
    public static void suma2Vectores (int [] array, int [] array2){
        int suma;
        for (int i = 0; i < array.length; i++) {
            suma= array[i] + array2[i];
            System.out.println("La suma de: "+array[i]+" + "+array2[i]+" = "+suma);
        }
    }
    public static void resta2Vectores (int [] array, int [] array2){
        int resta;
        for (int i = 0; i < array.length; i++) {
            resta = array[i] - array2[i];
            System.out.println("La resta de: " + array[i] + " - " + array2[i] + " = " + resta);
        }
    }
}
