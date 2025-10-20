package tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2ejercicio29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Intenta adivinar el numero secreto, tienes 5 intentos");
        Random random = new Random();
        int randomInt = random.nextInt(100)+1;
        int num = in.nextInt();
        while (num != randomInt) {
            if (num > randomInt) {
                System.out.println("Has fallado el numeor es menor");
            } else {
                System.out.println("Has fallado el numeor es mayor");
            }
            num = in.nextInt();
        }
        System.out.println("Has acertado el numeor era "+randomInt);
    }
}
