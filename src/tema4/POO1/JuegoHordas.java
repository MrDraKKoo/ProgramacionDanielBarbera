package tema4.POO1;

import java.util.Random;
import java.util.Scanner;

public class JuegoHordas {
    public static void main(String[] args) {

    }
    public static void Horda (Hero hero1, Hero hero2, Hero hero3, Hero hero4) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int hordas = 0;
        while (hero1.health > 0) {
            int cantidad_orcos = random.nextInt(3) + 1;
            int maxDamageBot = Math.max(hero2.attack - hero1.defense, 10);
            int danioDelBot = random.nextInt(maxDamageBot) + 1;

            // Resestar la vida de los orcos para la soguiente oleada
            hero2.health = hero2.maxHealth;
            hero3.health = hero3.maxHealth;
            hero4.health = hero4.maxHealth;

            System.out.println("¡Alerta acaban de asaltarte " + cantidad_orcos + " orcos!");
            //bucle del ataque segun la cantidad de enemigos en campo
            while (cantidad_orcos >= 1 && hero2.health > 0 || cantidad_orcos >= 2 && hero3.health > 0 || cantidad_orcos >= 3 && hero4.health > 0) {

                //comprobar si alguno va a huir y si huye se le baja la vida a 0 para eliminarlo
                if (hero2.health > 0 && random.nextDouble() < 0.10) {
                    hero2.health = 0; System.out.println("¡" + hero2.name + " ha huido!");
                }
                if (cantidad_orcos >= 2 && hero3.health > 0 && random.nextDouble() < 0.10) {
                    hero3.health = 0; System.out.println("¡" + hero3.name + " ha huido!");
                }
                if (cantidad_orcos >= 3 && hero4.health > 0 && random.nextDouble() < 0.10) {
                    hero4.health = 0; System.out.println("¡" + hero4.name + " ha huido!");
                }

                //comprobar que queden enemigos para empezar el bucle del ataque o pasar directamente a la siguiente oleada
                boolean quedanEnemigos = (hero2.health > 0) || (cantidad_orcos >= 2 && hero3.health > 0) || (cantidad_orcos >= 3 && hero4.health > 0);

                if (!quedanEnemigos) {
                    System.out.println("¡Ya no quedan enemigos en esta horda!");
                    break;
                }

                if (cantidad_orcos == 1) {
                    //ataque directamenete porq solo hay 1
                    int danio = hero1.attack - hero2.defense;
                    int maxDamage = Math.max(hero1.attack - hero2.defense, 10);
                    int danioReal = random.nextInt(maxDamage) + 1;
                    hero2.health = hero2.health - danioReal;
                    System.out.println("Has hecho " + danioReal + " de daño a");
                    if (hero2.health > 0) {
                        hero1.health = hero1.health - danioDelBot;
                        System.out.println(hero2.name + " te quita " + danioDelBot + " HP");
                    }else {
                        cantidad_orcos = cantidad_orcos-1;
                    }
                    break;
                } else if (cantidad_orcos == 2) {
                    System.out.println("A quien quieres atacar?");
                    System.out.println("1- Ogro Grande");
                    System.out.println("2- Ogro mediano");
                    int opcion = in.nextInt();
                    switch (opcion) {
                        case 1:
                            //pegamos al orco grande primero
                            int danio = hero1.attack - hero2.defense;
                            int maxDamage = Math.max(hero1.attack - hero2.defense, 10);
                            int danioReal = random.nextInt(maxDamage) + 1;
                            if (hero2.health <= 0) {
                                System.out.println("El objetivo seleccionado ya etsa muerto");
                                System.out.println("Has atacado automaticamente al " + hero3.name);
                                hero3.health = hero3.health - danioReal;
                                System.out.println("Has hecho " + danioReal + " de daño " + hero3.name);
                            }else {
                                hero2.health = hero2.health - danioReal;
                                System.out.println("Has hecho " + danioReal + " de daño");
                            }

                            if (hero2.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero2.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            if (hero3.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero3.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            break;
                        case 2:
                            //pegamos al orco mediano primero
                            int danio2 = hero1.attack - hero3.defense;
                            int maxDamage2 = Math.max(hero1.attack - hero3.defense, 10);
                            int danioReal2 = random.nextInt(maxDamage2) + 1;
                            if (hero2.health <= 0) {
                                System.out.println("El objetivo seleccionado ya etsa muerto");
                                System.out.println("Has atacado automaticamente al " + hero2.name);
                                hero2.health = hero2.health - danioReal2;
                                System.out.println("Has hecho " + danioReal2 + " de daño " + hero2.name);
                            }else {
                                hero3.health = hero3.health - danioReal2;
                                System.out.println("Has hecho " + danioReal2 + " de daño");
                            }

                            if (hero2.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero2.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            if (hero3.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero3.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            break;
                    }
                } else if (cantidad_orcos == 3) {
                    System.out.println("A quien quieres atacar?");
                    System.out.println("1- Ogro Grande");
                    System.out.println("2- Ogro mediano");
                    System.out.println("3- Ogro Enano");
                    int opcion = in.nextInt();
                    switch (opcion) {
                        case 1:
                            //pegamos al orco grande primero
                            int danio = hero1.attack - hero2.defense;
                            int maxDamage = Math.max(hero1.attack - hero2.defense, 10);
                            int danioReal = random.nextInt(maxDamage) + 1;
                            if (hero2.health > 0) {
                                hero2.health =hero2.health - danioReal;
                                System.out.println("Has hecho " + danioReal + " de daño a " + hero2.name);
                            } else if (hero3.health > 0) {
                                System.out.println("El " + hero2.name + " ya ha caído. ¡Golpeas al " + hero3.name + "!");
                                hero3.health =hero3.health - danioReal;
                                System.out.println("Has hecho " + danioReal + " de daño a " + hero3.name);
                            } else if (hero4.health > 0) {
                                System.out.println("El " + hero4.name + " ya ha caído. ¡Golpeas al " + hero4.name + "!");
                                hero4.health =hero4.health - danioReal;
                                System.out.println("Has hecho " + danioReal + " de daño a " + hero4.name);
                            }

                            if (hero2.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero2.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            if (hero3.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero3.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            if (hero4.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero3.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            break;
                        case 2:
                            //pegamos al orco mediano primero
                            int danio2 = hero1.attack - hero3.defense;
                            int maxDamage2 = Math.max(hero1.attack - hero3.defense, 10);
                            int danioReal2 = random.nextInt(maxDamage2) + 1;

                            if (hero3.health > 0) {
                                hero3.health =hero3.health - danioReal2;
                                System.out.println("Has hecho " + danioReal2 + " de daño a " + hero3.name);
                            } else if (hero2.health > 0) {
                                System.out.println("El " + hero3.name + " ya no está. ¡Atacas al " + hero2.name + "!");
                                hero2.health =hero2.health - danioReal2;
                                System.out.println("Has hecho " + danioReal2 + " de daño a " + hero2.name);
                            } else if (hero4.health > 0) {
                                System.out.println("Solo queda el " + hero4.name + " en pie. ¡A por él!");
                                hero4.health =hero4.health - danioReal2;
                                System.out.println("Has hecho " + danioReal2 + " de daño a " + hero4.name);
                            }

                            if (hero2.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero2.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            if (hero3.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero3.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            if (hero4.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero4.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            break;
                        case 3:
                            //pegamos al orco enano primero
                            int danio3 = hero1.attack - hero4.defense;
                            int maxDamage3 = Math.max(hero1.attack - hero4.defense, 10);
                            int danioReal3 = random.nextInt(maxDamage3) + 1;

                            if (hero4.health > 0) {
                                hero4.health -= danioReal3;
                                System.out.println("Has hecho " + danioReal3 + " de daño a " + hero4.name);
                            } else if (hero3.health > 0) {
                                System.out.println("El objetivo ya estaba muerto. ¡Atacas al " + hero3.name + "!");
                                hero3.health =hero3.health - danioReal3;
                                System.out.println("Has hecho " + danioReal3 + " de daño a " + hero3.name);
                            } else if (hero2.health > 0) {
                                System.out.println("Los otros han caído. ¡Vas a por el " + hero2.name + "!");
                                hero2.health =hero2.health - danioReal3;
                                System.out.println("Has hecho " + danioReal3 + " de daño a " + hero2.name);
                            }


                            if (hero2.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero2.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            if (hero3.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero3.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            if (hero4.health > 0) {
                                hero1.health = hero1.health - danioDelBot;
                                System.out.println(hero4.name + " te quita " + danioDelBot + " HP");
                            }else {
                                cantidad_orcos = cantidad_orcos-1;
                            }
                            break;
                    }
                }
            }
            //cuando acaba la pelea comprobar si sigue vivo si es que si luego comprobamos las probabilidades de pocion y descanso si es que no decimos las hordas aguantadas
            if (hero1.health > 0) {
                hordas++;
                System.out.println("Llevas "+hordas+" superadas");

                if (random.nextDouble() < 0.10) {
                    hero1.drinkPotion();
                    System.out.println("¡Que suerte, has encotrado una pocion!");
                }
                if (random.nextDouble() < 0.001) {
                    hero1.rest();
                    System.out.println("¡Lograste un descanso épico!");
                }
            }else{
                System.out.println("¡Has muerto!");
            }
        }
        System.out.println("Hordas sobrevividas: " + hordas);
    }
}