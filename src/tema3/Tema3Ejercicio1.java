package tema3;

import java.util.Scanner;
public class Tema3Ejercicio1 {

    public static int numberSign(int num){
        if (num < 0){
            return -1;
        } else if  (num > 0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime un numero entero");
        int num = in.nextInt();
        int resultado = numberSign(num);
        if (resultado ==1){
            System.out.println("El numero es positivo");
        } else if (resultado == -1) {
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es 0");
        }
    }
}
