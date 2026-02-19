package tema6.ej2;

public class Abeja extends Animal{
    private boolean esReina;

    private final boolean DEFAULT_ESREINA = true;

    public Abeja (String nombre, int edad, boolean esReina){
        super(nombre, edad);
        this.esReina=esReina;
    }
    public Abeja (){
        this.esReina = DEFAULT_ESREINA;
    }

    public boolean isEsReina() {
        return esReina;
    }

    public void setEsReina(boolean esReina) {
        this.esReina = esReina;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Bzzz Bzzz");
    }
}
