package tema6.ej4;

public class Ficha {
    protected int numero;
    protected String titulo;

    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Numero: "+numero+"\nTítulo: "+titulo;
    }
}