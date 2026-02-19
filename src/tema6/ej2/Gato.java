package tema6.ej2;

public class Gato extends Animal{
    private int vida;

    private final int DEFAULT_VIDAS = 7;

    public Gato(String nombre, int edad, int vida){
        super(nombre, edad);
        this.vida= vida;
    }

    public Gato(){
        this.vida = DEFAULT_VIDAS;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Miau Miau");
    }
}
