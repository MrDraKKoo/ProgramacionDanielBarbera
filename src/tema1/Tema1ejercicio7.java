package tema1;

import java.util.Scanner;

public class Tema1ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 6");
                int cara = in.nextInt();
        if (cara >= 1) if (cara <= 6) {
            cara = 7 - cara;
            System.out.println("La cara contraria de la moneda = " + cara);
        }else{
            System.out.println("El nuḿero es invalido");
        }
    }
}

