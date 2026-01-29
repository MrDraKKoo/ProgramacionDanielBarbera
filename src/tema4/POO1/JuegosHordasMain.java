package tema4.POO1;

import java.util.Scanner;

public class JuegosHordasMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hero hero1 = new Hero();
        System.out.println("Introduce tu nombre");
        hero1.setName(in.nextLine());
        System.out.println("Introduce tu nivel");
        hero1.setLevel(in.nextInt());
        System.out.println("Introduce tu vida maxima");
        hero1.setMaxHealth(in.nextInt());
        hero1.setHealth(hero1.maxHealth);
        System.out.println("Introduce tu ataque");
        hero1.setAttack(in.nextInt());
        System.out.println("Introduce tu defensa");
        hero1.setDefense(in.nextInt());
        System.out.println("\n" + hero1);

        Hero hero2 = new Hero();
        hero2.setName("Ogro Gigante");
        hero2.setLevel(hero1.level - 5);
        hero2.setMaxHealth(hero1.maxHealth - 5);
        hero2.setHealth(hero2.maxHealth);
        hero2.setAttack(hero1.attack - 5);
        hero2.setDefense(hero1.defense - 5);

        Hero hero3 = new Hero();
        hero3.setName("Ogro Mediano");
        hero3.setLevel(hero1.level - 5);
        hero3.setMaxHealth(hero1.maxHealth - 5);
        hero3.setHealth(hero3.maxHealth);
        hero3.setAttack(hero1.attack - 5);
        hero3.setDefense(hero1.defense - 5);

        Hero hero4 = new Hero();
        hero4.setName("Ogro Enano");
        hero4.setLevel(hero1.level - 5);
        hero4.setMaxHealth(hero1.maxHealth - 5);
        hero4.setHealth(hero4.maxHealth);
        hero4.setAttack(hero1.attack - 5);
        hero4.setDefense(hero1.defense - 5);

        JuegoHordas.horda(hero1, hero2, hero3, hero4);
    }
}