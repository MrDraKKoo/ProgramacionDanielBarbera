package tema2;

import java.util.Scanner;

public class Tema2ejercicio17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el numero de pieza la cual luego vamos a operar, 0 cuadrado, 1 rectangulo, 2 triangulo ");
        int pieza = in.nextInt();

        if (pieza !=0 && pieza!=1 && pieza !=2){
            System.out.println("el numeor introducido no es valido en niguna pieza");
        }

        switch (pieza) {
            case 0:
                System.out.println("Introduce la medida del lado del cuadrado:");
                int lado_cuadrado = in.nextInt();
                int perimetro = lado_cuadrado * 4;
                int superficie = lado_cuadrado * 2;
                System.out.println("El perimetro es: " + perimetro);
                System.out.println("El superficie es: " + superficie);
            case 1:
                System.out.println("Introduce la medida de la base del rectangulo:");
                int base_rectangulo = in.nextInt();
                System.out.println("Introduce la medida de la altura del rectangulo:");
                int altura_rectangulo = in.nextInt();
                int perimetro_rectangulo = 2 *(base_rectangulo + altura_rectangulo);
                int superficie_rectangulo = base_rectangulo * altura_rectangulo;
                System.out.println("El perimetro es: " + perimetro_rectangulo);
                System.out.println("El superficie es: " + superficie_rectangulo);
            case 2:
                System.out.println("Introduce la medida de la base de triangulo:");
                int base_triangulo = in.nextInt();
                System.out.println("Introduce la medida de la base de triangulo:");
                int altura_triangulo = in.nextInt();
                int superficie_triangulo = (base_triangulo * altura_triangulo) / 2;
                System.out.println("El superficie es: " + superficie_triangulo);
        }
    }
}
