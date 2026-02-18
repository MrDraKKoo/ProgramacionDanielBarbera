package tema6.ej1;

enum tipoUso{
    PROFESIONAL, PARTICULAR
}

public class Turismo extends Vehiculo {
    private int plaza;
    private tipoUso uso;
    //defaults
    private int DEFAULT_PLAZA = 1;
    private tipoUso DEFAULT_USO = tipoUso.PROFESIONAL;

    public Turismo (String matricula, String modelo, String marca, int plaza, tipoUso uso){
        super(matricula, modelo, marca);
        this.plaza = plaza;
        this.uso = uso;
    }

    public Turismo(){
        this.plaza = DEFAULT_PLAZA;
        this.uso = DEFAULT_USO;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    public tipoUso getUso() {
        return uso;
    }

    public void setUso(tipoUso uso) {
        this.uso = uso;
    }
}
