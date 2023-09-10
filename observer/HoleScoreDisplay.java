package observer;

/**
* Utilizes observer interface to manage observers and display the golfer's score
* for the current hole.
*
* @author Ryan Malone
*/
public class HoleScoreDisplay implements Observer {
  private Subject golfer;
  private int strokes;
  private int par;
  
  /**
  * Initializes the HoleScoreDisplay observer and registers them
  * them to a specific golfer.
  *
  * @param golfer the golfer to register the observer to
  */
  public HoleScoreDisplay(Subject golfer) {
    this.golfer = golfer;
    golfer.registerObserver(this);
  }
  
  /**
  * Updates the observer with/keeps track of strokes and par of the current hole.
  *
  * @param strokes the number of strokes the golfer took on the current hole
  * @param par the par of the hole the golfer is on
  */
  public void update(int strokes, int par) {
    this.strokes = strokes;
    this.par = par;
  }
  
  /**
  * Returns a string representation of how the golfer is doing (strokes compared to par)
  * for the current hole.
  *
  * @return a string with the golfers score for the current hole (strokes compared to par) 
  */
  public String toString() {
    if (strokes < par) {
      return "Current Hole stats: Par (" + par + ") Strokes (" + strokes + "), "
        + (par - strokes) + " under par";
    } else if (strokes == par) {
      return "Current Hole stats: Par (" + par + ") Strokes (" + strokes + "), Making par";
    } else {
      return "Current Hole stats: Par (" + par + ") Strokes (" + strokes + "), "
        + (strokes - par) + " over par";
    }
  }
}
