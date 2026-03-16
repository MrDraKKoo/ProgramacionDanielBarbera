package tema6.ej8;

public class Ataque_Espadazo implements AtaqueAvanzado {
    private double coste;
    private  double danyoInflingido;
    private tipo tipoAtaque;

    private final double COSTE = 20;
    private final double DANIO = 100;
    private final tipo TIPOATAQUE = tipo.FISICO;

    public Ataque_Espadazo(double coste, double danyoInflingido, tipo tipoAtaque) {
        this.coste = COSTE;
        this.danyoInflingido = danyoInflingido;
        this.tipoAtaque = tipoAtaque;
    }

    public Ataque_Espadazo() {
        this.coste = COSTE;
        this.danyoInflingido = DANIO;
        this.tipoAtaque = TIPOATAQUE;
    }

    @Override
    public void lanzar (){
        System.out.println("Lanzando un atque tipo "+tipoAtaque);
    }

    @Override
    public double coste (){
        System.out.println("Al ser un ataque fisico tu coste esfuerzo");
        return coste;
    }

    @Override
    public double danyoInflingido(){
        return danyoInflingido;
    }
}
