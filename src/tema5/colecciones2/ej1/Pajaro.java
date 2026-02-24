package tema5.colecciones2.ej1;

public class Pajaro extends Animal {
    private double peso;
    private String especie;

    public Pajaro(int hora, double peso, String especie) {
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Hora: "+horaAvistamiento+ "Especie: " + especie + "Peso: " + peso;
    }
}
