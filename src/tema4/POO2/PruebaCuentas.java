package tema4.POO2;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona[] personas = new Persona[5];
        int totalPersonas = 0;
        int opcion;

        do {
            System.out.println("\n1. Instanciar objetos de tipo Persona");
            System.out.println("2. Instanciar objetos de tipo Cuenta y asociarlo a una persona.");
            System.out.println("3. Mostrar datos de una persona (por su dni).");
            System.out.println("4. Recibir la nómina mensual de una persona (por dni y núm de cuenta).");
            System.out.println("5. Recibir un pago (por dni y núm de cuenta).");
            System.out.println("6. Realizar transferencia entre cuentas.");
            System.out.println("7. Imprimir las personas morosas.");
            System.out.println("0. Salir");

            opcion = in.nextInt();
            in.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    if (totalPersonas < personas.length) {
                        System.out.print("Nombre: "); String nom = in.nextLine();
                        System.out.print("Apellido 1: "); String ap1 = in.nextLine();
                        System.out.print("Apellido 2: "); String ap2 = in.nextLine();
                        System.out.print("DNI: "); String dni = in.nextLine();
                        personas[totalPersonas] = new Persona(nom, ap1, ap2, dni);
                        totalPersonas++;
                        System.out.println("Persona registrada con éxito.");
                    } else {
                        System.out.println("Error: No hay espacio para más personas.");
                    }
                    break;

                case 2:
                    System.out.print("DNI de la persona: ");
                    int p2 = buscarPersona(personas, totalPersonas, in.nextLine());
                    if (p2 != -1) {
                        System.out.print("Número de cuenta (16 dígitos): "); String nc = in.nextLine();
                        System.out.print("Saldo inicial: "); double sal = in.nextDouble();
                        personas[p2].añadirCuenta(new Cuenta(nc, sal));
                    } else {
                        System.out.println("Error: Persona no encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("DNI: ");
                    int p3 = buscarPersona(personas, totalPersonas, in.nextLine());
                    if (p3 != -1) {
                        personas[p3].mostrarDatos();
                    } else {
                        System.out.println("Error: Persona no encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("DNI: ");
                    int p4 = buscarPersona(personas, totalPersonas, in.nextLine());
                    if (p4 != -1) {
                        System.out.print("Número de cuenta: "); String ncu4 = in.nextLine();
                        System.out.print("Importe de la nómina: "); double nom4 = in.nextDouble();
                        int c4 = personas[p4].buscarIndiceCuenta(ncu4);
                        if (c4 != -1) {
                            personas[p4].obtenerCuenta(c4).recibirAbono(nom4);
                        } else {
                            System.out.println("Error: La cuenta no existe para esta persona.");
                        }
                    } else {
                        System.out.println("Error: Persona no encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("DNI: ");
                    int p5 = buscarPersona(personas, totalPersonas, in.nextLine());
                    if (p5 != -1) {
                        System.out.print("Número de cuenta: "); String ncu5 = in.nextLine();
                        System.out.print("Importe del recibo: "); double rec5 = in.nextDouble();
                        int c5 = personas[p5].buscarIndiceCuenta(ncu5);
                        if (c5 != -1) {
                            personas[p5].obtenerCuenta(c5).pagarRecibo(rec5);
                        } else {
                            System.out.println("Error: La cuenta no existe para esta persona.");
                        }
                    } else {
                        System.out.println("Error: Persona no encontrada.");
                    }
                    break;

                case 6:
                    System.out.print("DNI Origen: "); String dniO = in.nextLine();
                    int pO = buscarPersona(personas, totalPersonas, dniO);
                    System.out.print("DNI Destino: "); String dniD = in.nextLine();
                    int pD = buscarPersona(personas, totalPersonas, dniD);

                    if (pO != -1 && pD != -1) {
                        System.out.print("Cuenta Origen: "); String co6 = in.nextLine();
                        System.out.print("Cuenta Destino: "); String cd6 = in.nextLine();
                        System.out.print("Cantidad: "); double cant = in.nextDouble();

                        int idxO = personas[pO].buscarIndiceCuenta(co6);
                        int idxD = personas[pD].buscarIndiceCuenta(cd6);

                        if (idxO != -1 && idxD != -1) {
                            personas[pO].obtenerCuenta(idxO).pagarRecibo(cant);
                            personas[pD].obtenerCuenta(idxD).recibirAbono(cant);
                            System.out.println("Transferencia completada.");
                        } else {
                            System.out.println("Error: Verifique los números de cuenta.");
                        }
                    } else {
                        System.out.println("Error: No se encontró alguna de las personas.");
                    }
                    break;

                case 7:
                    System.out.println("PERSONAS MOROSAS");
                    boolean morosos = false;
                    for (int i = 0; i < totalPersonas; i++) {
                        if (personas[i].esMorosa()) {
                            System.out.println("- " + personas[i].getNombre() + " (DNI: " + personas[i].getDNI() + ")");
                            morosos = true;
                        }
                    }
                    if (!morosos) System.out.println("No hay personas con saldo negativo.");
                    break;
            }
        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }

    public static int buscarPersona(Persona[] lista, int total, String dni) {
        for (int i = 0; i < total; i++) {
            if (lista[i].getDNI().equalsIgnoreCase(dni)) {
                return i;
            }
        }
        return -1;
    }
}