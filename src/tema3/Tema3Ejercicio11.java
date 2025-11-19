package tema3;

import java.util.Scanner;
class Mymath{
    public static double squarePerimeter(double ladocuadrado){
        Scanner in = new Scanner(System.in);
        System.out.println("Que quieres calcular?");
        System.out.println("1. Area");
        System.out.println("2.Perimetro");
        int opcion = in.nextInt();
        if (opcion == 1){
            double areacuadrado = ladocuadrado * ladocuadrado;
            return areacuadrado;
        }else{
            double cuadradoperimetro = ladocuadrado + ladocuadrado + ladocuadrado + ladocuadrado;
            return cuadradoperimetro;
        }
    }

}
public class Tema3Ejercicio11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Que figura quieres calcular:");
        System.out.println("a) Circulo");
        System.out.println("b) Cuadrado");
        System.out.println("c) Rectangulo");
        char opcion = in.next().charAt(0);
        switch (opcion){
            case 'a':
                System.out.println("Cuanto mide el lado del cuadrado?");
                double ladocuadrado = in.nextDouble();
                Mymath.squarePerimeter(opcion);
                double resultado1 = Mymath.squarePerimeter(opcion);
                System.out.println(resultado1);
        }
    }
}

