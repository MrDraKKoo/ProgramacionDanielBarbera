package tema2;

import java.util.Scanner;

public class Tema2ejercicio30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("CALCULADORA");
        System.out.println("introduce un numero");
        int num1 = in.nextInt();
        System.out.println("introduce otro numero");
        int num2 = in.nextInt();
        System.out.println("que operacion quieres realizar con estos numero: +, -, *, /, %");
        char operacion = in.next().charAt(0);

        while (operacion == '+' || operacion == '-' || operacion == '*' || operacion == '/' || operacion == '%') {
            if (operacion == '+') {
                int resultado = num1 + num2;
                System.out.println("La suma es " + resultado);
            } else if (operacion == '-') {
                int resultado = num1 - num2;
                System.out.println("La resta es " + resultado);
            } else if (operacion == '*') {
                int resultado = num1 * num2;
                System.out.println("La multiplicacion es " + resultado);
            } else if (operacion == '/') {
                int resultado = num1 / num2;
                System.out.println("La division es " + resultado);
            } else if (operacion == '%') {
                int resultado = num1 % num2;
                System.out.println("El residuo es " + resultado);
            }
            System.out.println("Si quieres salir introduce salir, si quieres continuar introduce culquier otro texto" );
            String salir = in.next();
            if (salir.equalsIgnoreCase("salir") || salir.equalsIgnoreCase("Salir")) {
                break;
            } else {
                System.out.println("Dime otro numero para seguir operando");
                num1 = in.nextInt();
                System.out.println("Dime otro numero para seguir operando");
                num2 = in.nextInt();
                System.out.println("Dime otro operador para continuar:  +, -, *, /, %");
                operacion = in.next().charAt(0);
            }
        }
    }
}
