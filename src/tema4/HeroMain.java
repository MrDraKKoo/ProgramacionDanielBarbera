package tema4;

import java.util.Scanner;


public class HeroMain {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Hero hero1 = new Hero();
        System.out.println("Introduce tu nombre");
        hero1.setName(in.nextLine());
        System.out.println("Introduce tu nivel");
        hero1.setLevel(in.nextInt());
        System.out.println("Introduce tu vida maxima");
        hero1.setMaxHealth(in.nextInt());
        hero1.setHealth(hero1.maxHealth);
        System.out.println("Introduce tu experience");
        hero1.setExperience(in.nextInt());
        System.out.println("Introduce tu ataque");
        hero1.setAttack(in.nextInt());
        System.out.println("Introduce tu defensa");
        hero1.setDefense(in.nextInt());

        System.out.println(hero1);

        Hero hero2 = new Hero();
        System.out.println("Introduce tu nombre");
        in.nextLine();
        hero2.setName(in.nextLine());
        System.out.println("Introduce tu nivel");
        hero2.setLevel(in.nextInt());
        System.out.println("Introduce tu vida maxima");
        hero2.setMaxHealth(in.nextInt());
        hero2.setHealth(hero2.maxHealth);
        System.out.println("Introduce tu experience");
        hero2.setExperience(in.nextInt());
        System.out.println("Introduce tu ataque");
        hero2.setAttack(in.nextInt());
        System.out.println("Introduce tu defensa");
        hero2.setDefense(in.nextInt());

        System.out.println(hero2);
        Hero.attack(hero1,hero2);
    }
}
