package tema6.ej7;

public class Ataque_Mágico_Físico implements IAtaque{
    private double coste_fisico;
    private double danyoInflingido_fisco;
    private double coste_magico;
    private double danyoInflingido_magico;

    private final double DEFAULT_COSTE = 20;
    private final double DEFAULT_DANO_INFLINGIDO = 100;

    public Ataque_Mágico_Físico (double coste, double danyoInflingido){
        this.coste_fisico = coste_fisico;
        this.danyoInflingido_fisco = danyoInflingido;
        this.coste_magico = coste_magico;
        this.danyoInflingido_magico = danyoInflingido_magico;
    }

    public Ataque_Mágico_Físico (){
        this.coste_fisico = DEFAULT_COSTE;
        this.danyoInflingido_fisco = DEFAULT_DANO_INFLINGIDO;
        this.coste_magico = DEFAULT_COSTE;
        this.danyoInflingido_magico = DEFAULT_DANO_INFLINGIDO;
    }

    public double getCoste_fisico() {
        return coste_fisico;
    }

    public void setCoste_fisico(double coste_fisico) {
        this.coste_fisico = coste_fisico;
    }

    public double getDanyoInflingido_fisco() {
        return danyoInflingido_fisco;
    }

    public void setDanyoInflingido_fisco(double danyoInflingido_fisco) {
        this.danyoInflingido_fisco = danyoInflingido_fisco;
    }

    public double getCoste_magico() {
        return coste_magico;
    }

    public void setCoste_magico(double coste_magico) {
        this.coste_magico = coste_magico;
    }

    public double getDanyoInflingido_magico() {
        return danyoInflingido_magico;
    }

    public void setDanyoInflingido_magico(double danyoInflingido_magico) {
        this.danyoInflingido_magico = danyoInflingido_magico;
    }

    @Override
    public double coste(){
        return coste_fisico +coste_magico;
    }
    @Override
    public double danyoInflingido(){
        return danyoInflingido_fisco + danyoInflingido_magico;
    }
    @Override
    public void lanzar(){
        System.out.println("Lanzando un atque tanto magico como fisico");
    }
}

