package tema5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gimnasio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Usuarios> usgym = new HashMap<>();
        String DNI;
        int opcion;
        do {
            System.out.println("\n"+"Que quieres hacer?");
            System.out.println("1. Dar de alta a un usuario");
            System.out.println("2. Dar de baja a un usuario");
            System.out.println("3. Mostrar datos de un usuario");
            System.out.println("4. Modificar un usuario");
            System.out.println("5. Salir");
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduce el DNI del nuevo usuario");
                    DNI = in.nextLine();
                    if (usgym.containsKey(DNI)){
                        System.out.println("Ese DNI ya lo esta usuando otro usuario");
                    }else {
                        System.out.println("Introduce el nombre:");
                        String nombre = in.nextLine();
                        System.out.println("Introduce la edad:");
                        int edad = in.nextInt();
                        usgym.put(DNI,new Usuarios(nombre, edad));
                    }
                    break;
                case 2:
                    System.out.println("Introduce el DNI del usuario que quieres dar de baja:");
                    DNI = in.nextLine();
                    if (usgym.containsKey(DNI)){
                        usgym.remove(DNI);
                    }else {
                        System.out.println("El DNI introducido no pertenece a ningún usuario dado de alta");
                    }
                    break;
                case 3:
                    System.out.println("Inrtoduce el DNI del usuario que quieres ver:");
                    DNI = in.nextLine();
                    if (usgym.containsKey(DNI)) {
                        System.out.println("EL DNI " + DNI + " pertenece a:");
                        System.out.println("Nombre: " + usgym.get(DNI).getNombre());
                        System.out.println("Edad: " + usgym.get(DNI).getEdad());
                    }else {
                        System.out.println("El DNI introducido no pertenece a un usuario dado de alta");
                    }
                    break;
                case 4:
                    System.out.println("Introduce el DNI del usuario que quieres modificar:");
                    DNI = in.nextLine();
                    if (usgym.containsKey(DNI)) {
                        System.out.println("Introduce el nuevo nombre del usaurio:");
                        String nombre = in.nextLine();
                        System.out.println("Introduce la nueva edad:");
                        int edad = in.nextInt();
                        usgym.put(DNI,new Usuarios(nombre, edad));
                    }else{
                        System.out.println("No hay un usuario con ese DNI dado de alta");
                    }

                    break;
            }
        }while (opcion !=5);
        System.out.println("Has cerrado el programa");
    }
}
