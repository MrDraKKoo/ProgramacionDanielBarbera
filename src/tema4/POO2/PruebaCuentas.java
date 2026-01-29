package tema4.POO2;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Array para guardar varias personas y un contador para saber cuántas hay
        Persona[] personas = new Persona[10];
        int numPersonas = 0;

        int opcion = 0;

        do {

            System.out.println("1. Instanciar objetos de tipo Persona");
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
                    if (numPersonas < personas.length) {
                        System.out.print("Nombre: "); String nom = in.nextLine();
                        System.out.print("Apellido 1: "); String ap1 = in.nextLine();
                        System.out.print("Apellido 2: "); String ap2 = in.nextLine();
                        System.out.print("DNI: "); String dni = in.nextLine();
                        // Pasamos los 4 parámetros que pide tu constructor
                        personas[numPersonas] = new Persona(nom, ap1, ap2, dni);
                        numPersonas++;
                        System.out.println("Persona creada correctamente.");
                    }
                    break;

                case 2:
                    System.out.print("¿A qué DNI asociamos la cuenta?: ");
                    String buscarDni = in.nextLine();
                    for (int i = 0; i < numPersonas; i++) {
                        if (personas[i].getDNI().equals(buscarDni)) {
                            System.out.print("Introduce número de cuenta (16 dígitos): ");
                            String nc = in.nextLine();
                            System.out.print("Saldo inicial: ");
                            double saldo = in.nextDouble();
                            personas[i].añadirCuenta(new Cuenta(nc, saldo));
                        }
                    }
                    break;

                case 3:
                    System.out.print("DNI de la persona: ");
                    String dni3 = in.nextLine();
                    boolean encontrado3 = false;
                    for (int i = 0; i < numPersonas; i++) {
                        if (personas[i].getDNI().equals(dni3)) {
                            encontrado3 = true;
                            System.out.print("Número de cuenta a consultar: ");
                            String nc3 = in.nextLine();
                            personas[i].mostrarDatosCuenta(nc3);
                        }
                    }
                    if (!encontrado3) System.out.println("ERROR: DNI no encontrado.");
                    break;

                case 4:
                    System.out.print("DNI: ");
                    String dni4 = in.nextLine();
                    System.out.print("Número de cuenta: ");
                    String nc4 = in.nextLine();
                    System.out.print("Cantidad de la nómina: ");
                    double nomina = in.nextDouble();

                    boolean realizado4 = false;
                    for (int i = 0; i < numPersonas; i++) {
                        if (personas[i].getDNI().equals(dni4)) {
                            // AQUÍ ES DONDE SE HACE LA MAGIA: llamamos al método
                            realizado4 = personas[i].gestionarMovimiento (nc4, nomina, true);
                        }
                    }

                    if (realizado4) {
                        System.out.println("Nómina ingresada correctamente.");
                    } else {
                        System.out.println("ERROR: No se pudo ingresar la nómina (DNI o Cuenta mal).");
                    }
                    break;

                case 5:
                    System.out.print("DNI: ");
                    String dni5 = in.nextLine();
                    System.out.print("Número de cuenta para el pago: ");
                    String nc5 = in.nextLine(); // <-- Aquí preguntamos la cuenta
                    System.out.print("Importe del recibo a pagar: ");
                    double recibo = in.nextDouble();

                    boolean pagado = false;
                    for (int i = 0; i < numPersonas; i++) {
                        if (personas[i].getDNI().equals(dni5)) {
                            // Llamamos a la lógica para que reste el saldo de verdad
                            pagado = personas[i].gestionarMovimiento(nc5, recibo, false);
                        }
                    }

                    if (pagado) {
                        System.out.println("Recibo pagado correctamente.");
                    } else {
                        System.out.println("ERROR: No se ha encontrado el DNI o la cuenta es incorrecta.");
                    }
                    break;

                case 6:
                    System.out.println("--- REALIZAR TRANSFERENCIA ---");
                    System.out.print("Introduce el DNI del titular: ");
                    String dni6 = in.nextLine();

                    boolean personaOk = false;
                    for (int i = 0; i < numPersonas; i++) {
                        if (personas[i].getDNI().equals(dni6)) {
                            personaOk = true;

                            System.out.print("Número de cuenta ORIGEN (quitar dinero): ");
                            String cuentaOrigen = in.nextLine();
                            System.out.print("Número de cuenta DESTINO (recibir dinero): ");
                            String cuentaDestino = in.nextLine();
                            System.out.print("Cantidad a transferir: ");
                            double cantidadTrans = in.nextDouble();

                            // 1. Intentamos quitar el dinero de la cuenta origen
                            boolean restaOk = personas[i].gestionarMovimiento(cuentaOrigen, cantidadTrans, false);

                            if (restaOk) {
                                // 2. Si se pudo quitar, lo ponemos en la destino
                                boolean sumaOk = personas[i].gestionarMovimiento(cuentaDestino, cantidadTrans, true);

                                if (sumaOk) {
                                    System.out.println("Transferencia realizada con éxito.");
                                } else {
                                    // Si falla el segundo paso, habría que devolver el dinero a la origen (opcional)
                                    System.out.println("ERROR: La cuenta de destino no existe.");
                                    personas[i].gestionarMovimiento(cuentaOrigen, cantidadTrans, true);
                                }
                            } else {
                                System.out.println("ERROR: No se pudo retirar dinero de la cuenta origen.");
                            }
                        }
                    }
                    if (!personaOk) System.out.println("ERROR: DNI no encontrado.");
                    break;

                case 7:
                    System.out.println("PERSONAS MOROSAS:");
                    for (int i = 0; i < numPersonas; i++) {
                        if (personas[i].esMorosa()) {
                            System.out.println("- Persona con DNI: " + personas[i].getDNI());
                        }
                    }
                    break;
            }
        } while (opcion != 0);

        System.out.println("Programa finalizado.");
    }
}