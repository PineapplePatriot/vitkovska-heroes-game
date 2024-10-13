package laboratories;

public class Elf extends Character {

    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character c) {
        if (c.power < this.power) {
            c.setHp(0); //Виживає сильніший
            System.out.println("Elf killed the enemy.");
        } else {
            this.power -= 1; //А інші втрачають силу...
            System.out.println("Elf's power decreased by 1.");
        }
    }
}

