package tema4.POO2;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona persona1 = new Persona();
        Cuenta cuenta1 = new Cuenta();

        System.out.println("Que quieres realizar?");
        System.out.println(
                "1)Instanciar objetos de tipo Persona" +"\n"+
                "2)Instanciar objetos de tipo Cuenta y asociarlo a una persona." +"\n"+
                "3)Mostrar datos de una cuenta (por su DNI) +" +"\n"+
                "4)Recibir la nómina mensual de una persona (por DNI y núm de cuenta)" +"\n"+
                "5)Recibir un pago (por DNI y núm de cuenta)" +"\n"+
                "6)Realizar transferencia entre cuentas" +"\n"+
                "7)Imprimir las perosnas morosas");
        int opcion = in.nextInt();
        switch (opcion){
            case 1:
                break;
            case 2:
                System.out.println("Introduce el nombre");
                persona1.setNombre(in.nextLine());
                System.out.println("Introduce el primer apellido");
                persona1.setApellido1(in.nextLine());
                System.out.println("Introduce el segudno apellido");
                persona1.setApellido2(in.nextLine());
                System.out.println("Introduce el DNI");
                persona1.setDNI(in.nextLine());
                break;
            case 3:
                System.out.println("Introduce el DNI para mostrar datos de esa cuenta");
                persona1.setDNI(in.nextLine());

                break;
            case 4:
                break;
            case 5:
                System.out.println("Introduce el DNI");
                persona1.setDNI(in.nextLine());
                System.out.println("Introdcue el numero de cuenta");

                System.out.println("Introduce la cantidad de dinero del recibo");
                double recibo = in.nextDouble();

                break;
            case 6:
                System.out.println("Introduce la cantidad de dinero que quieres tranferir");
                double transferencia = in.nextDouble();
                System.out.println("Introduce el numero de cuenta el cual quieres enviar el dinero");

                cuenta1.pagarRecibo(transferencia);
                System.out.println("Introduce el numero de cuenta el cual quieres recibir el dinero");

                cuenta1.recibirAbono(transferencia);
                break;
            case 7:
                break;
        }
    }
}
