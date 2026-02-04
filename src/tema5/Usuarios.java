package tema5;

public class Usuarios {
    String Nombre;
    int edad;

    public Usuarios() {
        this.Nombre = "Dani";
        this.edad = 19;
    }

    public Usuarios(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}


