package tema4;

public class Persona {
    private String DNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;

    public Persona (){ // constructor vacio
        DNI = "11223344D";
        nombre = "Daniel";
        apellido1 = "Barberá";
        apellido2 = "Torres";
        edad = 20;
    }
    public Persona (String DNI, String nombre, String apellido1, String apellido2, int edad){ // constructor entero
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAdult(int edad){
        if (edad >= 18){
            return true;
        }else {
            return false;
        }
    }

    public boolean isRetired (int edad){
        if (edad >=65){
            return true;
        }else {
            return false;
        }
    }

    public boolean isCheckDNI (){
        char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        String soloNumero = DNI.substring(0, 8);
        int numeroDni = Integer.parseInt(soloNumero);
        char letraUsuario = DNI.charAt(8);
        int posicion = numeroDni % 23;

        if (letras[posicion] == letraUsuario) {
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return "x";
    }
}
