package Ejercicio2;

public class Tarjeta implements IDinero{
    private String numero;
    private double saldo;
    private double credito;

    private final String DEFAULT_NUMERO = "1234";
    private final double DEFAULT_SALDO = 590;
    private final double DEFAULT_CREDITO = 100;
    public Tarjeta (String numero, double saldo, double credito){
        this.numero =numero;
        this.saldo = saldo;
        this.credito = credito;
    }
    public Tarjeta (){
        this.numero =DEFAULT_NUMERO;
        this.saldo = DEFAULT_SALDO;
        this.credito = DEFAULT_CREDITO;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public double valor (){
        return saldo + credito;
    }
}
