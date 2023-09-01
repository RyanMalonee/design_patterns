package strategy;

/**
* Implements the DefenseBehavior interface by creating the SackBehavior.
*
* @author Ryan Malone
*/
public class SackBehavior implements DefenseBehavior {
  /**
   * When the SackBehavior is played, it returns a string with the sack play.
   *
   * @return a string describing the sack play
   */
  public String play() {
    return "Sack the quarterback";
  }
}
