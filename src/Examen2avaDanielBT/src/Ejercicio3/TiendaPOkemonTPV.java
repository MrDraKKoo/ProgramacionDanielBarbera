package Ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiendaPOkemonTPV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Articulo> articuloArrayList = new ArrayList<>();

        int nivel;
        int posicion;
        boolean grtis;
        String nomPocion;
        String nomProd = "";
        String pokebola;
        String accesorio;
        int opcion;

        Pokebola pokebola1 = new Pokebola();
        Pocion pocion = new Pocion();
        Accesorios accesorios = new Accesorios();
        do {
            showMenu();
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre de la pocion:");
                    nomPocion = in.nextLine();
                    System.out.println("Es gratis? (true/ false");
                    grtis = in.nextBoolean();
                    System.out.println("introduce el nivel de la pocion:");
                    nivel = in.nextInt();
                    in.nextLine();
                    pocion = new Pocion(nomPocion, grtis, nivel);
                    articuloArrayList.add(pocion);
                    System.out.println("Se ha creado con exito la pocion");
                    break;
                case 2:
                    System.out.println("Nombre de producto:");
                    nomPocion = in.nextLine();
                    System.out.println("introduce el nombre de la pokebola:");
                    pokebola = in.nextLine();
                    System.out.println("Es gratis? (true/ false");
                    grtis = in.nextBoolean();
                    pokebola1 = new Pokebola(nomProd, grtis, pokebola);
                    articuloArrayList.add(pokebola1);
                    System.out.println("Se ha creado con exito la pokebola");
                    break;
                case 3:
                    System.out.println("Nombre de producto:");
                    nomProd = in.nextLine();
                    System.out.println("introduce el nombre del accesorio:");
                    accesorio = in.nextLine();
                    System.out.println("Es gratis? (true/ false");
                    grtis = in.nextBoolean();
                    in.nextLine();
                    accesorios = new Accesorios(nomProd, grtis, accesorio);
                    articuloArrayList.add(accesorios);
                    System.out.println("Se ha creado con exito el accesorio");
                    break;
                case 4:
                    System.out.println("Dime la posicion del articulo que quieres eliminar:");
                    posicion = in.nextInt();
                    articuloArrayList.remove(posicion);
                    break;
                case 5:
                    for (Articulo prodcutos : articuloArrayList){
                        System.out.println(prodcutos);
                    }
                    break;
                case 6:
                    double precio =pokebola1.precio() + pocion.precio() + accesorios.precio();
                    break;
            }
        } while (opcion != 7);
        System.out.println("Has salido del programa");
        in.close();
    }

    public static void showMenu() {
        System.out.println("*Menu*");
        System.out.println("1) Añadir poción al ticket");
        System.out.println("2) Añadir pokebola al ticket");
        System.out.println("3) Añadir accesorio al ticket");
        System.out.println("4) Borrar el articulo del ticket (por posicion en el ticket)");
        System.out.println("5) Mostrar todos los articulos del ticket");
        System.out.println("6) Mostrar total");
        System.out.println("7) Salir");
    }
}
