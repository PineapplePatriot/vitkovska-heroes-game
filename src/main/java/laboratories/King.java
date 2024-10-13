package laboratories;
import java.util.Random;

public class King extends Character {

    private static final Random random = new Random();

    public King() {
        super(random.nextInt(11) + 5, random.nextInt(11) + 5); //від 5 до 15
    }

    @Override
    public void kick(Character c) {
        int damage = random.nextInt(this.power + 1);
        c.setHp(c.hp - damage); // число хп, що знімається теж рандомне
        System.out.println("King dealt " + damage + " damage to the enemy.");
    }
}

