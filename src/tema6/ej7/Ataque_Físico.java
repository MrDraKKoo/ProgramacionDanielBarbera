package tema6.ej7;

public class Ataque_Físico implements IAtaque{
    private double coste;
    private double danyoInflingido;

    private final double DEFAULT_COSTE = 20;
    private final double DEFAULT_DANO_INFLINGIDO = 100;

    public Ataque_Físico (double coste, double danyoInflingido){
        this.coste = coste;
        this.danyoInflingido = danyoInflingido;
    }

    public Ataque_Físico (){
        this.coste = DEFAULT_COSTE;
        this.danyoInflingido = DEFAULT_DANO_INFLINGIDO;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public double getDanyoInflingido() {
        return danyoInflingido;
    }

    public void setDanyoInflingido(double danyoInflingido) {
        this.danyoInflingido = danyoInflingido;
    }

    @Override
    public double coste(){
        return coste;
    }
    @Override
    public double danyoInflingido(){
        return danyoInflingido;
    }
    @Override
    public void lanzar(){
        System.out.println("Lanzando un atque fisico");
    }
}

