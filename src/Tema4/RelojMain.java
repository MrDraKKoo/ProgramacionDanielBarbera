package Tema4;

public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        reloj.formato = false;
        reloj.setHora(24);
        reloj.setMinutos(45);
        reloj.setSegundos(34);
        System.out.println(reloj);
    }
}
