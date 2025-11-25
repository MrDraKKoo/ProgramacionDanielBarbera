package tema3.modular2;

import java.util.Scanner;

public class MyMath {

    public static int sumaDigitos(int num){
        int suma = 0;
        while (num > 0) {
            suma= suma + num % 10;
            num = num / 10;
        }
        return suma;
    }

    public static void ecuacion2Grado(int a, int b, int c) {
        int D =b*b-4*a*c;
        if (D > 0){
            System.out.println("Tiene 2 soluciones");
        } else if (D < 0) {
            System.out.println("No tiene solucion");
        }else {
            System.out.println("Tiene 1 solucion");
        }
    }

    public static int factorial(int num){
       int resultado = 1;
        if (num < 0){
            System.out.println("Introduce un numero entero");
        }else{
            for (int i = 1; i <= num; i++) {
                resultado = resultado * i;
            }
        }
        return resultado;
    }

    public static int contadorDigitosImpares(int num){
        if (num == 0) {
            return 0;
        }

        int contador = 0;
        while (num > 0) {
            int digito = num % 10;

            if (digito % 2 != 0) {
                contador++;
            }

            num /= 10;
        }

        return contador;
    }

    public static int contadorDigitosPares(int num){
        if (num ==0){
            return 1;
        }
        int contador = 0;
        while (num > 0){
            int digito = num % 10;
            if (digito % 2 == 0){
                contador++;
            }
            num = num/10;
        }
        return contador;
    }

    public static int contarDigitos (int num){
        if (num == 0){
            return 1;
        }
        int contador = 0;
       while (num>0){
           num =num / 10;
           contador++;
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

