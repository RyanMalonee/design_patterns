package strategy;

/**
 * Interface for the defense behavior of a player in the football game.
 *
 * @author Ryan Malone
 */
public interface DefenseBehavior {
  /**
   * Interface for the play functions of the defense behaviors
   * (to be utilized by the classes that implement this interface).
   *
   * @return a string with the defense play behavior description
   */
  public String play();
}
