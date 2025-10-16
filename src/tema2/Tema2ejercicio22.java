package tema2;

import java.util.Scanner;

public class Tema2ejercicio22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero entero para saber la cantidad de cifras");
        int num = in.nextInt();
        int digitos = 0;

        while (num >= 1) {
            num = num / 10;
            digitos = digitos + 1;
        }
        System.out.println("La cantidad de cifras del numoro introducido es = "+digitos);

    }
}




