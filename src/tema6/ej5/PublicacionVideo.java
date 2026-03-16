package tema6.ej5;

import tema6.ej6.IPublicacion2;

public class PublicacionVideo implements IPublicacion, IAbrirPublicacion, IPublicacion2 {
    private String titulo;

    public PublicacionVideo(String titulo) {
        this.titulo = titulo;
    }

    private final String DEFAULT_TITULO = "Tutorial ArrayList";

    public PublicacionVideo() {
        this.titulo = DEFAULT_TITULO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    public void abrirPublicacion() {
        System.out.println("Acabas de abrir un video");
    }
    @Override
    public void reaccion() {
        System.out.println("Acabas de reaccion un video");
    }
}
