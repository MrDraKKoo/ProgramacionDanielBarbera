package tema3.Array;

import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        int [] array;
        array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] array2;
        array2 = new int []{10,11,12,13,14,15,16,17,18};
        int [] array3;
        array3 = new int []{1,2,3,2,1};

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
        System.out.println("l) Programa con un menú que te permita introducir uno o dos vectores y hacer todas las operaciones anteriores.");
        char opcion = in.next().charAt(0);

        switch (opcion){

            case 'a':
                imprimirArray(array);
                break;
            case 'b':
                maxArray(array);
                break;
            case 'c':
                minArray(array);
                break;
            case 'd':
                mediaArray(array);
                break;
            case 'e':
                System.out.println("Dime un numero para ver si esta en el array");
                int num = in.nextInt();
                boolean resultado = existeSiNo(array,num);
                if (resultado){
                    System.out.println("Si esta en el array");
                }else{
                    System.out.println("No esta en el array");
                }
                break;
            case 'f':
                suma2Vectores(array,array2);
                break;
            case 'g':
                resta2Vectores(array, array2);
                break;
            case 'h':
                System.out.println("El resultado del escalado es = "+escalar(array,array2));
                break;
            case 'i':
                invertirArray(array);
                break;
            case 'j':
                invertirArray2(array);
                break;
            case 'k':
                System.out.println("Diem que array quieres comprobar si es capicua o no:");
                System.out.println("1- array1");
                System.out.println("2- array2");
                System.out.println("3- array3");
                int respuesta = in.nextInt();
                switch (respuesta){
                    case 1:
                        if (esCapicua(array)){
                            System.out.println("si es");
                        }else{
                            System.out.println("no es");
                        }
                        break;
                    case 2:
                        if (esCapicua(array2)){
                            System.out.println("si es");
                        }else{
                            System.out.println("no es");
                        }
                        break;
                    case 3:
                        if (esCapicua(array3)){
                            System.out.println("si es");
                        }else{
                            System.out.println("no es");
                        }
                        break;
                }
                break;
            case 'l':
                System.out.println("Introduce la cantidad de números que quieres para tus 2 arrays");
                int tamano = in.nextInt();
                int [] arrayDeuser1 = new int[tamano];
                for (int i = 0; i < arrayDeuser1.length; i++) {
                    System.out.println("introduce un numero para la posicion "+i);
                    arrayDeuser1[i] = in.nextInt();
                }

                System.out.println("Ahora vamos con el segundo array");
                int [] arrayDeuser2 = new int[tamano];
                for (int i = 0; i < arrayDeuser2.length; i++) {
                    System.out.println("introduce un numero para la posicion "+i);
                    arrayDeuser2[i] = in.nextInt();
                }

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
                char opcion2 = in.next().charAt(0);
                switch (opcion2){
                    case 'a':
                        imprimirArray(arrayDeuser1);
                        break;
                    case 'b':
                        maxArray(arrayDeuser1);
                        break;
                    case 'c':
                        minArray(arrayDeuser1);
                        break;
                    case 'd':
                        mediaArray(arrayDeuser1);
                        break;
                    case 'e':
                        System.out.println("Dime un numero para ver si esta en el array");
                        int num2 = in.nextInt();
                        boolean resultado2 = existeSiNo(arrayDeuser1,num2);
                        if (resultado2){
                            System.out.println("Si esta en el array");
                        }else{
                            System.out.println("No esta en el array");
                        }
                        break;
                    case 'f':
                        suma2Vectores(arrayDeuser1,arrayDeuser2);
                        break;
                    case 'g':
                        resta2Vectores(arrayDeuser1, arrayDeuser2);
                        break;
                    case 'h':
                        System.out.println("El resultado del escalado es = "+escalar(arrayDeuser1,arrayDeuser2));
                        break;
                    case 'i':
                        invertirArray(arrayDeuser1);
                        break;
                    case 'j':
                        invertirArray2(arrayDeuser1);
                        break;
                    case 'k':
                        System.out.println("Diem que array quieres comprobar si es capicua o no:");
                        System.out.println("1- array1");
                        System.out.println("2- array2");
                        System.out.println("3- array3");
                        int respuesta3 = in.nextInt();
                        switch (respuesta3){
                            case 1:
                                if (esCapicua(arrayDeuser1)){
                                    System.out.println("si es");
                                }else{
                                    System.out.println("no es");
                                }
                                break;
                            case 2:
                                if (esCapicua(arrayDeuser2)){
                                    System.out.println("si es");
                                }else{
                                    System.out.println("no es");
                                }
                                break;
                            case 3:
                                if (esCapicua(array3)){
                                    System.out.println("si es");
                                }else{
                                    System.out.println("no es");
                                }
                                break;
                        }
                        break;
                }
        }
    }


    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int maxArray(int[] array) {
        int max;
        int max1 = 1;
        for (int i = 0; i < array.length; i++) {
            max = array[i];
            if (max > max1) {
                max1 = array[i];
            }
        }
        return max1;
    }

    public static int minArray(int[] array) {
        int min;
        int min1 = 1;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            if (min < min1) {
                min1 = array[i];
            }
        }
       return min1;
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
    public static int escalar (int [] array, int [] array2){
        int resultado=0;
        for (int i = 0; i < array.length; i++) {
            int multipliacion = array[i] * array2[i];
            resultado = resultado + multipliacion;
        }
        return resultado;
    }
    public static int[] invertirArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        return array;
    }


    public static void invertirArray2 (int [] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }

    public static boolean esCapicua(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio < fin) {
            if (array[inicio] != array[fin]) {
                return false;
            }
            inicio++;
            fin--;
        }

        return true;
    }
}
