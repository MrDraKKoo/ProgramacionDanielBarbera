package tema4.POO2;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Que quieres realizar?");
        System.out.println("1) Introducir persona nueva" +"\n"+
                "2)Crear 1 cuenta y asociarla a 1 persona" +"\n"+
                "3)Mostrar datos de una cuenta (por su DNI) +" +"\n"+
                "4)Recibir la nómina mensual de una persona (por DNI y núm de cuenta)" +"\n"+
                "5)Recibir un pago (por DNI y núm de cuenta)" +"\n"+
                "6)Realizar transferencia entre cuentas" +"\n"+
                "7)Imprimir las perosnas morosas");
    }
}
