package tema5.colecciones2.ej1;

public abstract class Animal {
    protected int horaAvistamiento;
    protected int tipo;

    public Animal(int horaAvistamiento, int tipo) {
        this.horaAvistamiento = horaAvistamiento;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getHora() {
        return horaAvistamiento;
    }

    public void setHora(int hora) {
        this.horaAvistamiento = hora;
    }

    @Override
    public abstract String toString();
}

