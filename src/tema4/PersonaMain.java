package tema4;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce tu DNI");
        Persona persona1 = new Persona(in.nextLine());
        System.out.println("Introduce tu nombre");
        persona1.setNombre(in.nextLine());

        System.out.println("Introduce tu primer apellido");
        persona1.setApellido1(in.nextLine());

        System.out.println("Introduce tu segundo apellido");
        persona1.setApellido2(in.nextLine());

        System.out.println("Introduce tu edad");
        persona1.setEdad(in.nextInt());
        System.out.println(persona1);
        System.out.println(persona1.isAdult());
        System.out.println(persona1.isRetired());
        System.out.println(Persona.isCheckDNI());


        System.out.println("Introduce tu DNI");
        in.nextLine();
        Persona persona2 = new Persona(in.nextLine());
        System.out.println("Introduce tu nombre");
        persona2.setNombre(in.nextLine());

        System.out.println("Introduce tu primer apellido");
        persona2.setApellido1(in.nextLine());

        System.out.println("Introduce tu segundo apellido");
        persona2.setApellido2(in.nextLine());

        System.out.println("Introduce tu edad");
        persona2.setEdad(in.nextInt());
        System.out.println(persona2);
        System.out.println(persona2.isAdult());
        System.out.println(persona2.isRetired());
        System.out.println(Persona.isCheckDNI());

        System.out.println("La diferencia de edad es de: "+Persona.ageDiference(persona1.edad, persona2.edad)+" años");


    }
}
