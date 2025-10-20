package tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2ejercicio28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Intenta adivinar el numero secreto, tienes 5 intentos");
        Random random = new Random();
        int randomInt = random.nextInt(99999);

        for (int cont = 0; cont < 5; cont++){
            int num = in.nextInt();
            if (num == randomInt){
                System.out.println("Has acertado");
                break;
            }else {
                System.out.println("Has fallado");
            }

        }
        System.out.println("El numero secreto era "+randomInt);
    }
}
