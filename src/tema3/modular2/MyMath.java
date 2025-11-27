package tema3.modular2;

import java.util.Scanner;

public class MyMath {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int num = in.nextInt();
        System.out.println(contarDigitos(num));
    }

    public static int contarDigitos (int num){
        int contador;
        for (contador = 0; num >= 10; contador++){
            num = num / 10;
            if (num < 10 && num > 1){
                contador++;
            }
        }
        return contador;
    }

    public static boolean noPrimo(int num) {
        int divisor = 2;
        int NOprimo = 0;

        while (divisor < num) {
            if (num % divisor == 0) {
                return true;
            }
            divisor++;
        }
        return false;
    }
    public static boolean siPrimo(int num){
        int divisor = 2;
        int primo = 0;

        while (divisor < num){
            if (num % divisor !=0){
                return false;
            }
            divisor++;
        }
        return true;
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

