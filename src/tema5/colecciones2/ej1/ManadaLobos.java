package tema5.colecciones2.ej1;

public class ManadaLobos extends Animal {
    private int numLobos;
    private String observaciones;

    public ManadaLobos(int hora, int numLobos, String observaciones) {
        super(hora);
        this.numLobos = numLobos;
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Hora: "+horaAvistamiento+ "Numeor de lobos" + numLobos + "Observaciones: " + observaciones;
    }
}

