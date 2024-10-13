package laboratories;

import java.util.Random;
import java.lang.reflect.Constructor;

public class CharacterFactory {

    private static final String[] characterClasses = {"Hobbit", "Elf", "King", "Knight"};
    private static final Random random = new Random();

    public static Character createCharacter() {
        String className = characterClasses[random.nextInt(characterClasses.length)];
        try {
            Class<?> characterClass = Class.forName(className);
            Constructor<?> constructor = characterClass.getConstructor();
            return (Character) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Character creation failed.");
        }
    }
}
