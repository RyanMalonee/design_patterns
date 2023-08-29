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

    }

    public void setOffenseBehavior() {

    }

    public String play() {

    }

    public void turnover() {

    }

    public String toString() {
        
    }
}
