package tema4.POO2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Cuenta {
    private String num_cuenta;
    private double saldo;
    public Cuenta (){
        this.num_cuenta = "1122334455667788";
        this.saldo = 4300;
    }
    public Cuenta(String num_cuenta, double saldo){
        this.num_cuenta = num_cuenta;
        this.saldo = saldo;

    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        Scanner in = new Scanner(System.in);
        while (this.num_cuenta.length() != 16){
            System.out.println("Has introducido un numero de cuenta incorrecto porq tiene mas de 16 digitos");
            System.out.println("Introducelo de nuevo");
            this.num_cuenta = in.nextLine();
        }
        this.num_cuenta = num_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarSaldo (){
        System.out.println("Tu saldo actual es de: "+this.saldo+"€");
    }

    public void recibirAbono (double abono){
        System.out.println("Se ha hecho un abono de "+abono);
        this.saldo = this.saldo +abono;
        System.out.println("Tu saldo actual es de "+this.saldo+"€");
    }

    public void pagarRecibo(double recibo) {
        System.out.println("Se ha realizado un pago por un recibo de un total de "+recibo +"€");
        this.saldo = this.saldo - recibo;
        System.out.println("Tu saldo actual es de "+this.saldo+"€");
    }
}
