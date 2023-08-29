package strategy;
// check to make sure we can do this...
import java.util.Random;

public class QuarterBack extends Player {
    public QuarterBack(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        this.setOffenseBehavior();
    }

    public void setOffenseBehavior() {
        Random random = new Random();
        if (random.nextBoolean()) {
            offenseBehavior = new RunBehavior();
        } else {
            offenseBehavior = new PassBehavior();
        }
    }

    public void setDefenseBehavior() {
        
    }
}
