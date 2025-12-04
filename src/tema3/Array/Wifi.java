package tema3.Array;

import java.util.Scanner;

public class Wifi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] habtiaciones;
        int [] cobertura;
        int [] resultado = new int [20];
        habtiaciones = new int []{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        cobertura = new int []{1,2,3,4,5,6};
        System.out.println("Dime que habitacion quieres meter el router de la 1 a la 20");
        int opcion = in.nextInt() - 1;
        System.out.println("Dime la potencia del router (1 a 6):");
        int potencia = in.nextInt();
        resultado[opcion]= potencia;
        senyal(opcion,resultado, potencia);
    }
    public static void senyal(int opcion, int[] resultado, int potencia) {
        int valor = potencia - 1;

        for (int i = opcion + 1; i < 20 && valor > 0; i++) {
            resultado[i] = valor;
            valor--;
        }

        valor = potencia - 1;
        for (int i = opcion - 1; i >= 0 && valor > 0; i--) {
            resultado[i] = valor;
            valor--;
        }

        for (int i = 0; i < 20; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
