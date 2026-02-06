package tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lista_de_la_compra_mejorada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> listacompras = new HashSet<>();
        Set<String> carrito = new HashSet<>();
        int opcion;
        do {
            System.out.println("\n"+"Que quieres hacer con tu lista de la compra?");
            System.out.println("1. Añadir un producto a tu lista");
            System.out.println("2. Ver tu lista de la compra");
            System.out.println("3. Añadir un producto a tu carrito");
            System.out.println("4. Ver los productos de tu carrito");
            System.out.println("5. Salir");
            opcion = in.nextInt();
            in.nextLine();
            String prodcuto;
            switch (opcion) {
                case 1:
                    System.out.println("Que producto quieres añadir a la lista?");
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
                    System.out.println("Que producto quieres añadir al carrito?");
                    prodcuto=(in.nextLine());
                    if (carrito.contains(prodcuto)) {
                        System.out.println("El producto ya esta en el carrito");
                    } else {
                        carrito.add(prodcuto);
                        System.out.println("El producto ha sido añadido a tu carrito");
                        listacompras.remove(prodcuto);
                        System.out.println("Se ha eliminado el mismo prodcuto de la lista");
                    }
                    break;
                case 4:
                    System.out.println("Tu carrito tiene:");
                    for (String listacarrito : carrito) {
                        System.out.println(listacarrito);
                    }
                    break;
            }
        }while (opcion != 5);
        System.out.println("Has salido del programa");
    }
}

