package Ejercicio1;
enum formato{
    TAPA_DURA, TAPA_BLANDA, BOLSILLO
}
public class Libro {
    private String isbn;
    private String nombre;
    private String autor;
    private int numPag;
    private String genero;
    private formato formatolibro;

    private final String DEFAULT_ISBN = "1234";
    private final String DEFAULT_NOMBRE = "Hora de aventuras";
    private final String DEFAULT_AUTOR = "Dani";
    private final int DEFAULT_NUMPAG = 70;
    private final String DEFAULT_GENERO = "comedia";
    private final formato DEFAULT_FORMATOLIBRO = formato.TAPA_DURA;
    private final int PESO_TAPA_DURA = 50;
    private final int PESO_TAPA_BLANDA = 20;
    private final int PESO_BOLSILLO = 10;
    private final int PESO_HOJAS = 2;
    private final int PESO_HOJAS_BOLSILLO = 1;

   public Libro (String isbn, String nombre, String autor, int numPag, String genero, formato formatolibro){
     this.isbn = isbn;
     this.nombre = nombre;
     this.autor = autor;
     this.numPag = numPag;
     this.genero = genero;
     this.formatolibro = formatolibro;
   }

   public Libro (){
       this.isbn = DEFAULT_ISBN;
       this.nombre = DEFAULT_NOMBRE;
       this.autor = DEFAULT_AUTOR;
       this.numPag = DEFAULT_NUMPAG;
       this.genero = DEFAULT_GENERO;
       this.formatolibro = DEFAULT_FORMATOLIBRO;
   }
   public int peso (){
       int peso;
       if (formatolibro ==formato.TAPA_DURA){
           peso = numPag*PESO_HOJAS+PESO_TAPA_DURA;
       } else if (formatolibro == formato.TAPA_BLANDA) {
           peso = numPag*PESO_HOJAS+PESO_TAPA_BLANDA;
       }else {
           peso= numPag*PESO_HOJAS_BOLSILLO+PESO_BOLSILLO;
       }
       return peso;
   }
   public String toString (){
       return "Nombre del libro: "+nombre+"\nAutor: "+autor+"\nPeso: "+peso();
   }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public formato getFormatolibro() {
        return formatolibro;
    }

    public void setFormatolibro(formato formatolibro) {
        this.formatolibro = formatolibro;
    }
}
