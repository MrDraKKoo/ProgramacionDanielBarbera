package tema5;

public class UsuariosBanco {
    String nombre;
    int edad;
    String DNI;

    public UsuariosBanco (){
        this.nombre = "Dani";
        this.edad = 20;
        this.DNI = "12345678A";
    }

    public UsuariosBanco (String nombre, int edad, String DNI){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
}
