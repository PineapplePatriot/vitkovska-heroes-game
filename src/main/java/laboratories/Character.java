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

    public int getHp() {
        return hp;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("%s{hp=%d, power=%d}", this.getClass().getSimpleName(), this.getHp(), this.getPower());
    }

    public abstract void kick(Character c);  //Для підкласів
}

