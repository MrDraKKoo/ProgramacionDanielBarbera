package Ejercicio3;

import java.io.PipedOutputStream;

public class Pocion extends Articulo{

    private int nivel;

    private final int DEFAULT_NIVEL = 1;
    private final int PRECIO_BASE= 5;

    public Pocion (String nombre, boolean gratis, int nivel){
        super(nombre, gratis);
        this.nivel =nivel;

    }

    public Pocion (){
        this.nivel = DEFAULT_NIVEL;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }


    @Override
    public tipo tipoProducto() {
        return tipo.POCION;
    }

    @Override
    public double precio() {
        int precio = 5;
        precio = precio * nivel;
        return precio;
    }

    @Override
    public String toString (){
        return "Nivel de la pocion: "+nivel;
    }
}
