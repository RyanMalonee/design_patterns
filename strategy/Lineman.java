package strategy;

import java.util.Random;

/**
 * A Lineman player in the football game.
 *
 * @author Ryan Malone
 */
public class Lineman extends Player {
  /**
   * Creates a Lineman player with a specified first name, last name, and a boolean
   * showing if they are on offense (true) or defense (false).
   *
   * @param firstName first name of the Lineman
   * @param lastName last name of the Lineman
   * @param offense true if the Lineman is on offense, false if on defense
   */
  public Lineman(String firstName, String lastName, boolean offense) {
    super(firstName, lastName, offense);
    this.setDefenseBehavior();
    this.setOffenseBehavior();
  }

  /**
   * Sets the defense behavior of the Lineman (choose randomly
   * between block, strip, or sack behaviors).
   */
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

  /**
   * Sets the offense behavior of the Lineman to block.
   */
  public void setOffenseBehavior() {
    this.offenseBehavior = new OBlockBehavior();
  }
}
