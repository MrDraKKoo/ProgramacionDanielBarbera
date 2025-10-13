package tema2;
import java.util.Scanner;
public class Tema2ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el lado del cuadrado");
        double lado = in.nextDouble();
        System.out.println("El laod mide = "+lado);
                double superficie = lado * lado;
                double perimetro = lado + lado + lado + lado;
        System.out.println("La superficie es = "+superficie);
        System.out.println("El preimetro es = "+perimetro);

    }
}
