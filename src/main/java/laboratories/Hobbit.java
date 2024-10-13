package laboratories;

public class Hobbit extends Character {

    public Hobbit() {
        super(0, 3);
    }

    @Override
    public void kick(Character c) {
        toCry(); //Хоббіти битися не можуть :(
    }

    public void toCry() {
        System.out.println("Hobbit is crying...");
    }
}
