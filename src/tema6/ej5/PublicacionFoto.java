package tema6.ej5;

import tema6.ej6.IPublicacion2;

public class PublicacionFoto implements IPublicacion, IAbrirPublicacion, IPublicacion2 {
    private String filtro;
    private String titulo;

    private final String DEFAULT_FILTRO = "blanco y negro";
    private final String DEFAULT_TITULO = "EN la playa";

    public PublicacionFoto(String filtro, String titulo) {
        this.filtro = filtro;
        this.titulo = titulo;
    }

    public PublicacionFoto() {
        this.filtro = DEFAULT_FILTRO;
        this.titulo = DEFAULT_TITULO;
    }

    public String getFiltro() {
        return filtro;
    }

    public void setFiltro(String filtro) {
        this.filtro = filtro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void publicar() {
       System.out.println("Acabas de publicar una foto");
    }
    @Override
    public void compartirContenido() {
       System.out.println("Acabas de compartir una foto en modo contenido");
    }
    @Override
    public void abrirPublicacion() {
        System.out.println("Acabas de abrir una foto");
    }
    @Override
    public void reaccion() {
        System.out.println("Acabas de reaccion una foto");
    }
}

