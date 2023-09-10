package observer;

import java.util.ArrayList;

/**
 * Creates a Golfer subjects (implements the subject class).
 *
 * @author Ryan Malone
 */
public class Golfer implements Subject {
  private ArrayList<Observer> observers;
  private String name;

  /** 
   * Initializes a Golfer object with the given name.
   *
   * @param name the name of the golfer
   */
  public Golfer(String name) {
    this.name = name;
    observers = new ArrayList<Observer>();
  }

  /**
   * Registers an observer to the golfer.
   *
   * @param observer the observer to register to the golfer
   */
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  /**
   * Removes an observer from the golfer that it was registered to.
   *
   * @param observer the observer to remove from the golfer's observers arraylist
   */
  public void removeObserver(Observer observer) {
    for (int i = 0; i < observers.size(); i++) {
      if (observers.get(i).equals(observer)) {
        observers.remove(i);
        break;
      }
    }
  }

  /**
   * Notifies all observers of the golfer's score.
   *
   * @param strokes the number of strokes the golfer took
   * @param par the par of the hole
   */
  public void notifyObservers(int strokes, int par) {
    for (int i = 0; i < observers.size(); i++) {
      observers.get(i).update(strokes, par);
    }
  }

  /**
   * Adds to the score of the golfer via the notifyObservers method.
   *
   * @param strokes the number of strokes the golfer took
   * @param par the par of the hole the golfer is on
   */
  public void enterScore(int strokes, int par) {
    notifyObservers(strokes, par);
  }

  /**
   * Gets the name of the golfer.
   *
   * @return the name of the golfer
   */
  public String getName() {
    return name;
  }
}
