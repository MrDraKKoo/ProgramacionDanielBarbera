package tema2;

import java.util.Scanner;

public class Tema2ejercicio24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la nota del alumno");
        double nota = in.nextDouble();
        int aprobados = 0;
        int suspendidos = 0;

        while(nota >= 0){
            if (nota >= 5){
                aprobados++;
            }else {
                suspendidos++;
            }
            System.out.println("Introduce otra nota, en caso de acabar introduce un numero negativo");
            nota = in.nextDouble();
        }
        System.out.println("Ha aprobado un total de "+aprobados);
        System.out.println("Ha suspendido un total de "+suspendidos);
    }
}
