package tema3;

import java.util.Scanner;

public class Tema3Ejercicio3 {

    public static boolean validRadius(double r){
        if (r >0){
            return true;
        }else {
            return false;
        }
    }
    public static double calculateCireclePermieter (double r){
        double perimetro = 2 * 3.14 * r;
        return perimetro;
    }
    public static double calulateCircleArea (double r){
        double area = 3.14 * (r *r);
        return area;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
    }
}
