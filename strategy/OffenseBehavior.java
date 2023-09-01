package strategy;

/**
* Interface for the offense behavior of a player in the football game.
*
* @author Ryan Malone
*/
public interface OffenseBehavior {
  /**
  * Interface for the play functions of the offense behaviors
  * (to be utilized by the classes that implement this interface).
  *
  * @return a string with the offense play behavior description
  */
  public String play();
}
