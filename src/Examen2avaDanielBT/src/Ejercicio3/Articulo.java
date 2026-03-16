package Ejercicio3;
enum tipo{
    POCION, POKEBOLA, ACCESOTIOS
}
public abstract class Articulo {
    protected String nombre;
    protected boolean gratis;

    private final String DEFAULT_NOMBRE = "Ultra Ball";
    private final boolean DEFAULT_GRATIS = false;

    public  Articulo (String nombre, boolean gratis){
        this.nombre = nombre;
        this.gratis = gratis;
    }

    public Articulo (){
        this.nombre = DEFAULT_NOMBRE;
        this.gratis = DEFAULT_GRATIS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGratis() {
        return gratis;
    }

    public void setGratis(boolean gratis) {
        this.gratis = gratis;
    }

    public abstract tipo tipoProducto();

    public abstract double precio();

    public abstract String toString ();
}
