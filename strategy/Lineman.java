package strategy;
// check to make sure we can do this...
import java.util.Random;

public class Lineman extends Player {
    public Lineman(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        setDefenseBehavior();
        setOffenseBehavior();
    }

    public void setDefenseBehavior() {
        Random random = new Random();
        int behavior = random.nextInt(1,3);
        if (behavior == 1) {
            defenseBehavior = new BlockBehavior();
        } else if (behavior == 2) {
            defenseBehavior = new StripBehavior();
        } else {
            defenseBehavior = new SackBehavior();
        }
    }

    public void setOffenseBehavior() {
        offenseBehavior = new OBlockBehavior();
    }
}
