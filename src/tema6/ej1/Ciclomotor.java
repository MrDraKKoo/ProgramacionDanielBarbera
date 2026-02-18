package tema6.ej1;

public class Ciclomotor extends Vehiculo{
    private int cilindrada;

    //default
    private int DEFAULT_CILINDRADA = 75;

    public Ciclomotor (String matricula, String modelo, String marca,int cilindrada) {
        super(matricula, modelo, marca);
        this.cilindrada = cilindrada;
    }

    public Ciclomotor (){
        this.cilindrada = DEFAULT_CILINDRADA;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
    }

    public boolean carnet (int cilindrada){
        boolean tiene = false;
        if (cilindrada >= 125){
            tiene = true;
        }
        return tiene;
    }
}
