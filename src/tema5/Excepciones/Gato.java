package tema5.Excepciones;

public class Gato {
    String nombre;
    int edad;

    public Gato() {
        this.nombre = "chicho";
        this.edad = 4;
    }
    public Gato(String nombre, int edad) throws Exception {
       setNombre(nombre);
       setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception{
        if (nombre == null) {
            throw new Exception("El nombre no puede estar vacio");
        }else if (nombre.length() < 3) {
            throw new Exception("El nombre no puede tener menos de 3 caracteres");
        }else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception{
        if(edad < 0){
            throw new Exception("Edad negativa no permitida");
        }else {
            this.edad = edad;
        }
    }

    public void imprimir(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }
}
