package observer;

/**
* Utilizes observer interface to manage observers and display the golfer's score
* for the entire game.
*
* @author Ryan Malone
*/
public class RoundScoreDisplay implements Observer {
  private Subject golfer;
  private int strokesTotal;
  private int parTotal;
  
  /** Initializes the RoundScoreDisplay observer and registers them
  * them to a specific golfer.
  *
  * @param golfer the golfer to register the observer to
  */
  public RoundScoreDisplay(Subject golfer) {
    this.golfer = golfer;
    golfer.registerObserver(this);
  }
  
  /**
  * Updates the observer with/keeps track of strokes and par of the whole game
  * by adding the golfer's current hole stats to his total stats.
  *
  * @param strokesTotal the number of strokes the golfer took on the current hole
  * @param parTotal the par of the hole the golfer is on
  */
  public void update(int strokesTotal, int parTotal) {
    this.strokesTotal += strokesTotal;
    this.parTotal += parTotal;
  }
  
  /**
  * Returns a string representation of how the golfer is doing (strokes compared to par)
  * for the entire game.
  *
  * @return a string with the golfers score for the entire game
  */
  public String toString() {
    if (strokesTotal < parTotal) {
      return "Overall stats: Par (" + parTotal + ") Strokes (" + strokesTotal + "), "
        + (parTotal - strokesTotal) + " under par";
    } else if (strokesTotal == parTotal) {
      return "Overall stats: Par (" + parTotal + ") Strokes (" + strokesTotal + "), Making par";
    } else {
      return "Overall stats: Par (" + parTotal + ") Strokes (" + strokesTotal + "), "
        + (strokesTotal - parTotal) + " over par";
    }
  }
}
