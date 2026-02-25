package Ejercicio2;

public class Billete implements IDinero{
    private int valor;

    private final int DEFAULT_VALOR = 5;

    public Billete (int valor){
        this.valor = valor;
    }
    public Billete (){
        this.valor = DEFAULT_VALOR;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public double valor (){
        return valor;
    }
}
