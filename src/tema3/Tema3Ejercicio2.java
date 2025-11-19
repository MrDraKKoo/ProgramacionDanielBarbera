package tema3;

import java.util.Scanner;

import static tema3.Tema3Ejercicio1.numberSign;

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
        System.out.println("Dime un numero entero");
        int num = in.nextInt();
        numberSign(num);
        int resultado2 = numberSign(num);
        if (resultado2 ==1){
            System.out.println("Es positivo");
        } else if (resultado2 == -1) {
            System.out.println("Es negativo");
        }else{
            System.out.println("Es 0");
        }

        System.out.println("Dime la edad");
        int num2 = in.nextInt();
        boolean resultado = isAdult(num2);
        if (resultado){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
    }
}
