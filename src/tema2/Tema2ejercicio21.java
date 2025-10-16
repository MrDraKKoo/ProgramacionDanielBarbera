package tema2;

public class Tema2ejercicio21 {
    public static void main(String[] args) {
        int suma = 0;
        for (int start = 2; start <= 1000; start = start + 2){
            suma = suma + start;
        }
        System.out.println("la suma de todos los pares es = "+suma);
    }
}
