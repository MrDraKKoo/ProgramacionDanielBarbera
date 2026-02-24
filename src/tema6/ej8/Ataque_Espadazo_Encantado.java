package tema6.ej8;

public class Ataque_Espadazo_Encantado implements AtaqueAvanzado{
    private double coste_fisico;
    private double danyoInflingido_fisico;
    private double coste_magico;
    private double danyoInflingido_magico;


    private final double COSTE = 20;
    private final double DANIO = 100;


    public Ataque_Espadazo_Encantado(double coste_fisico, double coste_magico, double danyoInflingido, double danyoInflingido_magico) {
        this.coste_fisico = coste_fisico;
        this.danyoInflingido_fisico = danyoInflingido_fisico;
        this.coste_magico = coste_magico;
        this.danyoInflingido_magico = danyoInflingido_magico;

    }

    public Ataque_Espadazo_Encantado() {
        this.coste_fisico = COSTE;
        this.danyoInflingido_fisico = DANIO;
        this.coste_magico = COSTE;
        this.danyoInflingido_magico = DANIO;

    }

    public double getCoste_fisico() {
        return coste_fisico;
    }

    public void setCoste_fisico(double coste_fisico) {
        this.coste_fisico = coste_fisico;
    }

    public double getDanyoInflingido_fisico() {
        return danyoInflingido_fisico;
    }

    public void setDanyoInflingido_fisico(double danyoInflingido_fisico) {
        this.danyoInflingido_fisico = danyoInflingido_fisico;
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
    public void lanzar (){
        System.out.println("Lanzando un atque tipo magico y fisico");
    }

    @Override
    public double coste (){
        System.out.println("Al ser un ataque fisico y magico tu coste es de maná y de esfuerzo");
        return coste_fisico + coste_magico;
    }

    @Override
    public double danyoInflingido(){
        return danyoInflingido_fisico + danyoInflingido_magico;
    }
}
