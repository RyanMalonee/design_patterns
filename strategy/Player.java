package strategy;

public class Player {
    private String firstName;
    private String lastName;
    private boolean offense;
    protected DefenseBehavior defenseBehavior;
    protected OffenseBehavior offenseBehavior;

    public Player(String firstName, String lastName, boolean offense) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.offense = offense;
    }

    public void setDefenseBehavior() {
        this.defenseBehavior = defenseBehavior;
    }

    public void setOffenseBehavior() {
        this.offenseBehavior = offenseBehavior;
    }

    public String play() {
        // Check this...not confident
        this.setDefenseBehavior();
        this.setOffenseBehavior();
        if (this.offense) {
            return this.offenseBehavior.play();
        } else if (this.defenseBehavior != null) {
            return this.defenseBehavior.play();
        } else {
            return "not playing";
        }
    }

    public void turnover() {
        this.offense = !this.offense;
        if(this.offense) {
            this.setOffenseBehavior();
        } else {
            this.setDefenseBehavior();
        }
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
