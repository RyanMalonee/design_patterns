package strategy;

/**
 * An abstract class to set up a player in the Football game.
 *
 * @author Ryan Malone
 */
public abstract class Player {
  private String firstName;
  private String lastName;
  private boolean offense;
  protected DefenseBehavior defenseBehavior;
  protected OffenseBehavior offenseBehavior;

  /**
   * Creates a player with a specified first name, last name, 
   * and whether or not they are on offense (vs defense).
   *
   * @param firstName the first name of the player
   * @param lastName the last name of the player
   * @param offense true if the player is on offense, false if on defense
   */
  public Player(String firstName, String lastName, boolean offense) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.offense = offense;
  }

  /**
  * Abstract method to set the defense behavior of the player
  * (used in the child classes).
  */
  public abstract void setDefenseBehavior();

  /**
     * Abstract method to set the offense behavior of the player
     * (used in the child classes).
  */
  public abstract void setOffenseBehavior();

  /**
   * Gets a string representation of the player's behavior
   * (whether it be offense or defense).
   *
   * @return A string with the behavior that was enacted by the player
   */
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

  /**
   * Changes the player's behavior from offense to defense (or vice versa).
   */
  public void turnover() {
    this.offense = !this.offense;
    if (this.offense) {
      this.setOffenseBehavior();
    } else {
      this.setDefenseBehavior();
    }
  }

  /**
   * Creates a string representation of the player's first name and last name
   * (with a space in between).
   *
   * @return A string with the player's first name and last name
   */
  public String toString() {
    return this.firstName + " " + this.lastName;
  }
}
