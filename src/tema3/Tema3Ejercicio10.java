package tema3;

import java.util.Scanner;

import static tema3.Tema3Ejercicio1.numberSign;
import static tema3.Tema3Ejercicio2.isAdult;
import static tema3.Tema3Ejercicio3.*;
import static tema3.Tema3Ejercicio4.*;
import static tema3.Tema3Ejercicio5.tabla;
import static tema3.Tema3Ejercicio7.primoONo;
import static tema3.Tema3Ejercicio8.comprobacion;
import static tema3.Tema3Ejercicio9.priamide;

public class Tema3Ejercicio10 {
    public static void menu (char opcion, String[] args){
        Scanner in = new Scanner(System.in);
        switch (opcion){
            case 'a':
                System.out.println("Dime un numero entero");
                int num = in.nextInt();
                int resultado = numberSign(num);

                if (resultado ==1){
                    System.out.println("El numero es positivo");
                } else if (resultado == -1) {
                    System.out.println("El numero es negativo");
                }else{
                    System.out.println("El numero es 0");
                }
                break;
            case 'b':
                System.out.println("Dime un numero entero");
                int num2 = in.nextInt();
                Tema3Ejercicio1.numberSign(num2);
                int resultado2 = Tema3Ejercicio1.numberSign(num2);
                if (resultado2 ==1){
                    System.out.println("Es positivo");
                } else if (resultado2 == -1) {
                    System.out.println("Es negativo");
                }else{
                    System.out.println("Es 0");
                }

                System.out.println("Dime la edad");
                int num3 = in.nextInt();
                boolean resultado3 = isAdult(num3);
                if (resultado3 == true){
                    System.out.println("Es mayor de edad");
                }else{
                    System.out.println("Es menor de edad");
                }
                break;
            case 'c':
                System.out.println("Introduce el valor del radio del circulo");
                double r = in.nextInt();
                boolean validacion = validRadius(r);
                double perimetro2 = calculateCireclePermieter(r);
                double area2 = calulateCircleArea(r);
                if (validacion == false){
                    System.out.println("Has introducido un valor no valido");
                }else{
                    System.out.println("El perimetro es "+perimetro2);
                    System.out.println("El area es "+area2);
                }
                break;
            case 'd':
                showMenu();
                int respuesta = in.nextInt();
                System.out.println("Dime la cantidad de dinero");
                double dinero = in.nextDouble();
                double euroAdollar = euro2dollar(dinero);
                double dollarAeuro = dollar2euro(dinero);

                if (respuesta == 1){
                    System.out.println("Tus euros son "+euroAdollar+"$");
                }else{
                    System.out.println("Tus dollares son "+dollarAeuro+"€");
                }
                break;
            case 'e':
                System.out.println("Dime un numero del 1 al 10");
                int num4 = in.nextInt();
               tabla(num4);                break;
            case 'f':
                System.out.println("Dime un numero del 1 al 10");
                int num5 = in.nextInt();
                tabla(num5);
                break;
            case 'g':
                System.out.println("Dime un numero entero positivo");
                int num6 = in.nextInt();
                while (num6 >0) {
                    primoONo(num6);
                    System.out.println("vuelve a introducir un numero,o introduce 0 o <0 para salir");
                    num6 = in.nextInt();
                }
                break;
            case 'h':
                System.out.println("Dime el dia");
                int dia = in.nextInt();
                System.out.println("Dime el mes");
                int mes = in.nextInt();
                System.out.println("Diem el año");
                int ano = in.nextInt();
                comprobacion(mes,ano,dia);
                break;
            case 'i':
                System.out.println("Dime que caracter quieres");
                char caracter = in.next().charAt(0);
                System.out.println("el numero de lienas de la priamide");
                int lineas = in.nextInt();
                priamide(caracter, lineas);
                break;
        }
    }
    public static void menuEscrito(){
        System.out.println("Que ejercicio quires realizar?");
        System.out.println("a) Muestra el signo de un número introducido por el usuario.");
        System.out.println("b) Indica si el usuario es mayor de edad o no.");
        System.out.println("c) Calcula el área y perímetro de un círculo.");
        System.out.println("d) Conversor de euros a dólares y de dólares a euros.");
        System.out.println("e) Mostrar tabla de multiplicar de un número.");
        System.out.println("f) Mostrar tablas de multiplicar del 1 al 10.");
        System.out.println("g) Comprobador de números primos.");
        System.out.println("h) Comprobador de fechas.");
        System.out.println("i) Dibujar triángulos.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        menuEscrito();
        char opcion = in.next().charAt(0);
        menu(opcion,args);
    }
}
