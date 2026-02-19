package tema6.ej2;


public class Pajaro extends Animal{
    private boolean ponehuevos;

    private final boolean DEFAULT_PONEHUEVOS = true;

    public Pajaro (String nombre, int edad, boolean ponehuevos){
        super(nombre, edad);
        this.ponehuevos =ponehuevos;
    }

    public Pajaro (){
        this.ponehuevos = DEFAULT_PONEHUEVOS;
    }

    public boolean isPonehuevos() {
        return ponehuevos;
    }

    public void setPonehuevos(boolean ponehuevos) {
        this.ponehuevos = ponehuevos;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Pio Pio");
    }
}
