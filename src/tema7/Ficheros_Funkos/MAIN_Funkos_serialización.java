package tema7.Ficheros_Funkos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MAIN_Funkos_serialización {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        ArrayList<Funko_S> funkoArrayList = new ArrayList<Funko_S>();
        cargarFunkos(funkoArrayList);

        while (!salir) {
            menu();
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    aniadirFunko(in, funkoArrayList);
                    break;
                case 2:
                    eliminarFunko(in, funkoArrayList);
                    break;
                case 3:
                    mostrarTodos(funkoArrayList);
                    break;
                case 4:
                    mostrarCaro(funkoArrayList);
                    break;
                case 5:
                    mediaPrecios(funkoArrayList);
                    break;
                case 6:
                    mostrarModelo(in, funkoArrayList);
                    break;
                case 7:
                    mostrarPorAnio(funkoArrayList);
                    break;
                case 8:
                    guardarFunkos(funkoArrayList);
                    salir = true;
                    System.err.println("Has salido del programa");
                    break;
            }
        }
        exportarABinario(funkoArrayList);
    }
    public static void menu (){
        System.out.println("\n***Menú***");
        System.out.println("1) Añadir Funko");
        System.out.println("2) Eliminar Funko");
        System.out.println("3) Mostrar todos los Funkos");
        System.out.println("4) Mostrar el Funko mas caro");
        System.out.println("5) Mostrar la medio de precios dde los Funkos");
        System.out.println("6) Mostrar los Funkos agrupados por modelos");
        System.out.println("7) Mostrar los Funkos de 2023");
        System.out.println("8) Salir");
        System.out.println("Que quieres realizar ?");
    }
    public static void aniadirFunko(Scanner in, ArrayList<Funko_S> lista) {
        System.out.println("Introduce codigo del Funko:");
        String cod = in.nextLine();
        System.out.println("Introduce el nombre del Funko:");
        String nombre = in.nextLine();
        System.out.println("Introduce el modelo del Funko:");
        String modelo = in.nextLine();
        System.out.println("Introduce el precio del Funko:");
        double precio = in.nextDouble();
        System.out.println("Introduce el anio del Funko:");
        String anio = in.nextLine();

        lista.add(new Funko_S(cod, nombre, modelo, precio, anio));
        System.out.println("Funko añadido correctamente.");
    }
    public static void eliminarFunko(Scanner in, ArrayList<Funko_S> lista) {
        System.out.println("Introduce el nombre del Funko:");
        String nombre = in.nextLine();
        Funko_S enontrado = null;
        for (Funko_S f : lista) {
            if (f.getNombre().equalsIgnoreCase(nombre)) {
                enontrado = f;
                break;
            }
        }
        if (enontrado != null) {
            lista.remove(enontrado);
            System.out.println("Funko eliminado correctamente.");
        }else  {
            System.out.println("Funko no encontrado");
        }
    }
    public static void mostrarTodos(ArrayList<Funko_S> lista) {
        for (Funko_S f : lista) {
            System.out.println(f);
        }
    }
    public static void mostrarCaro(ArrayList<Funko_S> lista){
        if (lista.isEmpty()) {
            System.out.println("No hay Funkos en la lista.");
            return;
        }

        double maximo = 0;
        Funko_S masCaro = lista.get(0);

        for (Funko_S f : lista) {
            if(f.getPrecio() > maximo){
                maximo = f.getPrecio();
                masCaro = f;
            }
        }
        System.out.println("El Funko más caro es: " + masCaro);
    }
    public static void mostrarModelo(Scanner in, ArrayList<Funko_S> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista está vacía. No hay nada que agrupar.");
            return;
        }

        ArrayList<String> modelosExistentes = new ArrayList<>();
        for (Funko_S f : lista) {
            if (!modelosExistentes.contains(f.getModelo())) {
                modelosExistentes.add(f.getModelo());
            }
        }


        for (String m : modelosExistentes) {
            System.out.println("\nMODELO: " + m.toUpperCase());
            for (Funko_S f : lista) {
                if (f.getModelo().equals(m)) {
                    System.out.println("- " + f);
                }
            }
        }
    }
    public static void mediaPrecios(ArrayList<Funko_S> lista){
        if (lista.isEmpty()) {
            System.out.println("No hay Funkos para calcular la media.");
            return;
        }

        double suma = 0;
        for (Funko_S f : lista) {
            suma = suma + f.getPrecio();
        }
        double media = suma / lista.size();
        System.out.println("Media: " + media);
    }
    public static void mostrarPorAnio(ArrayList<Funko_S> lista) {
        for (Funko_S f : lista) {
            if (f.getAnio().startsWith("2023")) {
                System.out.println(f);
            }
        }
    }

    public static void cargarFunkos(ArrayList<Funko_S> lista) {
        File archivo = new File("funkos.csv");

        if (!archivo.exists()) {
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            br.readLine();
            while ((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    String[] partes = linea.split(",");
                    if (partes.length == 5) {
                        String cod = partes[0];
                        String nombre = partes[1];
                        String modelo = partes[2];
                        double precio = Double.parseDouble(partes[3]);
                        String anio = partes[4].split("-")[0];
                        lista.add(new Funko_S(cod, nombre, modelo, precio, anio));
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }

    public static void guardarFunkos(ArrayList<Funko_S> lista) {
        try (PrintWriter pw = new PrintWriter(new FileWriter("funkos.csv"))) {
            for (Funko_S f : lista) {
                pw.println(f.getCod() + "," + f.getNombre() + "," + f.getModelo() + "," + f.getPrecio() + "," + f.getAnio() + "-01-01");
            }
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
    public static void exportarABinario(ArrayList<Funko_S> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("funkos.dat"))) {
            oos.writeObject(lista);
            System.out.println("Copiado con éxito a binario.");
        } catch (IOException e) {
            System.out.println("Error al exportar: " + e.getMessage());
        }
    }
}
