package strategy;

import java.util.Random;

/**
 * A Quarterback player in the football game
 * @author Ryan Malone
 */
public class QuarterBack extends Player {
    /**
     * Creates a QuarterBack player with a specified first name, last name, and a boolean
     * showing if they are on offense (true) or defense (false)
     * @param firstName
     * @param lastName
     * @param offense
     */
    public QuarterBack(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        this.setDefenseBehavior();
        this.setOffenseBehavior();
    }

    /**
     * Sets the offense behavior of the quarterback to either
     * a run behavior or a pass behavior (chosen randomly)
     */
    public void setOffenseBehavior() {
        Random random = new Random();
        if (random.nextBoolean()) {
            this.offenseBehavior = new RunBehavior();
        } else {
            this.offenseBehavior = new PassBehavior();
        }
    }

    /**
     * Sets the defense behavior of the quarterback to null
     * (since the quarterback only play on offense)
     */
    public void setDefenseBehavior() {
        this.defenseBehavior = null;
    }
}
