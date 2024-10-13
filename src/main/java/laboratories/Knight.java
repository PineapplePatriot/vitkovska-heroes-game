package laboratories;
import java.util.Random;


public class Knight extends King {
    private static final Random random = new Random();

    public Knight() {
        super(); // Схожий з королем
        this.hp = random.nextInt(11) + 2;
        this.power = random.nextInt(11) + 2;
    }

    @Override
    public void kick(Character c) {
        super.kick(c);
    }
}
