package tema4.POO2;

public class Cuenta {
    private String num_cuenta;
    private double saldo;

    public Cuenta() {
        this.num_cuenta = "0000000000000000";
        this.saldo = 0.0;
    }

    // Constructor con parámetros
    public Cuenta(String num_cuenta, double saldo) {
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }

    // Getters y Setters
    public String getNumCuenta() {
        return num_cuenta;
    }

    public void setNumCuenta(String num_cuenta) {
        if (num_cuenta.length() == 16) {
            this.num_cuenta = num_cuenta;
        } else {
            System.out.println("Error: El número de cuenta debe tener 16 dígitos.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos de comportamiento
    public void recibirAbono(double cantidad) {
        if (cantidad > 0) {
            this.saldo = this.saldo + cantidad;
            System.out.println("Abono realizado. Nuevo saldo: " + this.saldo + "€");
        }
    }

    public void pagarRecibo(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo = this.saldo - cantidad;
            System.out.println("Recibo pagado. Nuevo saldo: " + this.saldo + "€");
        } else {
            System.out.println("Saldo insuficiente para pagar el recibo de " + cantidad + "€");
        }
    }
}