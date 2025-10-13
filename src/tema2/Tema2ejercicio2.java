package tema2;

import java.util.Scanner;

public class Tema2ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime primero cuanto mide la base y luego la altura del rectángulo" );
            double base = in.nextDouble();
            double altura = in.nextDouble();
            System.out.println("La base es = "+base);
            System.out.println("La altura es = "+altura);
            double superficie = base * altura;
            double perimetro = 2 * (base + altura);
        System.out.println("La superficie es = "+superficie);
        System.out.println("El preimetro es = "+perimetro);
    }
}
