package tema4.POO2;

import java.util.Scanner;

public class Cuenta {
    String num_cuenta;
    double saldo;
    public Cuenta (){
        this.num_cuenta = "1122334455667788";
        this.saldo = 100;
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
}
