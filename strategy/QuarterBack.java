package strategy;

import java.util.Random;

public class QuarterBack extends Player {
    public QuarterBack(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        if(offense) {
            this.setOffenseBehavior();
        } else {
            this.setDefenseBehavior();
        }
    }

    public void setOffenseBehavior() {
        Random random = new Random();
        if (random.nextBoolean()) {
            this.offenseBehavior = new RunBehavior();
        } else {
            this.offenseBehavior = new PassBehavior();
        }
    }

    public void setDefenseBehavior() {
        this.defenseBehavior = null;
    }
}
