package tema4.POO1;

public class Reloj {
    int hora;
    int minutos;
    int segundos;
    boolean formato;
    boolean ampm;
    public static final int hDefault = 0;
    public static final int hDefault2 = 12;
    public static final int mDefault = 59;
    public static final int sDefault = 59;
    public Reloj () { // Constructor vacio
        hora = 12;
        minutos = 0;
        segundos = 0;
        formato = true;
    }
    public Reloj (int hora, int minutos, int segundos, boolean formato){ // Constructor con los 4 atributos
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
        this.formato = formato;
    }

    public int getHora() { // getter para hora
        return hora;
    }

    public void setHora (int hora) { // setter para formato 24
        if (formato) {
            if (hora >= 0 && hora <= 24) {
                this.hora = hora;
            }else {
                this.hora = hDefault;
            }
        }else {
            if (hora >= 0 && hora <= 12) {
                this.hora = hora;
                this.ampm = true;
            }else if (hora >=13 && hora <=24){
                this.hora = hora - 12;
                this.ampm = false;
            }else {
                this.hora = hDefault2;
                this.ampm = true;
            }
        }
    }

    public int getMinutos() {// getter para minutos
        return minutos;
    }

    public void setMinutos (int minutos) { // setter minutos
        if (minutos >= 0 && minutos <= 60) {
            this.minutos = minutos;
        }else{
            this.minutos = mDefault;
        }
    }

    public int getSegundos() { // getter para segundos
        return segundos;
    }

    public void setSegundos (int segundos) { // setter segundos
        if (segundos >= 0 && segundos <= 60) {
            this.segundos = segundos;
        }else {
            this.segundos = sDefault;
        }
    }

    public boolean isFormato() {// getter para hora
        return formato;
    }

    public void setFormato (boolean formato) {// setter para formato true
        if (formato) {
            this.formato = formato;
        }
    }
    public void setFormato2 (boolean formato) {// setter para formato false
        if (!formato) {
            this.formato = formato;
        }
    }

    public String toString() {
        if (formato) {// para 24h
            return "Son las " + hora + ":" + minutos + ":" + segundos;
        }else {
            if (ampm) { // para 12h
                return "Son las " + hora + ":" + minutos + ":" + segundos + " AM";
            } else {
                return "Son las " + hora + ":" + minutos + ":" + segundos + " PM";
            }
        }
    }
}
