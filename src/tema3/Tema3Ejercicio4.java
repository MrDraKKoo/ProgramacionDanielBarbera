package tema3;

import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static void showMenu() {
        System.out.println("Elige que opcion quieres realizar");
        System.out.println("1.Euros a Dollar");
        System.out.println("2.Dollar a Euros");
    }
    public static double euro2dollar (double dinero){
        dinero = dinero *1.17;
        return dinero;
    }
    public static double dollar2euro (double dinero){
        dinero = dinero *0.87;
        return dinero;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        showMenu();
        System.out.println("introduce tu opciíon:");
        int respuesta = in.nextInt();
        System.out.println("Dime la cantidad de dinero");
        double dinero = in.nextDouble();
        double euroAdollar;
        double dollarAeuro;

        if (respuesta == 1){
            euroAdollar = euro2dollar(dinero);
            System.out.println("Tus euros son "+euroAdollar+"$");
        }else{
            dollarAeuro = dollar2euro(dinero);
            System.out.println("Tus dollares son "+dollarAeuro+"€");
        }
    }
}
