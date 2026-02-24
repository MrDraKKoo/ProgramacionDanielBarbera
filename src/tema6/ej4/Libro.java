package tema6.ej4;

public class Libro extends Ficha {
    private String autor;
    private String editorial;

    public Libro(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo); // Llama al constructor de Ficha
        this.autor = autor;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Autor: "+autor+"\nEditorial: " + editorial;
    }
}
