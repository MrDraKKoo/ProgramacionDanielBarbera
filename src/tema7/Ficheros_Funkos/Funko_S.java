package tema7.Ficheros_Funkos;

import java.io.Serializable;

public class Funko_S implements Serializable {
    private String cod;
    private String nombre;
    private String modelo;
    private double precio;
    private  String anio;

    private final String COD_DEFAULT = "123412";
    private final String NOMBRE_DEFAULT = "Spiderman";
    private final String MODELO_DEFAULT = "Marvel";
    private final double PRECIO_DEFAULT = 10.0;
    private final String ANIO_DEFAULT = "2023-01-01";
    public Funko_S(String cod, String nombre, String modelo, double precio, String anio) {
        this.cod = cod;
        this.nombre = nombre;
        this.modelo = modelo;
        this.precio = precio;
        this.anio = anio;
    }
    public Funko_S() {
        this.cod = COD_DEFAULT;
        this.nombre =  NOMBRE_DEFAULT;
        this.modelo = MODELO_DEFAULT;
        this.precio = PRECIO_DEFAULT;
        this.anio = ANIO_DEFAULT;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
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

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String toString() {
        return "Funko [Cod=" + cod + ", Nombre=" + nombre + ", Modelo=" + modelo + ", Precio=" + precio + ", Año=" + anio + "]";
    }
}
