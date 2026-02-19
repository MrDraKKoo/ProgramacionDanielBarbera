package tema6.ej3;

public class Rectangulo extends Figura2D{
    private double altura;
    private double base;

    private final double DEFAULT_ALTURA = 12;
    private final double DEFAULT_BASE = 6;

    public Rectangulo (String nombre, double base, double altura){
        super(nombre);
        this.altura = altura;
        this.base = base;
    }

    public Rectangulo (){
        this.base = DEFAULT_BASE;
        this.altura = DEFAULT_ALTURA;
    }

    @Override
    public double area (){
        double area = base * altura;
        return area;
    }

    @Override
    public double perimetro (){
        double perimetro = 2 * (base + altura);
        return perimetro;
    }

    @Override
    public String toString (){
        return "Nombre: "+nombre+"\nBase: "+base+"\nAltrura: "+altura;
    }
}
