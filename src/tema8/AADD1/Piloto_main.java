package tema8.AADD1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Piloto_main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int opcion = in.nextInt();
        boolean finalizar = false;
        while (!finalizar) {
            menu();
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("Saliendo del prgrama");
                    finalizar = true;
                    break;
            }
        }
    }
    public static void menu(){
        System.out.println("1) recibe un objeto piloto y lo añade a la base de datos");
        System.out.println("2) recibe un entero y devuelve un piloto de la base de datos");
        System.out.println("3) devuelve una lista con todos los objetos de la clase piloto de la base de datos");
        System.out.println("4) recibe un objeto piloto y actualiza los datos en la base de datos");
        System.out.println("5) recibe un objeto piloto y lo elimina de la base de datos");
        System.out.println("6) muestra la clasificación final del mundial ordenada por puntos de los pilotos.");
        System.out.println("7) muestra la clasificación del mundial ordenada por puntos de los equipos.");
        System.out.println("8) Salir");
        System.out.println("Que quieres realizar?");
    }
}
