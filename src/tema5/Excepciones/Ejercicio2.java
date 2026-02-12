package tema5.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            System.out.println("Introduce un numero:");
            int num1 = in.nextInt();
            System.out.println("Inroduce otro numero:");
            int num2 = in.nextInt();
            double division = num1 / num2;
            System.out.println("la division es: "+division);
        } catch (InputMismatchException ex){
            System.out.println("Error: "+ex.getMessage());
            System.out.println("Valor introducido incorrecto");
        } catch (ArithmeticException ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }
}
