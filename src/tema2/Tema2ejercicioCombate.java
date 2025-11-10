package tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2ejercicioCombate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ataque1 = 0;
        int ataque2 = 0;
        int ronda = 1;
        int predeterminado1 = 0;
        int predeterminado2 = 0;
        int vida_personaje = 0;
        int defensa_personaje = 0;
        int velocidad_personaje = 0;
        int ataque_personaje = 0;
        int vida_personaje2 = 0;
        int defensa_personaje2 = 0;
        int velocidad_personaje2 = 0;
        int ataque_personaje2 = 0;
        int opcion1 = 0;
        int cooldownDefensa1 = 0;
        int cooldownDefensa2 = 0;
        int opcion2 = 0;

        System.out.println("*******Bienvenido*****");

        //Datos de jugador 1

        System.out.println("Eres el jugador 1");
        System.out.println("Que quieres elegir? Escribe 1 o 2 depende de lo que quieras hacer");
        System.out.println("1.Personaje predeterminado");
        System.out.println("2.Personaje personalizado");
        predeterminado1 = in.nextInt();

        //comprobar que el numero introducido es valido
        while (predeterminado1 != 1 && predeterminado1 != 2) {
            System.out.println("Has introducio un valor erroneo, porfavor introduce un valor valido");
            System.out.println("1.Personaje predeterminado");
            System.out.println("2.Personaje personalizado");
            predeterminado1 = in.nextInt();
        }

        //elegir personaje predeterminado o personalizarlo

        switch (predeterminado1) {
            case 1: {
                //personaje predeterminado
                vida_personaje = 125;
                defensa_personaje = 125;
                ataque_personaje = 125;
                velocidad_personaje = 125;
                break;

            }
            case 2: {
                //presonaje personalizado (si el usuario se pasa de 200 en una estadistica se le corrige a 200 automaticamente)
                System.out.println("Antes de introducir  los datos recuerda que el maximo de puntos en total son 500 puntos, si en un dato te pasas de 200 puntos se asignará auntomaticamente 200 puntos");
                System.out.println("Introduce la vida que tiene tu personaje");
                vida_personaje = in.nextInt();
                if (vida_personaje > 200) vida_personaje = 200;
                System.out.println("Ahora introduce la defensa que tiene tu personaje");
                defensa_personaje = in.nextInt();
                if (defensa_personaje > 200) defensa_personaje = 200;
                System.out.println("Ahora la velocidad que tiene tu personaje");
                velocidad_personaje = in.nextInt();
                if (velocidad_personaje > 200) velocidad_personaje = 200;
                System.out.println("Por últmio que ataque  tiene tu personaje");
                ataque_personaje = in.nextInt();
                if (ataque_personaje > 200) ataque_personaje = 200;
                int media1 = defensa_personaje + velocidad_personaje + ataque_personaje + vida_personaje;

                //Bucle por si se pasa de 500 o pone una estadistica por 0 o por debjo de 0 para Jugador 1

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
                break;
            }
        }

        //Datos de jugador 2
        System.out.println("Eres el jugador 2");
        System.out.println("Que quieres elegir? Escribe 1 o 2 depende de lo que quieras hacer, si pones otra cosa se cerrará el programa");
        System.out.println("1.Personaje predeterminado");
        System.out.println("2.Personaje personalizado");
        predeterminado2 = in.nextInt();

        //comprobación de que el numero introducido es valido
        while (predeterminado1 != 1 && predeterminado1 != 2) {
            System.out.println("Has introducio un valor erroneo, porfavor introduce un valor valido");
            System.out.println("1.Personaje predeterminado");
            System.out.println("2.Personaje personalizado");
            predeterminado1 = in.nextInt();
        }
        //elegir personaje predeterminado o personalizarlo
        switch (predeterminado2) {
            case 1: {
                //personaje predeterminado
                vida_personaje2 = 125;
                defensa_personaje2 = 125;
                ataque_personaje2 = 125;
                velocidad_personaje2 = 125;
                break;
            }
            case 2: {
                //presonaje personalizado (si el usuario se pasa de 200 en una estadistica se le corrige a 200 automaticamente)
                System.out.println("Turno del jugador 2");
                System.out.println("Introduce la vida que tiene tu personaje");
                vida_personaje2 = in.nextInt();
                if (vida_personaje2 > 200) vida_personaje2 = 200;
                System.out.println("Ahora introduce la defensa que tiene tu personaje");
                defensa_personaje2 = in.nextInt();
                if (defensa_personaje2 > 200) defensa_personaje2 = 200;
                System.out.println("Ahora la velocidad que tiene tu personaje");
                velocidad_personaje2 = in.nextInt();
                if (velocidad_personaje2 > 200) velocidad_personaje2 = 200;
                System.out.println("Por últmio que ataque  tiene tu personaje");
                ataque_personaje2 = in.nextInt();
                if (ataque_personaje2 > 200) ataque_personaje2 = 200;
                int media2 = defensa_personaje2 + velocidad_personaje2 + ataque_personaje2 + vida_personaje2;

                //Bucle por si se pasa de 500 o pone una estadistica por 0 o por debjo de 0 para Jugador 1

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
            }
        }
        int vida_personaje_inicial = vida_personaje;
        int vida_personaje2_inicial = vida_personaje2;


        //Si son igual de rapidos hacer que uno sea mas rapido de forma aleatoria
        if (velocidad_personaje == velocidad_personaje2) {
            System.out.println("Tienen la misma valocidad asi que se va a decidir de forma aleatoria");
            Random random = new Random();
            int velocidad_aleatoria = 0;
            velocidad_aleatoria = random.nextInt(2);
            if (velocidad_aleatoria == 0) {
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
            System.out.println("-".repeat(50));
            System.out.println("**Ronda " + ronda + "**" + " \n");
            // mostrar la vida actual
            {
                System.out.print("Jugador 1 [");
                for (int i = 0; i < vida_personaje / 10; i++) System.out.print("❤️");
                if (vida_personaje % 10 > 0) System.out.print("💔");
                System.out.println("] " + vida_personaje);

                System.out.print("Jugador 2 [");
                for (int i = 0; i < vida_personaje2 / 10; i++) System.out.print("❤️");
                if (vida_personaje2 % 10 > 0) System.out.print("💔");
                System.out.println("] " + vida_personaje2);
            }

            //Pide acción a jugador 1
            System.out.println("Jugador 1 que quieres hacer:");
            System.out.println("1.Atacar");
            System.out.println("2.Defenderse");
            System.out.println("3.curarse");
            opcion1 = in.nextInt();

            // Pide acción a jugador 2
            System.out.println("Jugador 2, ¿qué quieres hacer?");
            System.out.println("1. Atacar");
            System.out.println("2. Defenderse");
            System.out.println("3. Curarse");
            opcion2 = in.nextInt();

            //defensa jugador 1
            if (opcion1 == 2) {
                if (cooldownDefensa1 == 1) {
                    System.out.println("Jugador 1 no puede defenderse este turno, debe atacar.");
                    opcion1 = 1;
                    cooldownDefensa1 = 0;
                } else {
                    System.out.println("Jugador 1 se defiende este turno.");
                    cooldownDefensa1 = 1;
                }
            }

            //defensa jugador 2
            if (opcion2 == 2) {
                if (cooldownDefensa2 == 1) {
                    System.out.println("Jugador 2 no puede defenderse este turno, debe atacar.");
                    opcion2 = 1;
                    cooldownDefensa2 = 0;
                } else {
                    System.out.println("Jugador 2 se defiende este turno.");
                    cooldownDefensa2 = 1;
                }
            }

            if (opcion1 != 2) cooldownDefensa1 = 0;
            if (opcion2 != 2) cooldownDefensa2 = 0;

            //los 2 jugadores se curan
            if (opcion1 == 3 && opcion2 == 3) {
                Random random = new Random();
                int cura1 = 10 + random.nextInt(21);
                int cura2 = 10 + random.nextInt(21);
                vida_personaje = vida_personaje + cura1;
                vida_personaje2 = vida_personaje2 + cura2;
                //comprobamos que no tenga mas vida de la introducida del jugador 1
                if (vida_personaje > vida_personaje_inicial) {
                    vida_personaje = vida_personaje_inicial;
                }
                //comprobamos que no tenga mas vida de la introducida del jugador 2
                if (vida_personaje2 > vida_personaje2_inicial) {
                    vida_personaje2 = vida_personaje2_inicial;
                }

                System.out.println("Jugador 1 se cura " + cura1 + " puntos.");
                System.out.println("Jugador 2 se cura " + cura2 + " puntos.");
            }

            // Jugador 1 se cura y Jugador 2 se defiende
            if (opcion1 == 3 && opcion2 == 2) {
                Random random = new Random();
                int cura = 10 + random.nextInt(21);
                vida_personaje = vida_personaje + cura;
                if (vida_personaje > vida_personaje_inicial) {
                    vida_personaje = vida_personaje_inicial;
                }
                System.out.println("Jugador 1 se cura " + cura + " puntos, mientras el Jugador 2 se defiende sin recibir daño.");
            }

            // Jugador 1 se defiende y Jugador 2 se cura
            if (opcion1 == 2 && opcion2 == 3) {
                Random random = new Random();
                int cura = 10 + random.nextInt(21);
                vida_personaje2 = vida_personaje2 + cura;
                if (vida_personaje2 > vida_personaje2_inicial) {
                    vida_personaje2 = vida_personaje2_inicial;
                }
                System.out.println("Jugador 2 se cura " + cura + " puntos, mientras el Jugador 1 se defiende sin recibir daño.");
            }

            // Jugador 1 se cura y Jugador 2 ataca
            if (opcion1 == 3 && opcion2 == 1) {
                Random random = new Random();
                int cura = 10 + random.nextInt(21);
                vida_personaje += cura;
                if (vida_personaje > vida_personaje_inicial) {
                    vida_personaje = vida_personaje_inicial;
                }
                System.out.println("Jugador 1 se cura " + cura + " puntos.");

                // Ahora recibe el ataque del Jugador 2
                ataque2 = ataque_personaje2 - defensa_personaje;
                if (ataque2 <= 0) ataque2 = 10;
                Random random_cura_ataque = new Random();
                int random2 = 1 + random_cura_ataque.nextInt(ataque2);
                vida_personaje = vida_personaje - random2;
                if (vida_personaje < 0) vida_personaje = 0;
                System.out.println("El jugador 2 ha infligido un total de " + random2 + " daño");
                if (vida_personaje == 0) {
                    System.out.println("***El Jugador 1 ya no tiene vida, el ganador es el Jugador 2***");
                }
            }
            // Jugador 1 ataca y Jugador 2 se cura
            if (opcion1 == 1 && opcion2 == 3) {
                Random random_cura_ataque2 = new Random();
                int cura = 10 + random_cura_ataque2.nextInt(21);
                vida_personaje2 += cura;
                if (vida_personaje2 > vida_personaje2_inicial) {
                    vida_personaje2 = vida_personaje2_inicial;
                }
                System.out.println("Jugador 2 se cura " + cura + " puntos.");

                // Ahora recibe el ataque del Jugador 1
                ataque1 = ataque_personaje - defensa_personaje2;
                if (ataque1 <= 0) ataque1 = 10;
                Random random1 = new Random();
                int random = 1 + random1.nextInt(ataque1);
                vida_personaje2 = vida_personaje2 - random;
                if (vida_personaje2 < 0) vida_personaje2 = 0;
                System.out.println("El jugador 1 ha infligido un total de " + random + " daño");
                if (vida_personaje2 == 0) {
                    System.out.println("***El jugador 2 ya no tiene vida, el ganador es el Jugador 1***");
                }
            }

            //ataque de los 2 jugadores
            if (opcion1 == 1 && opcion2 == 1) {
                //ataque jugador 1 (primero)
                if (velocidad_personaje > velocidad_personaje2) {
                    ataque1 = ataque_personaje - defensa_personaje2;
                    if (ataque1 <= 0) ataque1 = 10;
                    Random random1 = new Random();
                    int random = 1 + random1.nextInt(ataque1);
                    vida_personaje2 = vida_personaje2 - random;
                    if (vida_personaje2 < 0) vida_personaje2 = 0;
                    System.out.println("El jugador 1 ha infligido un total de " + random + " daño");
                    if (vida_personaje2 == 0) {
                        System.out.println("***El jugador 2 ya no tiene vida, el ganador es el Jugador 1***");
                    } else {
                        //ataque jugador 2 (segudno)
                        ataque2 = ataque_personaje2 - defensa_personaje;
                        if (ataque2 <= 0) ataque2 = 10;
                        int random2 = 1 + random1.nextInt(ataque2);
                        vida_personaje = vida_personaje - random2;
                        if (vida_personaje < 0) vida_personaje = 0;
                        System.out.println("El jugador 2 ha infligido un total de " + random2 + " daño");
                        if (vida_personaje == 0) {
                            System.out.println("***El Jugador 1 ya no tiene vida, el ganador es el Jugador 2***");
                        }
                    }
                } else {
                    // ataque jugador 2 (primero)
                    ataque2 = ataque_personaje2 - defensa_personaje;
                    if (ataque2 <= 0) ataque2 = 10;
                    Random random2 = new Random();
                    int random = 1 + random2.nextInt(ataque2);
                    vida_personaje = vida_personaje - random;
                    if (vida_personaje < 0) vida_personaje = 0;
                    System.out.println("El jugador 2 ha infligido un total de " + random + " daño");
                    if (vida_personaje == 0) {
                        System.out.println("***El Jugador 1 ya no tiene vida, el ganador es el Jugador 2***");
                    } else {
                        // ataquejugador 1 (segundo)
                        ataque1 = ataque_personaje - defensa_personaje2;
                        if (ataque1 <= 0) ataque1 = 10;
                        int random1 = 1 + random2.nextInt(ataque1);
                        vida_personaje2 = vida_personaje2 - random1;
                        if (vida_personaje2 < 0) vida_personaje2 = 0;
                        System.out.println("El jugador 1 ha infligido un total de " + random1 + " daño");
                        if (vida_personaje2 == 0) {
                            System.out.println("***El jugador 2 ya no tiene vida, el ganador es el Jugador 1***");
                        }
                    }
                }
            }
            ronda++;
        }
    }
}