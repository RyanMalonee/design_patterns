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

    /*
     * TODO CHECK THIS and maybe comment out the old code...
     * if I am looking at this correctly it means that if for 
     * some reason there was a player object (that wasn't a quarterback,
     * lineman, or a receiver) that was created, it could have ANY of the
     * Defense or offense behaviors.
     */
    public void setDefenseBehavior() {
        this.defenseBehavior = defenseBehavior;
    }

    public void setOffenseBehavior() {
        this.offenseBehavior = offenseBehavior;
    }

    public String play() {
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
