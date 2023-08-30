package strategy;

import java.util.Random;

public class Lineman extends Player {
    public Lineman(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        this.setDefenseBehavior();
        this.setOffenseBehavior();
    }

    public void setDefenseBehavior() {
        Random random = new Random();
        int behavior = random.nextInt(3);
        if (behavior == 0) {
            this.defenseBehavior = new BlockBehavior();
        } else if (behavior == 1) {
            this.defenseBehavior = new StripBehavior();
        } else {
            this.defenseBehavior = new SackBehavior();
        }
    }

    public void setOffenseBehavior() {
        this.offenseBehavior = new OBlockBehavior();
    }
}
