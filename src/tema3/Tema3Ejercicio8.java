package tema3;

import java.util.Scanner;

public class Tema3Ejercicio8 {
    public static void comprobación (int mes, int ano, int dia){
        if (ano < 1){
            System.out.println("El año es incorrecto");
        }
        if (mes > 12 || mes < 1) {
            System.out.println("el numero introducido no es valido para los meses");
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia < 1 || dia > 31){
                System.out.println("el dia no es valido");
            }else{
                System.out.println("la fecha es valida");
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia < 1 || dia > 30){
                System.out.println("el dia no es valida");
            }else {
                System.out.println("la fecha es valida");
            }
        } else if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                if (dia < 1 || dia > 29){
                    System.out.println("el dia no es valida");
                }else {
                    System.out.println("la fecha es valida");
                }
            } else {
                if (dia < 1 || dia > 28) {
                    System.out.println("el dia no es valida");
                }else {
                    System.out.println("la fecha es valida");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Dime el dia");
        int dia = in.nextInt();
        System.out.println("Dime el mes");
        int mes = in.nextInt();
        System.out.println("Diem el año");
        int ano = in.nextInt();
        comprobación(mes,ano,dia);

    }
}
