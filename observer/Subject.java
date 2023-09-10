package observer;

/**
 * Creates the Subject interface that all subjects (golfers) will implement.
 *
 * @author Ryan Malone
 */
public interface Subject {
  /**
   * Registers an observer to the subject.
   *
   * @param observer the observer to register to the subject
   */
  public void registerObserver(Observer observer);

  /**
   * Removes an observer from the subject that it was registered to.
   *
   * @param observer the observer to remove from the subject's observers arraylist
   */
  public void removeObserver(Observer observer);

  /**
   * Notifies all observers of the subject of the subject's score.
   *
   * @param strokes the number of strokes the subject took
   * @param par the par of the hole the subject is on
   */
  public void notifyObservers(int strokes, int par);
}
