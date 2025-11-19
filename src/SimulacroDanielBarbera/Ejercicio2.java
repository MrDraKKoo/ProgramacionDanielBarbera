package SimulacroDanielBarbera;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introducce tu zona horaria o introducel al ultima opcion para salir");
        System.out.println("(a).España");
        System.out.println("(b).Japon");
        System.out.println("(c).Salir");
        char horario = in.next().charAt(0);
        int contador = 0;
        int contador2 = 0;

        while (horario != 'c') {
            //bucle para que no pare de pedir tu zona horaria y la hora
            System.out.println("ahora introduce la hora");
            int hora = in.nextInt();
            System.out.println("ahora los minutos");
            int minutos = in.nextInt();
            System.out.println("por último los segundos");
            int segundos = in.nextInt();
            //comprobacion de una hora correcta antes de hacer nada
            if (segundos >= 60) {
                segundos = segundos - 60;
                minutos++;
                if (minutos >= 60) {
                    minutos = minutos - 60;
                    hora++;
                    if (hora == 24) {
                        hora = 0;
                    }
                }
            }
            if (minutos >= 60) {
                minutos = minutos - 60;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
            if (hora == 24) {
                hora = 0;
            }

            switch (horario) {
                case 'a':
                    //calculo de +8 horas para tener la hora de Japon
                    hora = hora + 8;
                    while (hora > 24) {
                        hora--;
                        contador++;
                    }
                    if (hora == 24) {
                        hora = 0;
                        hora = hora + contador;
                    }
                    System.out.println("Tu hora en Japon es " + hora + ":" + minutos + ":" + segundos);
                    break;
                case 'b':
                    //calculo de -8 horas para tener la hora de España
                    hora = hora - 8;
                    while (hora < 0) {
                        hora++;
                        contador2++;
                    }
                    if (hora == 0) {
                        hora = 24;
                        hora = hora - contador2;
                    }
                    System.out.println("Tu hora en España es " + hora + ":" + minutos + ":" + segundos);
                case 'c':
                    break;
            }
            System.out.println("Introducce tu zona horaria o introducel al ultima opcion para salir");
            System.out.println("(a).España");
            System.out.println("(b).Japon");
            System.out.println("(c).Salir");
            horario = in.next().charAt(0);
        }
    }
}
