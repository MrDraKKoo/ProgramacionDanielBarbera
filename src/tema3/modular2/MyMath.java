package tema3.modular2;

import java.util.Scanner;

public class MyMath {

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
    }
    public static double squarePerimeter (double ladocuadrado){
        double cuadradoperimetro = ladocuadrado + ladocuadrado + ladocuadrado + ladocuadrado;
        return cuadradoperimetro;
    }

    public static double squareArea (double ladocuadrado){
        double areacuadrado = ladocuadrado * ladocuadrado;
        return areacuadrado;
    }

    public static double rectanglePerimeter (double baserectangulo, double alturarectangulo ){
        double perimetrorectangulo = (baserectangulo + alturarectangulo) * 2;
        return perimetrorectangulo;
    }

    public static double rectangleArea (double baserectangulo, double alturarectangulo ){
        double arearectangulo= baserectangulo * alturarectangulo;
        return arearectangulo;
    }
    public static double circlePerimeter (double radio ){
        double perimetrocirculo= 2 * 3.14 * radio;
        return perimetrocirculo;
    }
    public static double circleArea (double radio ){
        double areacirculo= 3.14 * (radio * radio);
        return areacirculo;
    }


}

