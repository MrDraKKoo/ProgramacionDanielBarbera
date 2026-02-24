package tema5.colecciones2.ej1;

public class Serpiente extends Animal {
    private double longitud;
    private String especie;

    public Serpiente(int hora, double longitud, String especie) {
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Hora: "+horaAvistamiento+ "Especie: " + especie + "Longitud: " + longitud;
    }
}
