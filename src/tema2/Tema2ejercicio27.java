package tema2;

public class Tema2ejercicio27 {
    public static void main(String[] args) {
        int num = 2;
        int cont = 0;

        while (cont < 20) {
            int divisor = 2;
            int NOprimo = 0;
            int primo = 0;

            while (divisor < num) {
                if (num % divisor == 0) {
                    NOprimo++;
                } else {
                    primo++;
                }
                divisor++;
            }

            if (NOprimo == 0) {
                System.out.println(num);
                cont++;
            }
            num++;
        }
    }
}
