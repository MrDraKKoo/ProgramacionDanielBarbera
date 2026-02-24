package tema6.ej4;

public class Revistas extends Ficha{
    private int numPublicacion;
    private int anyo;

    private final int DEFAULTR_NUMPUBLICACION = 12;
    private final int DEFAULT_ANYO = 2024;

    public Revistas(int numero, String titulo, int numPublicacion, int anyo) {
        super(numero, titulo);
        this.anyo = anyo;
        this.numPublicacion = numPublicacion;
    }

    public Revistas() {
        this.anyo = DEFAULTR_NUMPUBLICACION;
        this.numPublicacion = DEFAULTR_NUMPUBLICACION;
    }

    @Override
    public String toString() {
        return "NUmeor de publicacion: "+numPublicacion+"\nAño: " + anyo;
    }
}
