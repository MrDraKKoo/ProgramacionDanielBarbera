package tema2;

import java.util.Scanner;

public class Tema2ejercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inntroduce una hora:");
        int hora = in.nextInt();
        System.out.println("Introduce los minutos:");
        int minutos = in.nextInt();
        System.out.println("Introduce los segundos:");
        int segundos = in.nextInt();

        if (hora > 24 || hora < 0) {
            System.out.println("Hora invalida");
        }
        if (minutos > 60 || minutos < 0)
            System.out.println("Minutos invalidos");
        if (segundos > 60 || segundos < 0)
            System.out.println("Segundos invalidos");

        segundos = segundos + 1;


        if (segundos == 60) {
            segundos = segundos - 60;
            minutos = minutos + 1;
            if (minutos == 60) {
                minutos = minutos - 60;
                hora = hora + 1;
                if (hora == 60) {
                    hora = hora + 1;

                }
            }
        }
        if (hora == 24) {
            hora = 0;
            System.out.println(hora + ":" + minutos + ":" + segundos);

        }
    }
}
