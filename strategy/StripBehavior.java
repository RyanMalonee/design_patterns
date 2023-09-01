package strategy;

/**
* Implements the DefenseBehavior interface by creating the StripBehavior.
*
* @author Ryan Malone
*/
public class StripBehavior implements DefenseBehavior {
  /**
  * When the StripBehavior is played, it returns a string with the strip play.
  *
  * @return a string describing the strip play
  */
  public String play() {
    return "Strip a ball from runners hands";
  }
}
