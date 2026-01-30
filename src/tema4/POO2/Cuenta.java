package tema4.POO2;

public class Cuenta {
    private String num_cuenta;
    private double saldo;

    public Cuenta() {
        this.num_cuenta = "0000000000000000";
        this.saldo = 0.0;
    }

    public Cuenta(String num_cuenta, double saldo) {
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void recibirAbono(double cantidad) {
        if (cantidad > 0) {
            this.saldo = this.saldo + cantidad;
            System.out.println("Abono realizado. Nuevo saldo: " + this.saldo + "€");
        }
    }

    public void pagarRecibo(double cantidad) {
            this.saldo = this.saldo - cantidad;
            System.out.println("Recibo pagado. Nuevo saldo: " + this.saldo + "€");
    }
}