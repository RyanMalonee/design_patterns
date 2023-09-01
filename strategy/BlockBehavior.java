package strategy;

import java.util.Random;

/**
 * Implements the DefenseBehavior interface by creating the BlockBehavior.
 *
 * @author Ryan Malone
 */
public class BlockBehavior implements DefenseBehavior {
  /**
   * When the BlockBehavior is played, it returns a string with the play
   * that was randomly chosen (either block a kick, punt, pass, or catch).
   *
   * @return a string with the randomly chosen BlockBehavior play
   */
  public String play() {
    Random random = new Random();
    int play = random.nextInt(4);
    if (play == 0) {
      return "block a kick";
    } else if (play == 1) {
      return "block a punt";
    } else if (play == 2) {
      return "block a pass";
    } else {
      return "block a catch";
    }
  }
}
