package tema4.POO2;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;
    private Cuenta[] cuentas;
    private int contadorCuentas;

    // --- CONSTRUCTORES ---

    public Persona() {
        this.nombre = "Dani";
        this.apellido1 = "Barberá";
        this.apellido2 = "Torres";
        this.DNI = "12345678A";
        this.cuentas = new Cuenta[3];
        this.contadorCuentas = 0;
    }

    public Persona(String nombre, String apellido1, String apellido2, String DNI) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.DNI = DNI;
        this.cuentas = new Cuenta[3];
        this.contadorCuentas = 0;
    }

    // --- GETTERS Y SETTERS ---

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
        this.DNI = DNI;
    }

    public int getContadorCuentas() {
        return contadorCuentas;
    }


    public void añadirCuenta(Cuenta c) {
        if (this.contadorCuentas < 3) {
            this.cuentas[this.contadorCuentas] = c;
            this.contadorCuentas++;
        } else {
            System.out.println("Error: Esta persona ya tiene el máximo de 3 cuentas.");
        }
    }

    public boolean esMorosa() {
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getSaldo() < 0) {
                return true;
            }
        }
        return false;
    }

    public void mostrarDatos() {
        System.out.println("DNI: " + DNI + " | Nombre: " + nombre + " " + apellido1 + " " + apellido2);
        if (contadorCuentas == 0) {
            System.out.println("   (No tiene cuentas asociadas)");
        } else {
            for (int i = 0; i < contadorCuentas; i++) {
                System.out.println("   Cuenta " + (i + 1) + ": " + cuentas[i].getNumCuenta() + " | Saldo: " + cuentas[i].getSaldo() + "€");
            }
        }
    }

    public int buscarIndiceCuenta(String numCuenta) {
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getNumCuenta().equals(numCuenta)) {
                return i;
            }
        }
        return -1;
    }

    public Cuenta obtenerCuenta(int indice) {
        return cuentas[indice];
    }
}