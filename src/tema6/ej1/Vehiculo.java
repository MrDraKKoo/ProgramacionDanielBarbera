package tema6.ej1;

public class Vehiculo {
    protected String matricula;
    protected String modelo;
    protected String marca;

    public Vehiculo(){
        this.marca = "Audi";
        this.matricula = "1221 BYT";
        this.modelo = "R8";
    }

    public Vehiculo (String matricula, String modelo, String marca){
        this.marca = marca;
        this.matricula = matricula;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
