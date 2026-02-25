package Ejercicio3;

public class Accesorios extends Articulo{
    private String nombreAccesorio;

    private final String DEFAULT_ACCESORIO = "Cinta focus";

    public Accesorios (String nombre, boolean gratis, String nombreAccesorio){
        super(nombre, gratis);
        this.nombreAccesorio =nombreAccesorio;
    }

    public Accesorios (){
        this.nombreAccesorio = DEFAULT_ACCESORIO;
    }

    public String getNombreAccesorio() {
        return nombreAccesorio;
    }

    public void setNombreAccesorio(String nombreAccesorio) {
        this.nombreAccesorio = nombreAccesorio;
    }

    @Override
    public tipo tipoProducto() {
        return null;
    }

    @Override
    public double precio() {
        return 7;
    }

    @Override
    public String toString() {
        return "Nombre del articulo: "+nombre;
    }
}
