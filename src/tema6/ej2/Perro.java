package tema6.ej2;

public class Perro extends Animal{
    private String raza;

    public Perro(String nombre, int edad, String raza){
        super(nombre, edad);
        this.raza= raza;
    }

    public Perro(){
        this.raza = "Golden retriever";
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerRuido() {
        System.out.println("Guau Guau");
    }
}
