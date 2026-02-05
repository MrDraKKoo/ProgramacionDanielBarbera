package tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lista_de_la_compra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> listacompras = new HashSet<>();
        int opcion;
        do {
            System.out.println("\n"+"Que quieres hacer con tu lista de la compra?");
            System.out.println("1. Añadir un producto");
            System.out.println("2. Ver tu lista de la compra");
            System.out.println("3. Salir");
            opcion = in.nextInt();
            String prodcuto;
            switch (opcion) {
                case 1:
                    System.out.println("Que producto quieres añadir a la lista?");
                    in.nextLine();
                    prodcuto=(in.nextLine());
                    if (listacompras.contains(prodcuto)) {
                        System.out.println("El producto ya esta en la lista");
                    } else {
                        listacompras.add(prodcuto);
                        System.out.println("El producto ha sido añadido a tu lista");
                    }
                    break;
                case 2:
                    System.out.println("Tu lista tiene:");
                    for (String listacompra : listacompras) {
                        System.out.println(listacompra);
                    }
                    break;
                case 3:
                    break;
            }
        }while (opcion != 3);
        System.out.println("Has salido del programa");
    }
}
