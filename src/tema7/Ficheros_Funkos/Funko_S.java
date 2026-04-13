package tema7.Ficheros_Funkos;

import java.io.Serializable;

public class Funko_S implements Serializable {
    private String nombre;
    private String modelo;
    private double precio;
    private  int anio;

    private final String NOMBRE_DEFAULT = "Spiderman";
    private final String MODELO_DEFAULT = "Marvel";
    private final double PRECIO_DEFAULT = 10.0;
    private final int ANIO_DEFAULT = 2023;
    public Funko_S(String nombre, String modelo, double precio, int anio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.anio = anio;
    }
    public Funko_S() {
        this.nombre =  NOMBRE_DEFAULT;
        this.modelo = MODELO_DEFAULT;
        this.precio = PRECIO_DEFAULT;
        this.anio = ANIO_DEFAULT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String toString() {
        return "Funko [Nombre=" + nombre + ", Modelo=" + modelo + ", Precio=" + precio + ", Año=" + anio + "]";
    }
}
