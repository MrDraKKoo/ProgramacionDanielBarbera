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
        System.out.println("l) Programa con un menú que te permita introducir uno o dos vectores y hacer todas las operaciones anteriores.");
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
                suma2Vectores(array,array2);
                break;
            case 'g':
                array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                array2 = new int []{10,11,12,13,14,15,16,17,18};
                resta2Vectores(array, array2);
                break;
            case 'h':
                array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                array2 = new int []{10,11,12,13,14,15,16,17,18};
                System.out.println("El resultado del escalado es = "+escalar(array,array2));
                break;
            case 'i':
                array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                invertirArray(array);
                break;
            case 'j':
                array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                invertirArray2(array);
                break;
            case 'k':
                int [] array3;
                array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
                array2 = new int []{10,11,12,13,14,15,16,17,18};
                array3 = new int []{1,2,3,2,1};
                Scanner sc = new Scanner(System.in);
                System.out.println("Diem que array quieres comprobar si es capicua o no:");
                System.out.println("1- array1");

                System.out.println("2- array2");
                System.out.println("3- array3");
                int respuesta = sc.nextInt();
                switch (respuesta){
                    case 1:
                        if (esCapicua(array)){
                            System.out.println("si es");
                        }else{
                            System.out.println("no es");
                        }
                    case 2:
                        if (esCapicua(array2)){
                            System.out.println("si es");
                        }else{
                            System.out.println("no es");
                        }
                    case 3:
                        if (esCapicua(array3)){
                            System.out.println("si es");
                        }else{
                            System.out.println("no es");
                        }
                }
                break;
            case 'l':
                System.out.println("Introduce los números separados por espacios para crear un array");

                String[] tokens = in.nextLine().split(" "); 
                int[] arrayDeuser1 = new int[tokens.length];

                for (int i = 0; i < tokens.length; i++)
                    arrayDeuser1[i] = Integer.parseInt(tokens[i]);
                
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
                switch (opcion){
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
                        System.out.println("Introduce los números separados por espacios para crear otro array ya que necesitamos otro");

                        String[] tokens2 = in.nextLine().split(" ");
                        int[] arrayDeuser2 = new int[tokens.length];

                        for (int i = 0; i < tokens.length; i++)
                            arrayDeuser2[i] = Integer.parseInt(tokens[i]);
                        
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
                        array3 = new int []{1,2,3,2,1};
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
                            case 2:
                                if (esCapicua(arrayDeuser2)){
                                    System.out.println("si es");
                                }else{
                                    System.out.println("no es");
                                }
                            case 3:
                                if (esCapicua(array3)){
                                    System.out.println("si es");
                                }else{
                                    System.out.println("no es");
                                }
                        }
                        break;
        }

    }
}
}
