package tema6.ej2;

public class Tigre extends Animal{
    private int numRayas;

    private final int DEFAULT_NUMRAYAS =80;

    public Tigre (String nombre, int edad, int numRayas){
        super(nombre, edad);
        this.numRayas = numRayas;
    }

    public Tigre (){
        this.numRayas = DEFAULT_NUMRAYAS;
    }

    public int getNumRayas() {
        return numRayas;
    }

    public void setNumRayas(int numRayas) {
        this.numRayas = numRayas;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Grrr Grrr");
    }
}
