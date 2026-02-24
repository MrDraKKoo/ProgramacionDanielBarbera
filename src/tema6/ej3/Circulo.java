package tema6.ej3;

public class Circulo extends Figura2D{
    private double radio;

    private final double DEFAULT_RADIO  = 5;
    private final double NUM_PI = 3.14;

    public Circulo (String nombre,double radio){
        super(nombre);
        this.radio = radio;
    }

    public Circulo (){
       this.radio = DEFAULT_RADIO;
    }

    @Override
    public double area (){
        double area = NUM_PI * (radio * radio);
        return area;
    }

    @Override
    public double perimetro (){
        double perimetro = 2 * NUM_PI * radio;
        return perimetro;
    }
    @Override
    public String toString (){
        return "Nombre: "+nombre+"\nRadio: "+radio;
    }
}

