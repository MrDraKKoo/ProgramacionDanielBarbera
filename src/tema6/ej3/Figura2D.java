package tema6.ej3;

public abstract class Figura2D {
    protected String nombre;

    private final String DEFAULT_NOMBRE = "Figura";

    public Figura2D (String nombre){
        this.nombre = nombre;
    }

    public Figura2D (){
        this.nombre= DEFAULT_NOMBRE;
    }













    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double area();

    public abstract double perimetro ();

    public abstract String toString ();

}
