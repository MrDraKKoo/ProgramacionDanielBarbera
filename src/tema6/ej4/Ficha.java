package tema6.ej4;

public class Ficha {
    protected int numero;
    protected String titulo;

    private final int DEFAULT_NUMERO = 100;
    private final String DEFAULT_TITULO = "Historias corrientes";
    public Ficha(int numero, String titulo, String autor) {}

    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    public Ficha() {
        this.numero = DEFAULT_NUMERO;
        this.titulo = DEFAULT_TITULO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Numero: "+numero+"\nTítulo: "+titulo;
    }
}