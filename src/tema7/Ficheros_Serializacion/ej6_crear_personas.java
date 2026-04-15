package tema7.Ficheros_Serializacion;

import java.util.Scanner;

public class ej6_crear_personas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean finalizar = false;
        String nombre;
        int edad;
        Persona persona = new Persona();
        while (finalizar == false){
            menu();
            int opcion = in.nextInt();
            in.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Introduce un nombre:");
                    nombre = in.nextLine();
                    System.out.println("Introduce la edad:");
                    edad = in.nextInt();
                    persona = new Persona(nombre, edad);
                    break;

                case 2:
                    finalizar = true;
                    break;
                default: System.out.println("Has introducido un valor no valido");;

            }
        }
    }

    public static void menu (){
        System.out.println("\n***Menú***");
        System.out.println("1) Añadir persona a la lista");
        System.out.println("2) Salir");
    }
}
