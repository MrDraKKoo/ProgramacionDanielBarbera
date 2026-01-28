package tema4.POO1;

import java.util.Scanner;

public class Persona {
    private final String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    int edad;
    private static final int adultAge = 18;
    private static final int  retiredAge = 65;
    private static  final int defaultAge = 20;
    public Persona (){ // constructor vacio
        DNI = "11223344D";
        nombre = "Daniel";
        apellido1 = "Barberá";
        apellido2 = "Torres";
        edad = 20;
    }
    public Persona (String DNI, String nombre, String apellido1, String apellido2, int edad){ // constructor entero
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }
    public Persona(String DNI){
        this.DNI = DNI;
    }
    public static String isCheckDNI (){
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce SOLO los numeros del DNI");
        int numeroDNI = in.nextInt();
        System.out.println("Introduce SOLO la letra del DNI");
        char letraUsuario = in.next().toUpperCase().charAt(0);
        int posicion = numeroDNI % 23;


        if (letras[posicion] == letraUsuario) {
            return "El DNI es valido";
        } else {
            return "El DNI NO es valido";
        }
    }
    public static int ageDiference (int edad, int edad2){

        if (edad > edad2){
            return (edad - edad2);
        } else if (edad < edad2){
            return  (edad2 - edad);
        }else {
            return 0;
        }
    }

    public String getDNI() {
        return DNI;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 100 && edad > 0) {
            this.edad = edad;
        }else {
            this.edad = defaultAge;
        }
    }

    public String isAdult(){
        if (edad >= adultAge){
            return "Es mayor de edad";
        }else {
            return "Es menor de edad";
        }
    }

    public String isRetired (){
        if (edad >= retiredAge){
            return "Esta retirado";
        }else {
            return "NO esta retirado";
        }
    }

    public String toString () {
        return "Nombre: " + nombre + "\n" + "Apellido1: " + apellido1 + "\n" + "Apellido2: " + apellido2 + "\n" + "Edad: " + edad + "\n" + "DNI: " + DNI;
    }
}
