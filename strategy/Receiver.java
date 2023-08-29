package strategy;

public class Receiver extends Player{
    public Receiver(String firstName, String lastName, boolean offense) {
        super(firstName, lastName, offense);
        setOffenseBehavior();
    }

    public void setOffenseBehavior() {
       offenseBehavior = new ReceiveBehavior();
    }

    public void setDefenseBehavior() {
        
    }
}
