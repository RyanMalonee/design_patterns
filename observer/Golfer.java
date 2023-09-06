package observer;

import java.util.ArrayList;

public class Golfer implements Subject {
  private ArrayList observers;
  private String name;

  public Golfer(String name) {
    this.name = name;
    observers = new ArrayList();
  }
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    for (int i = 0; i < observers.size(); i++) {
      if (observers.get(i).equals(observer)) {
        observers.remove(i);
        break;
      }
    }
  }

  public void notifyObservers(int strokes, int par) {
    for(int i = 0; i < observers.size(); i++) {
      observers.get(i).update(strokes, par)
    }
  }

  public void enterScore(int strokes, int par) {

  }

  public String getName() {
    return name;
  }
}
