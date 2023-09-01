package strategy;

import java.util.Random;

/**
* Implements the OffenseBehavior interface by creating the RunBehavior.
*
* @author Ryan Malone
*/
public class RunBehavior implements OffenseBehavior {
  /**
  * When the RunBehavior is played, it returns a string with the run play
  * (either runs a drive, draw, pitch, or reverse).
  *
  * @return a string describing the run play
  */
  public String play() {
    Random random = new Random();
    int play = random.nextInt(4);
    if (play == 0) {
      return "runs a drive (up the gut)";
    } else if (play == 1) {
      return "runs a draw";
    } else if (play == 2) {
      return "runs a pitch";
    } else {
      return "runs a reverse";
    }
  }
}
