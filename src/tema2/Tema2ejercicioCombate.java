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

        //Datos de jugador 1 y bucle para que no pase de 500 puntos

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
        while (media1 > 500) {
            System.out.println("El personaje pasa de 500 puntos maximos que se reparten en las estadisticas");
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
        while (media2 > 500) {
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
        //fase de ataque

        if (velocidad_personaje == velocidad_personaje2){
            System.out.println("Tienen la misma valocidad asi que se va a decidir de forma aleatoria");
            Random random = new Random();
            int velocidad_aleatoria = 0;
            velocidad_aleatoria = random.nextInt(3) + 1;
            if (velocidad_aleatoria ==1){
                System.out.println("Ha salido el Personaje 1, asi que tiene 1 punto mas de velocidad");
                velocidad_personaje++;

            }else{
                System.out.println("Ha salido el Personaje 2, asi que tiene 1 punto mas de velocidad");
                velocidad_personaje2++;
            }
        }

        while (vida_personaje > 0 || vida_personaje2 > 0) {
            System.out.println("Ronda"+ronda);
            if (velocidad_personaje > velocidad_personaje2) {
                ataque1 = ataque_personaje - defensa_personaje2;
                if (ataque1 <= 0) ataque1=10;
                Random random = new Random();
                vida_personaje2 = vida_personaje2 - random.nextInt(ataque1) + 1;
                System.out.println("Personaje 1 ha quitado " + vida_personaje2 + " de vida");
                System.out.println("La vida de Personaje 2 es " + vida_personaje2);
                if (vida_personaje2 < 0) vida_personaje2 = 0;
                if (vida_personaje2 == 0) {
                    System.out.println("El Jugador 2 ya no  tiene vida, el ganador es el Jugador 1");
                } else {
                    ataque2 = ataque_personaje2 - defensa_personaje;
                    if (ataque2 <= 0) ataque1=10;
                    vida_personaje = vida_personaje - random.nextInt(ataque2) + 1;
                    System.out.println("Personaje 2 ha dejado a " + vida_personaje + " de vida a Personaje 1");
                    System.out.println("La vida de Personaje 1 es " + vida_personaje);
                    if (vida_personaje < 0) vida_personaje = 0;
                    if (vida_personaje == 0) {
                        System.out.println("El Jugador 1 ya no tiene vida, el ganador es el Jugador 2");
                    }
                }
            }else {
                ataque2 = ataque_personaje2 - defensa_personaje;
                if (ataque2 <= 0) ataque1=10;
                Random random = new Random();
                vida_personaje = vida_personaje - random.nextInt(ataque2) + 1;
                if (vida_personaje < 0) vida_personaje = 0;
                if (vida_personaje == 0) {
                    System.out.println("El Jugador 1 ya no tiene vida, el ganador es el Jugador 2");
                }else{
                    ataque1 = ataque_personaje - defensa_personaje2;
                    if (ataque1 <= 0) ataque1=10;
                    vida_personaje2 = vida_personaje2 - random.nextInt(ataque1) + 1;
                    if (vida_personaje2 < 0) vida_personaje2 = 0;
                    if (vida_personaje2 == 0) {
                        System.out.println("El jugador 2 ya no tiene vida, el ganador es el Jugador 1");
                    }
                }
            }
            ronda++;
        }
    }
}
