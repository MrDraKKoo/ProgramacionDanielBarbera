package tema3;

import java.util.Scanner;

public class Tema3Ejercicio2 {

    public static boolean isAdult(int num2){
        if (num2 >= 18){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //llamar a la funcion del ej 1 con el resultado
        System.out.println("Dime un numero entero");
        int num = in.nextInt();
        Tema3Ejercicio1.numberSign(num);
        int resultado2 = Tema3Ejercicio1.numberSign(num);
        if (resultado2 ==1){
            System.out.println("Es positivo");
        } else if (resultado2 == -1) {
            System.out.println("Es negativo");
        }else{
            System.out.println("Es 0");
        }


        //preguntar la edad con la respuesta
        System.out.println("Dime la edad");
        int num2 = in.nextInt();
        boolean resultado = isAdult(num2);
        if (resultado == true){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
