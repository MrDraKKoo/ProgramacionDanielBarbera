package tema4;

public class Hero {
    String name;
    int level;
    int health;
    int maxHealth;
    int experience;
    int attack;
    int defense;

    public Hero () {
        this.name = "Dani";
        this.level = 100;
        this.health = 75;
        this.maxHealth = 100;
        this.experience = 75000;
        this.attack = 30;
        this.defense = 40;
    }
    public Hero (String name, int level, int health, int maxHealth, int experience, int attack, int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }
    public int drinkPotion(){
        return (this.health + 10);
    }
    public int rest (){
        return (this.health + 50);
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
        this.level = level;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
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
    public String toString (){
        return "Información del Hero:"+"\n"+"Nombre: "+name+"\n"+"Nivel: "+level+"\n"+"Vida actual: "+health+"\n"+"Vida maxima: "+maxHealth+"\n"+"Experiencia: "+experience+"\n"+"Ataque: "+attack+"\n"+"Defensa:"+defense;
    }
}
