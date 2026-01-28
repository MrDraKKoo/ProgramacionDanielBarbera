package tema4.POO2;

import java.util.Scanner;

public class Persona {
    String nombre;
    String apellido1;
    String apellido2;
    String DNI;

    public Persona (){
        this.nombre = "Dani";
        this.apellido1 = "Barberá";
        this.apellido2 = "Torres";
        this.DNI = DNI;
    }
    public Persona (String nombre, String apellido1, String apellido2, String DNI){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        Scanner in = new Scanner(System.in);
        while (this.DNI.length() != 9){
            System.out.println("El DNI es incorrecto porq pasa de los 9 digitos");
            System.out.println("Introducelo de nuevo");
            this.DNI = in.nextLine();
        }
        this.DNI = DNI;

    }
}
