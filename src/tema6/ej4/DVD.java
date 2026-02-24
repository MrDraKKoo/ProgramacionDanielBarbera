package tema6.ej4;
 enum tipo {
     ANIMACION, ACCION, DOCUMENTAL, CIENCIA_FICCION
 }
public class DVD extends Ficha {
    private String director;
    private int anyo;
    private tipo tipoDVD;

    private final tipo DEFAULT_TIPO = tipo.ANIMACION;
    private final int DEFAULT_ANYO = 2024;

    public DVD(int numero, String titulo, String director, int año, tipo tipoDVD) {
        super(numero, titulo);
        this.director = director;
        this.anyo = anyo;
        this.tipoDVD = tipoDVD;
    }

    public DVD() {
        this.director = "Daniel";
        this.anyo = DEFAULT_ANYO;
        this.tipoDVD = DEFAULT_TIPO;
   }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public tipo getTipoDVD() {
        return tipoDVD;
    }

    public void setTipoDVD(tipo tipoDVD) {
        this.tipoDVD = tipoDVD;
    }

    @Override
    public String toString() {
        return super.toString() + " | Director: " + director + " (" + anyo + ") Tipo: " + tipoDVD;
    }
}
