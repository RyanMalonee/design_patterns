package strategy;

/**
* A Receiver player in the football game.
*
* @author Ryan Malone
*/
public class Receiver extends Player {
  /**
  * Creates a Receiver player with a specified first name, last name, and a boolean
  * showing if they are on offense (true) or defense (false).

  * @param firstName first name of Receiver
  * @param lastName last name of Receiver
  * @param offense true if the Receiver is on offense, false if on defense
  */
  public Receiver(String firstName, String lastName, boolean offense) {
    super(firstName, lastName, offense);
    this.setOffenseBehavior();
    this.setDefenseBehavior();
  }
  
  /**
   * Sets the offense behavior of the Receiver to a ReceiveBehavior.
   */
  public void setOffenseBehavior() {
    this.offenseBehavior = new ReceiveBehavior();
  }
  
  /**
   * Sets the defense behavior of the Receiver (to null since they
   * only play on offense).
   */
  public void setDefenseBehavior() {
    this.defenseBehavior = null;
  }
}
