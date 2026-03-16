package tema5;

public class Usuarios {
    String nombre;
    int edad;

    public Usuarios() {
        this.nombre = "Dani";
        this.edad = 19;
    }

    public Usuarios(String Nombre, int edad) {
        this.nombre = Nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    /*public String toString (String DNI, usgym){
        return
        "\nEL DNI " + DNI + " pertenece a:"+
        "\nNombre: " + usgym.get(DNI).getNombre()+
        "\nEdad: " + usgym.get(DNI).getEdad();
    }*/
}


