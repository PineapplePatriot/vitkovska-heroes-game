package laboratories;

public abstract class Character {
    protected int power;
    protected int hp;

    public Character(int power, int hp) {
        this.power = power;
        this.hp = hp;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0); //Сеттер для ненульового хп
    }

    public abstract void kick(Character c);  //Для підкласів
}

