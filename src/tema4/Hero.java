package tema4;

import java.util.Random;
import java.util.Scanner;

public class Hero {
    String name;
    int level;
    int health;
    int maxHealth;
    int experience;
    int attack;
    int defense;

    public Hero() {
        this.name = "Dani";
        this.level = 100;
        this.health = 75;
        this.maxHealth = 100;
        this.experience = 10;
        this.attack = 30;
        this.defense = 40;
    }

    public Hero(String name, int level, int health, int maxHealth, int experience, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level >= 0) {
            this.level = level;
        } else {
            System.out.println("Error: El nivel no puede ser negativo.");
        }
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        }
        // Si la salud que llega supera el máximo, la frenamos en el tope
        else if (health > this.maxHealth) {
            this.health = this.maxHealth;
        }
        // Si es un valor normal, se asigna tal cual
        else {
            this.health = health;
        }
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int drinkPotion() {
        this.health = this.health + 10;
        if (this.health >= this.maxHealth) {
            return this.health = this.maxHealth;
        } else {
            return this.health;
        }
    }

    public int rest() {
        this.health = this.health + 50;
        if (this.health >= this.maxHealth) {
            return this.health = this.maxHealth;
        } else {
            return this.health;
        }
    }

    public void levelUp() {
        System.out.println("Hero Level Up" + "\n" + "+5 puntos de Vida" + "+1 punto de ataque" + "\n" + "1 punto de defensa");
        this.maxHealth = this.maxHealth + 5;
        this.attack = this.attack + 1;
        this.defense = this.defense + 1;
    }

    public String toString() {
        return "***Información del Hero***" + "\n" +
                "Nombre: " + name + "\n" +
                "Nivel: " + level + "\n" +
                "Vida maxima: " + maxHealth + "\n" +
                "Vida actual: " + health + "\n" +
                "Experiencia: " + experience + "\n" +
                "Ataque: " + attack + "\n" +
                "Defensa: " + defense;
    }
    public static void attack(Hero hero1, Hero hero2) {
        Scanner in = new Scanner(System.in);
        System.out.println("\n" + "**Empieza el combate**" + "\n");
        while (hero2.health > 0 && hero1.health > 0) {
            Random random = new Random();
            final int lvl_para_lvlup = 50;
            final int xp_por_attack = 10;
            final int maxDamageBot = Math.max(hero2.attack - hero1.defense, 10);
            final int danioDelBot = random.nextInt(maxDamageBot) + 1;
            System.out.println(hero1.name + ": " + hero1.health + " HP | " + hero2.name + ": " + hero2.health + " HP" + "\n" +
                    "Que quieres hacer ahora mismo" + "\n" +
                    "a) Atacar" + "\n" +
                    "b) Curarte 10" + "\n" +
                    "c) Curarte 50 pero descansas 1 turno");
            char opcion = in.next().charAt(0);
            switch (opcion) {
                case 'a':
                    int danio = hero1.attack - hero2.defense;
                    int maxDamage = Math.max(hero1.attack - hero2.defense, 10);
                    int danioReal = random.nextInt(maxDamage) + 1;
                    hero2.health = hero2.health - danioReal;
                    System.out.println("Has hecho " + danioReal + " de daño");

                    hero1.experience = hero1.experience + xp_por_attack;
                    if (hero1.experience >= lvl_para_lvlup) {
                        hero1.levelUp();
                        hero1.experience = 0;
                    }

                    if (hero2.health > 0) {
                        hero1.health = hero1.health - danioDelBot;
                        System.out.println(hero2.name + " te quita " + danioDelBot + " HP");
                    }
                    break;

                case 'b':
                    hero1.drinkPotion();
                    if (hero2.health > 0) {
                        hero1.health = hero1.health - danioDelBot;
                        System.out.println("Te curas poco, pero " + hero2.name + " aprovecha y te quita " + danioDelBot + " HP");
                    }
                    break;
                case 'c':
                    hero1.rest();
                    if (hero2.health > 0) {
                        hero1.health = hero1.health - danioDelBot;
                        System.out.println("Descansas y te curas mucho, pero " + hero2.name + "  aprovecha y te quita " + danioDelBot + " HP");
                    }
                    break;
            }
        }
        if (hero1.health <= 0) System.out.println("\n¡Has perdido!");
        else System.out.println("\n¡Victoria!");
    }
}
