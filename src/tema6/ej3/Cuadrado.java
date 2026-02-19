package tema6.ej3;

public class Cuadrado extends Figura2D{
    private double lado;

    private final double DEFAULT_LADO = 12;


    public Cuadrado (String nombre, double base, double altura){
        super(nombre);
        this.lado = lado;
    }

    public Cuadrado (){
        this.lado = DEFAULT_LADO;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area (){
        double area = lado * lado;
        return area;
    }

    @Override
    public double perimetro (){
        double perimetro = 4 * lado;
        return perimetro;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+"\nLado: "+lado;
    }

}
