package tema3.modular2;

import java.util.Scanner;

public class MyMath {

    /*
    9. Añade una función a MyMath que sume los dígitos de un número entero.
     */
    public static int sumaDigitos(int num){
        int suma = 0;
        while (num > 0) {
            suma= suma + num % 10;
            num = num / 10;
        }
        return suma;
    }

    /*
    8. Añade una función a MyMath que recibirá 3 coeficientes de una ecuación
    de segundo grado y devolverá cuántas soluciones tiene la ecuación (2, 1
    o 0).
     */

    public static int ecuacion2Grado(int a, int b, int c) {
        int D =b*b-4*a*c;
        if (D > 0){
            return 2;
        } else if (D < 0) {
            return 0;
        }else {
            return 1;
        }
    }

    /*
    7. Añade a MyMath una función que nos calcule el factorial de un número
    (de manera recursiva).
     */
    public static long factorialRecursivo (int num){
        if (num <=1) return 1;
        return num* factorialRecursivo(num-1);
    }

    /*
    6. Añade a MyMath una función que nos calcule el factorial de un número.
     */

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

    /*
    5. Añade a MyMath una función que devuelve el número de dígitos impares
    de un número entero.
    */
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

    /*
    4. Añade a MyMath una función que devuelve el número de dígitos pares de
    un número entero.
    */
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

    /*3. Añade a MyMath una función que nos indique el número de dígitos de un
    número entero.
    */
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

    /*2. Añade una función a MyMath que nos diga si un número es primo. Añade
    otra función que nos diga si un número NO es primo (reutiliza código).
    */
    public static boolean noPrimo(int num) {
        return !siPrimo(num);
    }
    public static boolean siPrimo(int num){
        int divisor = 2;
        int primo = 0;

        while (divisor < num){
            if (num % divisor ==0){
                return false;
            }
            divisor++;
        }
        return true;
    }

    /*1. Crea una clase MyMath que tendrá funciones para calcular el perímetro y
    el área de un círculo, cuadrado y rectángulo. Los nombres de las
    funciones serán:
    */
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
