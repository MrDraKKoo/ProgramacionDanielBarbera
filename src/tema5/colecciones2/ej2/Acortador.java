package tema5.colecciones2.ej2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Acortador {
    public static void main(String[] args) {
        HashMap<String, String> urls = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- ACORTADOR DE URLS ---");
            System.out.println("1. Crear nuevo registro (Acortar)");
            System.out.println("2. Resolver dirección");
            System.out.println("3. Borrar registro");
            System.out.println("4. Mostrar todos los registros");
            System.out.println("5. Salir");
            System.out.print("Seleccione opción: ");
            opcion = in.nextInt();
            in.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la URL completa: ");
                    String urlLarga = in.nextLine();
                    String clave = generarClaveAleatoria();

                    urls.put(clave, urlLarga); // Guardar en el diccionario

                    System.out.println("URL acortada generada: https://acortar.link/" + clave);
                    System.out.println("Clave única: " + clave);
                    break;

                case 2:
                    System.out.print("Introduce la clave única (ej. FQp7Y): ");
                    String claveBuscar = in.nextLine();

                    if (urls.containsKey(claveBuscar)) {
                        System.out.println("Dirección real: " + urls.get(claveBuscar));
                    } else {
                        System.out.println("Error: La clave no existe.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce la clave a borrar: ");
                    String claveBorrar = in.nextLine();

                    if (urls.remove(claveBorrar) != null) {
                        System.out.println("Registro eliminado correctamente.");
                    } else {
                        System.out.println("Error: No se encontró esa clave.");
                    }
                    break;

                case 4:
                    System.out.println("\nLISTADO DE REGISTROS");
                    if (urls.isEmpty()) {
                        System.out.println("No hay registros almacenados.");
                    } else {
                        // Recorrer el diccionario
                        for (Map.Entry<String, String> registro : urls.entrySet()) {
                            System.out.println("Clave: " + registro.getKey() + "URL: " + registro.getValue());
                        }
                    }
                    break;
            }
        } while (opcion != 5);
    }


    public static String generarClaveAleatoria() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder resultado = new StringBuilder();
        Random rnd = new Random();

        for (int i = 0; i < 5; i++) {
            resultado.append(caracteres.charAt(rnd.nextInt(caracteres.length())));
        }
        return resultado.toString();
    }
}