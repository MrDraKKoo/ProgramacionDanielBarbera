package tema8.AADD1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Piloto_main {
    static Scanner in = new Scanner(System.in);
    static PilotsCRUD pilotsCRUD = new PilotsCRUD();
    public static void main(String[] args) throws SQLException {
        int opcion = in.nextInt();
        boolean finalizar = false;
        while (!finalizar) {
            menu();
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    createPilot();
                    break;
                case 2:
                    readPilot();
                    break;
                case 3:
                    readPilot();
                    break;
                case 4:
                    updatePilot();
                    break;
                case 5:
                    deletePilot();
                    break;
                case 6:
                    showPilotClassification();
                    break;
                case 7:
                    showBuildersClassification();
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
    public static void createPilot () throws SQLException {
        System.out.println("Introduce el ID del piloto");
        int driverid = in.nextInt();
        in.nextLine();
        System.out.println("Introduce el code del pitloto");
        String code= in.nextLine();
        System.out.println("Introduce el nombre del piloto");
        String forename= in.nextLine();
        System.out.println("Introduce el surname del piloto");
        String surname= in.nextLine();
        System.out.println("Introduce el dob del piloto");
        String dob= in.nextLine();
        System.out.println("Introduce el nation name del piloto");
        String nationally= in.nextLine();
        System.out.println("Introduce el url del piloto");
        String url = in.nextLine();
        pilotsCRUD.añadirPiloto(driverid, code,forename, surname, dob, nationally, url);
    }
    public static void readPilot(){
        System.out.println("Introduce el ID del piloto");
        int driverid = in.nextInt();
        in.nextLine();
        pilotsCRUD.readPilot(driverid);
    }
    public static void readPilots(){
        pilotsCRUD.readPilots();
    }
    public static void updatePilot(){
        System.out.println("Introduce el ID del piloto");
        int driverid = in.nextInt();
        in.nextLine();
        System.out.println("Introduce el nuevo nombre del piloto");
        String forename= in.nextLine();
        pilotsCRUD.updatePilot(driverid, forename);
    }
    public static void deletePilot(){
        System.out.println("Introduce el ID del piloto");
        int driverid = in.nextInt();
        in.nextLine();
        pilotsCRUD.deletePilot(driverid);
    }
    public static void showPilotClassification(){
        pilotsCRUD.showPilotClassification();
    }
    public static void showBuildersClassification(){
        pilotsCRUD.showBuildersClassification();
    }

}
