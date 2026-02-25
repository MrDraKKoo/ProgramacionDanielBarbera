package Ejercicio1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestor_De_Libros {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Libro> lista = new ArrayList<>();
        int opcion;
        String isbn;
        String nombre;
        String autor;
        int numPag;
        String genero;
        formato formatolibro;
        Libro libro = new Libro();
        boolean existe;
        do {
            showMenu();
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el ISBN del libro:");
                    isbn = in.nextLine();
                    System.out.println("Introduce el nombre:");
                    nombre = in.nextLine();
                    System.out.println("Introduce el autor:");
                    autor = in.nextLine();
                    System.out.println("Introduce el numero de paginas");
                    numPag = in.nextInt();
                    System.out.println("Introduce el genero:");
                    genero = in.nextLine();
                    in.nextLine();
                    System.out.println("Introduce el tipo de libor: TAPA_DURA, TAPA_BLANDA, BOLSILLO");
                    formatolibro = formato.valueOf(in.nextLine());
                    libro = new Libro(isbn, nombre, autor, numPag, genero, formatolibro);
                    lista.add(libro);
                    System.out.println("El libro se ha guradado correctamente");
                    break;
                case 2:
                    System.out.println("Introduce el ISBN del libro que quieres ver la información:");
                    isbn = in.nextLine();
                    existe = buscarPorIsbn(isbn, (ArrayList) lista, libro);
                    if (existe == true) {
                        System.out.println("Informacion:" + "\n" + libro);
                    } else {
                        System.out.println("ISBN introducido no ncontrado");
                    }
                    break;
                case 3:
                    System.out.println("Introduce el ISBN del libro que quieres ver la información:");
                    isbn = in.nextLine();
                    existe = buscarPorIsbn(isbn, (ArrayList) lista, libro);
                    if (existe == true) {
                        System.out.println("Cambia el genero:");
                    } else {
                        System.out.println("ISBN introducido no ncontrado");
                    }
                    break;
                case 4:

                    break;
            }
        } while (opcion != 5);
        System.out.println("Has salido del programa");
        in.close();
    }

    public static void showMenu() {
        System.out.println("*Menu*");
        System.out.println("1) Introducir libro");
        System.out.println("2) Mostrar información de un libro (por ISBN)");
        System.out.println("3) Modificar genero de un libro (por ISBN)");
        System.out.println("4) Buscar todos los libros de un autor");
        System.out.println("5) Salir");
    }

    public static boolean buscarPorIsbn(String isbn, ArrayList lista, Libro libro) {
        boolean esta = false;
        for (int i = 0; i < lista.size(); i++) {
            if (isbn == libro.getIsbn()) {
                System.out.println("ISBN encontrado");
                esta =true;
            }
        }
        return esta;
    }
}

