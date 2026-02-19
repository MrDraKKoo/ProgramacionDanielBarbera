package tema6.ej2;

public abstract class Animal {
    private String nombre;
    private int edad;

    private int DEFAULT_EDAD = 10;
    public Animal (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal (){
        this.edad = DEFAULT_EDAD;
        this.nombre = "Twister";
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void hacerRuido() {
    }
    public void comer(){
        System.out.println("Ñam");
    }
    public void dormir (){
        System.out.println("Zzz...");
    }
}
