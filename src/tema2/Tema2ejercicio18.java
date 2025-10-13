package tema2;

import java.util.Scanner;

public class Tema2ejercicio18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime que numero quieres que calcule su raiz cuadrada");
        int num = in.nextInt();
        if (num < 0){
            System.out.println("Error, no se puede calcular con numeros negativos");
        }else{
            double raiz = Math.sqrt(num);
            System.out.println("La raíz cuadrada de " + num + " es " + raiz);

        }
    }
}
