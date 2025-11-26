package tema3.modular2;

import java.util.Scanner;

import static tema3.modular2.MyMath.*;

public class Tema3Ejercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("1- Calculos areas y perimetros");
        System.out.println("2- Si un número NO es primo");
        System.out.println("3- Numero de digitoos de un numero enteroo");
        System.out.println("4- Numero de digitos pares de un numero entero");
        System.out.println("5- Numero de digitos impares de un numero entero");
        System.out.println("6- Factoorial de un numero entero");
        System.out.println("7- Factorial de un numero entero (de manera recursiva)");
        System.out.println("8- Ecuacion de segundo grado");
        System.out.println("9- Suma de los digitos de un numero entero");
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
                System.out.println("Ingresa un numero para decir cuantos digitos tiene");
                int contadDigitos = in.nextInt();
                System.out.println("Tiene "+contarDigitos(contadDigitos)+" digitos");
            case 4:
                System.out.println("Ingresa un numero para decir cuantos digitos pares tiene");
                int pares = in.nextInt();
                System.out.println("Tiene "+contadorDigitosPares(pares)+" digitos pares");
            case 5:
                System.out.println("Ingresa un numero para decir cuantos digitos impares tiene");
                int impares = in.nextInt();
                System.out.println("Tiene "+contadorDigitosImpares(impares)+" digitos impares");
            case 6:
                System.out.println("Introduce el numero el cual quires saber su factorial");
                int numfact = in.nextInt();
                System.out.println("El factorial de " + numfact + " es " + factorial(numfact));
            case 7:
                System.out.println("introduce un numero para saber su factorial recursivo");
                int factorialrecursivo = in.nextInt();
                System.out.println("El factorial recursivo es: "+factorialRecursivo(factorialrecursivo));
            case 8:
                System.out.println("Introduce el valor de 'a' ");
                int a = in.nextInt();
                System.out.println("Introduce el valor de 'b' ");
                int b = in.nextInt();
                System.out.println("Introduce el valor de 'c' ");
                int c = in.nextInt();
                int resultados = ecuacion2Grado(a,b,c);
                if (resultados == 2){
                    System.out.println("Tiene 2 soluciones");
                } else if (resultados == 1) {
                    System.out.println("No tiene solucion");
                }else {
                    System.out.println("Tiene 1 solucion");
                }
                break;

            case 9:
                System.out.println("Introduce un numero entero");
                int numero2 = in.nextInt();
                System.out.println("La suma de los digitos es "+sumaDigitos(numero2));
        }
    }
}