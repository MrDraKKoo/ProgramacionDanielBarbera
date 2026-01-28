package tema4.POO1;

public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        reloj.setFormato(true);
        reloj.setHora(24);
        reloj.setMinutos(45);
        reloj.setSegundos(34);
        System.out.println(reloj);
    }
}
