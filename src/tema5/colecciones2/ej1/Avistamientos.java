package tema5.colecciones2.ej1;

import java.util.ArrayList;
import java.util.Scanner;

public class Avistamientos {
    public static void main(String[] args) {
        ArrayList<Animal> lista = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ GUARDABOSQUES ---");
            System.out.println("1. Añadir avistamiento");
            System.out.println("2. Mostrar desde las 08:00");
            System.out.println("3. Mostrar nocturnos (20:00 a 08:00)");
            System.out.println("4. Mostrar manadas de lobos");
            System.out.println("5. Mostrar serpientes");
            System.out.println("6. Mostrar pájaros");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("¿Qué animal es? (1-Serpiente, 2-Pájaro, 3-Lobo)");
                    int eleccion = in.nextInt();
                    System.out.print("Hora (0-23): ");
                    int h = in.nextInt();
                    in.nextLine();

                    if (eleccion == 1) {
                        System.out.print("Longitud: ");
                        double lon = in.nextDouble();
                        in.nextLine();
                        System.out.print("Especie: ");
                        String esp = in.nextLine();
                        lista.add(new Serpiente(h, lon, esp)); // Dentro de Serpiente pon super(hora, 1)
                    } else if (eleccion == 2) {
                        System.out.print("Peso: ");
                        double peso = in.nextDouble();
                        in.nextLine();
                        System.out.print("Especie: ");
                        String esp = in.nextLine();
                        lista.add(new Pajaro(h, peso, esp)); // Dentro de Pajaro pon super(hora, 2)
                    } else if (eleccion == 3) {
                        System.out.print("Número de lobos: ");
                        int num = in.nextInt();
                        in.nextLine();
                        System.out.print("Observaciones: ");
                        String obs = in.nextLine();
                        lista.add(new ManadaLobos(h, num, obs)); // Dentro de Manada pon super(hora, 3)
                    }
                    break;

                case 2:
                    System.out.println("Avistamientos desde las 8:00");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getHora() >= 8) {
                            System.out.println(lista.get(i).toString());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Avistamientos Nocturnos");
                    for (int i = 0; i < lista.size(); i++) {
                        int hora = lista.get(i).getHora();
                        if (hora >= 20 || hora < 8) {
                            System.out.println(lista.get(i).toString());
                        }
                    }
                    break;

                case 4: // MOSTRAR LOBOS (Tipo 3)
                    System.out.println("Manadas de Lobos");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getTipo() == 3) {
                            System.out.println(lista.get(i).toString());
                        }
                    }
                    break;

                case 5: // MOSTRAR SERPIENTES (Tipo 1)
                    System.out.println("Serpientes");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getTipo() == 1) {
                            System.out.println(lista.get(i).toString());
                        }
                    }
                    break;

                case 6: // MOSTRAR PÁJAROS (Tipo 2)
                    System.out.println("Pájaros");
                    for (int i = 0; i < lista.size(); i++) {
                        if (lista.get(i).getTipo() == 2) {
                            System.out.println(lista.get(i).toString());
                        }
                    }
                    break;
            }
        } while (opcion != 7);
    }
}