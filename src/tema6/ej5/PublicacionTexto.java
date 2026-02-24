package tema6.ej5;

import tema6.ej6.IPublicacion2;

public class PublicacionTexto implements IPublicacion, IPublicacion2 {
    private String titulo;
    private int cantidadCaracteres;

    private final int DEFAULT_CANTIDAD = 100;
    private final  String DEFAULT_TITULO = "Opinion personal";

    public PublicacionTexto(String titulo, int cantidadCaracteres) {
        this.titulo = titulo;
        this.cantidadCaracteres = cantidadCaracteres;
    }

    public PublicacionTexto() {
        this.titulo = DEFAULT_TITULO;
        this.cantidadCaracteres = DEFAULT_CANTIDAD;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidadCaracteres() {
        return cantidadCaracteres;
    }

    public void setCantidadCaracteres(int cantidadCaracteres) {
        this.cantidadCaracteres = cantidadCaracteres;
    }

    @Override
    public void publicar() {
        System.out.println("Acabas de publicar una vido");
    }
    @Override
    public void compartirContenido() {
        System.out.println("Acabas de compartir un video en modo contenido");
    }
    @Override
    public void reaccion() {
        System.out.println("Acabas de reaccion un texto");
    }
}
