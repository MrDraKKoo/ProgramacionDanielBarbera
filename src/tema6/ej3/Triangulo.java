package tema6.ej3;

public class Triangulo extends Figura2D{
    private double lado1;
    private double lado2;
    private double base;
    private double altura;

    private final double DEFAULT_LADO1 = 8;
    private final double DEFAULT_LADO2 = 8;
    private final double DEFAULT_BASE = 8;
    private final double DEFAULT_ALTURA = 8;

    public Triangulo (String nombre, double lado1, double lado2, double altura, double base){
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    public Triangulo (){
        this.lado1 = DEFAULT_LADO1;
        this.lado2 = DEFAULT_LADO2;
        this.base = DEFAULT_BASE;
        this.altura = DEFAULT_ALTURA;
    }

    @Override
    public double area (){
        double area = (base * altura) /2;
        return area;
    }

    @Override
    public double perimetro (){
        double perimetro = lado1 + lado2 + base;
        return perimetro;
    }
    @Override
    public String toString (){
        return "Nombre: "+nombre+"\nBase: "+base+"\nAltrura: "+altura+"\nLado1: "+lado1+"\nLado2: "+lado2;
    }
}

