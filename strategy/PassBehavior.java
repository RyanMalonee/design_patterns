package strategy;

import java.util.Random;

/**
* Implements the OffenseBehavior interface by creating the PassBehavior.
*
* @author Ryan Malone
*/
public class PassBehavior implements OffenseBehavior {
  /**
  * When the OffenseBehavior is played, it will randomly choose a pass play
  * (either throws a slant route, out route, seem route, screen pass, or hail mary)
  * and returns it in a string format.
  *
  * @return a string with the randomly chosen pass play
  */
  public String play() {
    Random random = new Random();
    int play = random.nextInt(5);
    if (play == 0) {
      return "throws a slant route";
    } else if (play == 1) {
      return "throws a out route";
    } else if (play == 2) {
      return "throws a seem route";
    } else if (play == 3) {
      return "throws a screen pass";
    } else {
      return "throws a hail mary";
    }
  }
}
