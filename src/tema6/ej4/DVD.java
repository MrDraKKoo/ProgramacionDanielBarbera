package tema6.ej4;

public class DVD extends Ficha {
    private String director;
    private int anyo;
    private String tipo;

    public DVD(int numero, String titulo, String director, int año, String tipo) {
        super(numero, titulo);
        this.director = director;
        this.anyo = anyo;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " | Director: " + director + " (" + anyo + ") Tipo: " + tipo;
    }
}
