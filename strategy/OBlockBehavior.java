package strategy;

/**
 * Implements the OffenseBehavior interface and creates the OBlockBehavior
 * used by Lineman on offense.
 *
 * @author Ryan Malone
 */
public class OBlockBehavior implements OffenseBehavior {
  /**
   * When the OBlockBehavior is played, it returns a string with the OBlock play.
   *
   * @return a string showing that the Lineman is blocking the defenders (OBlock play)
   */
  public String play() {
    return "Block Defenders";
  }
}
