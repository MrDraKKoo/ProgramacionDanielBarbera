package tema4.POO2;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona[] listaPersonas = new Persona[5];
        int contadorPersonas =0;
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
            System.out.println("QUe quieres realizar:");

            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    Persona persona = new Persona();
                    System.out.print("Nombre: ");
                    persona.setNombre(in.nextLine());
                    System.out.print("Primer Apellido: ");
                    persona.setApellido1(in.nextLine());
                    System.out.print("Segundo Apellido: ");
                    persona.setApellido2(in.nextLine());
                    System.out.print("DNI: ");
                    persona.setDNI(in.nextLine());
                    listaPersonas[contadorPersonas] = persona;
                    System.out.println("Persona guardada");
                    contadorPersonas++;
                    break;

                case 2:
                    System.out.print("DNI de la persona: ");
                    String dniCuenta = in.nextLine();

                    Persona personaCuenta = buscarPersonaPorDNI(listaPersonas, contadorPersonas, dniCuenta);

                    if (personaCuenta != null) {
                        System.out.print("Número de cuenta: ");
                        String numCuenta = in.nextLine();

                        System.out.print("Saldo inicial: ");
                        double saldo = in.nextDouble();
                        in.nextLine();

                        Cuenta nuevaCuenta = new Cuenta(numCuenta, saldo);
                        personaCuenta.añadirCuenta(nuevaCuenta);

                        System.out.println("Cuenta añadida correctamente.");
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce el DNI: ");
                    String dniBuscar = in.nextLine();

                    Persona personaMostrar = buscarPersonaPorDNI(listaPersonas, contadorPersonas, dniBuscar);

                    if (personaMostrar != null) {
                        System.out.println(personaMostrar);

                        System.out.println("Cuentas:");
                        for (int i = 0; i < personaMostrar.getContadorCuentas(); i++) {
                            System.out.println("- Nº Cuenta: " +personaMostrar.getCuentas()[i].getNumCuenta());
                            System.out.println("Saldo: " + personaMostrar.getCuentas()[i].getSaldo());
                        }
                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;

                case 4:
                    System.out.print("Introduce el DNI: ");
                    String dniNomina = in.nextLine();

                    Persona personaNomina = buscarPersonaPorDNI(listaPersonas, contadorPersonas, dniNomina);

                    if (personaNomina != null) {
                        System.out.print("introduce el número de cuenta: ");
                        String numCuenta = in.nextLine();

                        boolean cuentaEncontrada = false;

                        for (int i = 0; i < personaNomina.getContadorCuentas(); i++) {
                            if (personaNomina.getCuentas()[i].getNumCuenta().equals(numCuenta)) {
                                System.out.print("Cantidad de la nómina: ");
                                double cantidad = in.nextDouble();
                                in.nextLine(); // limpiar buffer

                                personaNomina.getCuentas()[i].recibirAbono(cantidad);

                                System.out.println("Nómina ingresada correctamente.");
                                cuentaEncontrada = true;
                                break;
                            }
                        }

                        if (!cuentaEncontrada) {
                            System.out.println("Cuenta no encontrada.");
                        }

                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;

                case 5:
                    System.out.print("Introduce el DNI: ");
                    String dniPago = in.nextLine();

                    Persona personaPago = buscarPersonaPorDNI(listaPersonas, contadorPersonas, dniPago);

                    if (personaPago != null) {
                        System.out.print("Introduce el número de cuenta: ");
                        String numCuenta = in.nextLine();

                        boolean cuentaEncontrada = false;

                        for (int i = 0; i < personaPago.getContadorCuentas(); i++) {
                            if (personaPago.getCuentas()[i].getNumCuenta().equals(numCuenta)) {
                                System.out.print("Cantidad a pagar: ");
                                double cantidad = in.nextDouble();
                                in.nextLine();

                                personaPago.getCuentas()[i].pagarRecibo(cantidad);

                                System.out.println("Pago realizado correctamente.");
                                cuentaEncontrada = true;
                                break;
                            }
                        }
                        if (!cuentaEncontrada) {
                            System.out.println("Cuenta no encontrada.");
                        }

                    } else {
                        System.out.println("Persona no encontrada.");
                    }
                    break;

                case 6:
                    System.out.print("DNI origen: ");
                    String dniOrigen = in.nextLine();
                    System.out.print("Cuenta origen: ");
                    String numCuentaOrigen = in.nextLine();
                    System.out.print("DNI destino: ");
                    String dniDestino = in.nextLine();
                    System.out.print("Cuenta destino: ");
                    String numCuentaDestino = in.nextLine();
                    System.out.print("Cantidad: ");
                    double cantidad = in.nextDouble();
                    in.nextLine();

                    Persona personaOrigen = buscarPersonaPorDNI(listaPersonas, contadorPersonas, dniOrigen);
                    Persona personaDestino = buscarPersonaPorDNI(listaPersonas, contadorPersonas, dniDestino);
                    Cuenta cuentaOrigen = null, cuentaDestino = null;

                    if (personaOrigen == null || personaDestino == null) {
                        System.out.println("Alguna de las personas no existe.");
                    } else {
                        for (int i = 0; i < personaOrigen.getContadorCuentas(); i++) {
                            if (personaOrigen.getCuentas()[i].getNumCuenta().equals(numCuentaOrigen)) cuentaOrigen = personaOrigen.getCuentas()[i];
                        }

                        for (int i = 0; i < personaDestino.getContadorCuentas(); i++) {
                            if (personaDestino.getCuentas()[i].getNumCuenta().equals(numCuentaDestino)) cuentaDestino = personaDestino.getCuentas()[i];
                        }

                        if (cuentaOrigen != null && cuentaDestino != null) {
                            cuentaOrigen.pagarRecibo(cantidad);
                            cuentaDestino.recibirAbono(cantidad);
                            System.out.println("Transferencia realizada correctamente.");
                        } else {
                            System.out.println("Error: Persona o cuenta no encontrada.");
                        }
                    }
                    break;

                case 7:
                    boolean hayMorosos = false;

                    for (int i = 0; i < contadorPersonas; i++) {
                        if (listaPersonas[i].esMorosa()) {
                            System.out.println("Personas morosas:");
                            System.out.println(listaPersonas[i].toString());
                            hayMorosos = true;
                        }
                    }

                    if (!hayMorosos) {
                        System.out.println("No hay personas morosas.");
                    }
                    break;
            }
        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }


    public static Persona buscarPersonaPorDNI(Persona[] listaPersonas, int contador, String dni) {
        for (int i = 0; i < contador; i++) {
            if (listaPersonas[i].getDNI().equalsIgnoreCase(dni)) {
                return listaPersonas[i];
            }
        }
        return null;
    }
}
