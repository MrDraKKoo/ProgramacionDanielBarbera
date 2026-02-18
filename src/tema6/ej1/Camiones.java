package tema6.ej1;

enum tipoMercancia {
    PELIGROSA, NO_PELIGROSA
}
public class Camiones extends Vehiculo {
    private double peso;
    private tipoMercancia mercancia;

    //defaults
    private double DEFAULT_PESO = 4000;
    private tipoMercancia DEFAULT_MERCANCIA = tipoMercancia.PELIGROSA;

    public Camiones (String matricula, String modelo, String marca, double peso, tipoMercancia mercancia){
        super(matricula, modelo, marca);
        this.peso=peso;
        this.mercancia=mercancia;
    }

    public Camiones (){
        this.peso = DEFAULT_PESO;
        this.mercancia = DEFAULT_MERCANCIA;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public tipoMercancia getMercancia() {
        return mercancia;
    }

    public void setMercancia(tipoMercancia mercancia) {
        this.mercancia = mercancia;
    }
}
