package Ejercicio2;

public class Cartera {
    private String [] array;

    private final String [] DEFAULT_ARRAY = new String[10];
    public Cartera (String [] array){
            this.array = array;
    }
    public Cartera (){
        this.array = DEFAULT_ARRAY;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
}
