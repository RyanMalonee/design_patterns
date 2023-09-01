package strategy;

import java.util.Random;

/**
* Implements the OffenseBehavior interface by creating the ReceiveBehavior.
*
* @author Ryan Malone
*/
public class ReceiveBehavior implements OffenseBehavior {
  /**
  * When the ReceiveBehavior is played, it will randomly choose a receive play
  * (either runs a slant route, out route, seem route, screen pass, or hail mary)
  * and returns it in a string format.
  *
  * @return a string with the randomly chosen receive play
  */
  public String play() {
    Random random = new Random();
    int play = random.nextInt(5);
    if (play == 0) {
      return "runs a slant route";
    } else if (play == 1) {
      return "runs a out route";
    } else if (play == 2) {
      return "runs a seem route";
    } else if (play == 3) {
      return "runs a screen pass";
    } else {
      return "runs a hail mary";
    }
  }
}
