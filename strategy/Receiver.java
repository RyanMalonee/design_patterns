package strategy;

/**
 * A Receiver player in the football game
 * @author Ryan Malone
 */
public class Receiver extends Player{
    /**
     * Creates a Receiver player with a specified first name, last name, and a boolean
     * showing if they are on offense (true) or defense (false)
     * @param firstName
     * @param lastName
     * @param offense
     */
    public Receiver(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        this.setOffenseBehavior();
        this.setDefenseBehavior();
    }

    public void setOffenseBehavior() {
       this.offenseBehavior = new ReceiveBehavior();
    }

    public void setDefenseBehavior() {
        this.defenseBehavior = null;
    }
}
