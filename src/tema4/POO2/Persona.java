package tema4.POO2;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;
    private Cuenta[] cuentas = new Cuenta[3];
    private int cantidadCuentas = 0;

    public Persona (){
        this.nombre = "Dani";
        this.apellido1 = "Barberá";
        this.apellido2 = "Torres";
        this.DNI = "12345678A";

     }
    public Persona (String nombre, String apellido1, String apellido2, String DNI){
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.DNI = DNI;
    }

    public String getNombre()  {
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

    public void añadirCuenta(Cuenta nueva) {
        if (cantidadCuentas < 3) {
            cuentas[cantidadCuentas] = nueva;
            cantidadCuentas++;
            System.out.println("Cuenta " + nueva.getNumCuenta() + " añadida correctamente.");
        } else {
            System.out.println("Error: No se pueden añadir más de 3 cuentas a " + this.DNI);
        }
    }

    public boolean esMorosa() {
        for (int i = 0; i < cantidadCuentas; i++) {
            // Verificamos el saldo de cada cuenta que existe
            if (cuentas[i].getSaldo() < 0) {
                return true;
            }
        }
        return false;
    }
    public void mostrarInfo (){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Apelido1: "+this.apellido1);
        System.out.println("Apelido2: "+this.apellido2);
        System.out.println("DNI: "+this.DNI);
        System.out.println("Cuentas asociadas: "+cantidadCuentas);
    }

    public void mostrarDatosCuenta(String numCuenta) {
        boolean encontrada = false;
        for (int i = 0; i < cantidadCuentas; i++) {
            if (cuentas[i].getNumCuenta().equals(numCuenta)) {
                System.out.println("Cuenta: " + cuentas[i].getNumCuenta());
                System.out.println("Saldo: " + cuentas[i].getSaldo() + "€");
                encontrada = true;
            }
        }
        if (!encontrada) {
            System.out.println("ERROR: La cuenta no existe para esta persona.");
        }
    }
    public boolean gestionarMovimiento(String nCuenta, double cantidad, boolean esAbono) {
        for (int i = 0; i < cantidadCuentas; i++) {
            if (cuentas[i].getNumCuenta().equals(nCuenta)) {
                if (esAbono) {
                    cuentas[i].recibirAbono(cantidad); // Suma
                } else {
                    cuentas[i].pagarRecibo(cantidad); // Resta
                }
                return true;
            }
        }
        return false;
    }

}
