package observer;

/**
 * Creates an Observer interface that will be used for the classes that manage observers.
 *
 * @author Ryan Malone
 */
public interface Observer {
  /**
   * Updates the observer with the given strokes and par.
   *
   * @param strokes the number of strokes the golfer took
   * @param par the par of the hole
   */
  public void update(int strokes, int par);

  /**
   * Returns a string representation of how the golfer is doing (strokes compared to par).
   *
   * @return a string with the golfers score
   */
  public String toString();
}
