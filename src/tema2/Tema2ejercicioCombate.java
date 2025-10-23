package tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2ejercicioCombate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ataque1 = 0;
        int ataque2 = 0;
        int ronda = 0;

        System.out.println("*******Bienvenido*****");

        //Datos de jugador 1 y bucle para que no pase de 500 puntos y no tenga atributos negativos
        System.out.println("Eres el jugador 1");
        System.out.println("Antes de introducir  los datos recuerda que el maximo de puntos en total son 500 puntos, si en un dato te pasas de 200 puntos se asignará auntomaticamente 200 puntos");
        System.out.println("Introduce la vida que tiene tu personaje");
        int vida_personaje = in.nextInt();
        if (vida_personaje > 200) vida_personaje = 200;
        System.out.println("Ahora introduce la defensa que tiene tu personaje");
        int defensa_personaje = in.nextInt();
        if (defensa_personaje > 200) defensa_personaje = 200;
        System.out.println("Ahora la velocidad que tiene tu personaje");
        int velocidad_personaje = in.nextInt();
        if (velocidad_personaje > 200) velocidad_personaje = 200;
        System.out.println("Por últmio que ataque  tiene tu personaje");
        int ataque_personaje = in.nextInt();
        if (ataque_personaje > 200) ataque_personaje = 200;
        int media1 = defensa_personaje + velocidad_personaje + ataque_personaje + vida_personaje;
        while (media1 > 500 || vida_personaje <= 0 || defensa_personaje <= 0 || velocidad_personaje <= 0 || ataque_personaje <= 0) {
            System.out.println("El personaje pasa de 500 puntos maximos que se reparten en las estadisticas, o has introducido atributos 0 o menores");
            System.out.println("Vuelve a introducir los datos");
            System.out.println("Vida del personaje");
            vida_personaje = in.nextInt();
            if (vida_personaje > 200) vida_personaje = 200;
            System.out.println("Defensa  del personaje");
            defensa_personaje = in.nextInt();
            if (defensa_personaje > 200) defensa_personaje = 200;
            System.out.println("Velocidad del personaje");
            velocidad_personaje = in.nextInt();
            if (velocidad_personaje > 200) velocidad_personaje = 200;
            System.out.println("Ataque del personaje");
            ataque_personaje = in.nextInt();
            if (ataque_personaje > 200) ataque_personaje = 200;
            media1 = vida_personaje + defensa_personaje + velocidad_personaje + ataque_personaje;
        }

        //Datos de jugador 2 y bucle para que no pase de 500 puntos

        System.out.println("Turno del jugador 2");
        System.out.println("Introduce la vida que tiene tu personaje");
        int vida_personaje2 = in.nextInt();
        if (vida_personaje2 > 200) vida_personaje2 = 200;
        System.out.println("Ahora introduce la defensa que tiene tu personaje");
        int defensa_personaje2 = in.nextInt();
        if (defensa_personaje2 > 200) defensa_personaje2 = 200;
        System.out.println("Ahora la velocidad que tiene tu personaje");
        int velocidad_personaje2 = in.nextInt();
        if (velocidad_personaje2 > 200) velocidad_personaje2 = 200;
        System.out.println("Por últmio que ataque  tiene tu personaje");
        int ataque_personaje2 = in.nextInt();
        if (ataque_personaje2 > 200) ataque_personaje2 = 200;
        int media2 = defensa_personaje2 + velocidad_personaje2 + ataque_personaje2 + vida_personaje2;
        while (media2 > 500 || vida_personaje2 <= 0 || defensa_personaje2 <= 0 || velocidad_personaje2 <= 0 || ataque_personaje2 <= 0) {
            System.out.println("El personaje pasa de 500 puntos maximos que se reparten en las estadisticas");
            System.out.println("Vuelve a introducir los datos");
            System.out.println("Vida del personaje");
            vida_personaje2 = in.nextInt();
            if (vida_personaje2 > 200) vida_personaje2 = 200;
            System.out.println("Defensa  del personaje");
            defensa_personaje2 = in.nextInt();
            if (defensa_personaje2 > 200) defensa_personaje2 = 200;
            System.out.println("Velocidad del personaje");
            velocidad_personaje2 = in.nextInt();
            if (velocidad_personaje2 > 200) velocidad_personaje2 = 200;
            System.out.println("Ataque del personaje");
            ataque_personaje2 = in.nextInt();
            if (ataque_personaje2 > 200) ataque_personaje2 = 200;
            media2 = vida_personaje2 + defensa_personaje2 + velocidad_personaje2 + ataque_personaje2;
        }
        int vida_personaje_inicial = vida_personaje;
        int vida_personaje2_inicial = vida_personaje2;

        // Mostrar la vida inicial de cada jugador antes de la batalla
        System.out.print("Jugador 1 [");
        for (int i = 0; i < vida_personaje / 10; i++) System.out.print("❤️");
        if (vida_personaje % 10 > 0) System.out.print("💔");
        System.out.println("] " + vida_personaje);

        System.out.print("Jugador 2 [");
        for (int i = 0; i < vida_personaje2 / 10; i++) System.out.print("❤️");
        if (vida_personaje2 % 10 > 0) System.out.print("💔");
        System.out.println("] " + vida_personaje2);

        //Si son igual de rapidos hacer que uno sea mas rapido de forma aleatoria

        if (velocidad_personaje == velocidad_personaje2) {
            System.out.println("Tienen la misma valocidad asi que se va a decidir de forma aleatoria");
            Random random = new Random();
            int velocidad_aleatoria = 0;
            velocidad_aleatoria = random.nextInt(3) + 1;
            if (velocidad_aleatoria == 1) {
                System.out.println("Ha salido el Personaje 1, asi que tiene 1 punto mas de velocidad");
                velocidad_personaje++;

            } else {
                System.out.println("Ha salido el Personaje 2, asi que tiene 1 punto mas de velocidad");
                velocidad_personaje2++;
            }
        }
        System.out.println("\n¡Comienza la batalla!\n");

        //bucle para el ataque hasta que 1 llegue a 0 de vida
        while (vida_personaje > 0 && vida_personaje2 > 0) {
            System.out.println("\n **********Ronda" + ronda + "********** \n");
            //ataque jugador 1 (primero)
            if (velocidad_personaje > velocidad_personaje2) {
                ataque1 = ataque_personaje - defensa_personaje2;
                if (ataque1 <= 0) ataque1 = 10;
                Random random1 = new Random();
                vida_personaje2 = vida_personaje2 - random1.nextInt(ataque1) + 1;
                if (vida_personaje2 < 0) vida_personaje2 = 0;
                // Barra de vida simple Jugador 2
                System.out.print("Jugador 2 [");
                for (int i = 0; i < vida_personaje2 / 10; i++) System.out.print("❤️");
                // medio corazón si queda entre 1 y 9
                if (vida_personaje2 % 10 > 0) System.out.print("💔");
                System.out.println("] " + vida_personaje2);
                if (vida_personaje2 == 0) {
                    System.out.println("***El Jugador 2 ya no  tiene vida, el ganador es el Jugador 1***");
                } else {
                    //ataque jugador 2 (segudno)
                    ataque2 = ataque_personaje2 - defensa_personaje;
                    if (ataque2 <= 0) ataque2 = 10;
                    vida_personaje = vida_personaje - random1.nextInt(ataque2) + 1;
                    if (vida_personaje < 0) vida_personaje = 0;
                    // Barra de vida simple Jugador 1
                    System.out.print("Jugador 1 [");
                    for (int i = 0; i < vida_personaje / 10; i++) System.out.print("❤️");
                    // medio corazón si queda entre 1 y 9
                    if (vida_personaje % 10 > 0) System.out.print("💔");
                    System.out.println("] " + vida_personaje);

                    if (vida_personaje == 0) {
                        System.out.println("***El Jugador 1 ya no tiene vida, el ganador es el Jugador 2***");
                    }
                }
            } else {
                // ataque jugador 2 (primero)
                ataque2 = ataque_personaje2 - defensa_personaje;
                if (ataque2 <= 0) ataque2 = 10;
                Random random2 = new Random();
                vida_personaje = vida_personaje - random2.nextInt(ataque2) + 1;
                if (vida_personaje < 0) vida_personaje = 0;
                // Barra de vida simple Jugador 1
                System.out.print("Jugador 1 [");
                for (int i = 0; i < vida_personaje / 10; i++) System.out.print("❤️");
                // medio corazón si queda entre 1 y 9
                if (vida_personaje % 10 > 0) System.out.print("💔");
                System.out.println("] " + vida_personaje);
                if (vida_personaje == 0) {
                    System.out.println("***El Jugador 1 ya no tiene vida, el ganador es el Jugador 2***");
                } else {
                    // ataquejugador 1 (segundo)
                    ataque1 = ataque_personaje - defensa_personaje2;
                    if (ataque1 <= 0) ataque1 = 10;
                    vida_personaje2 = vida_personaje2 - random2.nextInt(ataque1) + 1;
                    if (vida_personaje2 < 0) vida_personaje2 = 0;
                    // Barra de vida simple Jugador 2
                    System.out.print("Jugador 2 [");
                    for (int i = 0; i < vida_personaje2 / 10; i++) System.out.print("❤️");
                    // medio corazón si queda entre 1 y 9
                    if (vida_personaje2 % 10 > 0) System.out.print("💔");
                    System.out.println("] " + vida_personaje2);
                    if (vida_personaje2 == 0) {
                        System.out.println("***El jugador 2 ya no tiene vida, el ganador es el Jugador 1***");
                    }
                }
            }
            ronda++;
        }
    }
}
