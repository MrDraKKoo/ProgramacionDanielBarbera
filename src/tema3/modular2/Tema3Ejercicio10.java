package tema3.modular2;

import java.util.Scanner;

import static tema3.modular2.MyMath.*;

public class Tema3Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("1- Calculos areas y perimetros");
        System.out.println("2- Si un número NO es primo");
        int respuesta = in.nextInt();
        switch (respuesta){
            case 1:
                System.out.println("Que figura quieres calcular:");
                System.out.println("a) Circulo");
                System.out.println("b) Cuadrado");
                System.out.println("c) Rectangulo");
                char opcion = in.next().charAt(0);
                switch (opcion){
                    case 'a':
                        System.out.println("Cuanto mide el lado del cuadrado?");
                        double ladocuadrado = in.nextDouble();
                        System.out.println("Que quieres calcular?");
                        System.out.println("1) Perimetro");
                        System.out.println("2) Area");
                        int calculo = in.nextInt();
                        if (calculo == 1){
                            System.out.println("El perimetro es "+squarePerimeter(ladocuadrado));
                        }else {
                            System.out.println("El area es " + squareArea(ladocuadrado));
                        }
                        break;

                    case 'b':
                        System.out.println("Dime la medida de la base de rectangulo");
                        double baserectangulo = in.nextDouble();
                        System.out.println("Dime la altura del rectangulo");
                        double alturarectangulo = in.nextDouble();
                        System.out.println("Que quieres calcular?");
                        System.out.println("1) Perimetro");
                        System.out.println("2) Area");
                        int calculo2 = in.nextInt();
                        if (calculo2 == 1){
                            System.out.println("El perimetro es "+rectanglePerimeter(baserectangulo, alturarectangulo));
                        }else {
                            System.out.println("El area es " + rectangleArea(baserectangulo,alturarectangulo));
                        }
                        break;
                    case 'c':
                        System.out.println("Cuanto mide el radio del circulo?");
                        double radio = in.nextDouble();
                        System.out.println("Que quieres calcular?");
                        System.out.println("1) Perimetro");
                        System.out.println("2) Area");
                        int calculo3 = in.nextInt();
                        if (calculo3 == 1){
                            System.out.println("El perimetro es "+circlePerimeter(radio));
                        }else {
                            System.out.println("El area es " + circleArea(radio));
                        }
                        break;
                }
            case 2:
                System.out.println("dime un numero");
                int num = in.nextInt();
                boolean noPrimo = noPrimo(num);
                boolean siPrimo = siPrimo(num);

                if (noPrimo) {
                    System.out.println("No es primo");
                }
                if (siPrimo) {
                    System.out.println("Si es primo");
                }
                break;
            case 3:
        }
    }
}
