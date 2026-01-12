package tema4;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona persona1 = new Persona();
        System.out.println("Dime tu nombre");
        persona1.setNombre(in.nextLine());
        System.out.println(" tu primer apellido");
        persona1.getApellido1();
        System.out.println("Dime tu segundo apellido");
        System.out.println("Introduce tu DNI");

        Persona persona2 = new Persona();
    }
}
