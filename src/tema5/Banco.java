package tema5;

import java.util.*;

public class Banco {
    public static void main(String[] args) {
        List<UsuariosBanco> usuariosBancoCola= new LinkedList<>();
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int opcion;
        do {
            System.out.println("Que quieres realizar:");
            System.out.println("1. Añadir una persona a la cola");
            System.out.println("2. Eliminar al primero de la cola");
            System.out.println("3. Eliminar a una persona de cola");
            System.out.println("4. Salir");
            opcion = in.nextInt();
            in.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Introduce el nombre:");
                    String nombre = in.nextLine();
                    System.out.println("Introduce la edad:");
                    int  edad = in.nextInt();
                    System.out.println("Introduce el DNI");
                    in.nextLine();
                    String DNI = in.nextLine();
                    usuariosBancoCola.add(new UsuariosBanco(nombre, edad, DNI));
                    break;
                case 2:
                    if (usuariosBancoCola.isEmpty()){
                        System.out.println("No hay nadie en la cola");
                    }else {
                        usuariosBancoCola.remove(0);
                        System.out.println("El primero de la cola ya lo han atendido y se ha ido");
                    }
                    break;
                case 3:
                    int personaRandom = random.nextInt(usuariosBancoCola.toArray().length);
                    System.out.println(usuariosBancoCola.get(personaRandom).getNombre()+" se ha cansado de esperar y se ha ido");
                    usuariosBancoCola.remove(personaRandom);
                    break;
            }
        }while (opcion != 4);
    }
}
