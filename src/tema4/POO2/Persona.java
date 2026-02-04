package tema4.POO2;

public class Persona {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String DNI;
    private Cuenta[] cuentas = new Cuenta[3];
    private int contadorCuentas = 0;



    public Persona() {
        this.nombre = "Dani";
        this.apellido1 = "Barberá";
        this.apellido2 = "Torres";
        this.DNI = "12345678A";

    }

    public Persona(String nombre, String apellido1, String apellido2, String DNI) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.DNI = DNI;

    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void setCuentas(Cuenta[] cuentas) {
        this.cuentas = cuentas;
    }

    public int getContadorCuentas() {
        return contadorCuentas;
    }

    public void setContadorCuentas(int contadorCuentas) {
        this.contadorCuentas = contadorCuentas;
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
        this.DNI = DNI;
    }

    public void añadirCuenta(Cuenta nuevaCuenta) {
        if (contadorCuentas < 3) {
            cuentas[contadorCuentas] = nuevaCuenta;
            contadorCuentas++;
        } else {
            System.out.println("Error: Esta persona ya tiene el máximo de 3 cuentas.");
        }
    }

    public boolean esMorosa() {
        boolean esMorosa = false;
        for (int i = 0; i < contadorCuentas; i++) {
            if (cuentas[i].getSaldo() < 0) {
                esMorosa = true;
            }
        }
        return esMorosa;
    }

    public String toString() {
        return nombre + " " + apellido1 + " (DNI: " + DNI + ")";
    }
}