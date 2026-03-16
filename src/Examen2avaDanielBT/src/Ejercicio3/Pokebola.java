package Ejercicio3;

public class Pokebola extends Articulo{
    private String tipoPokebola;

    private final String DEFAULT_POKEBOLA = "pokeball";

    public Pokebola (String nombre, boolean gratis, String tipoPokebola){
        super(nombre, gratis);
        this.tipoPokebola =tipoPokebola;
    }

    public Pokebola (){
        this.tipoPokebola = DEFAULT_POKEBOLA;
    }

    public String getTipoPokebola() {
        return tipoPokebola;
    }

    public void setTipoPokebola(String tipoPokebola) {
        this.tipoPokebola = tipoPokebola;
    }

    @Override
    public tipo tipoProducto() {
        return tipo.POKEBOLA;
    }

    @Override
    public double precio() {
        int precio;
        if (tipoPokebola == "pokeball"){
            precio = 2;
        } else if (tipoPokebola == "great ball") {
            precio = 5;
        }else {
            precio = 10;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "Tipo de pokebola = "+tipoPokebola;
    }
}
