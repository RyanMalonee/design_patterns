package iterator;

import java.util.Stack;

/**
 * A class that creates a StackIterator object that is used to iterate
 * through the items in a Stack object.
 *
 * @author Ryan Malone
 */
public class StackIterator implements java.util.Iterator {
  private Stack<String> items;
  private int position;

  /**
   * Creates a StackIterator object that is used to iterate
   * through the items in a Stack object.
   *
   * @param items a Stack of Strings that will be iterated through.
   */
  public StackIterator(Stack<String> items) {
    this.items = items;
    this.position = 0;
  }

  /**
   * Returns the next item in the Stack
   * (uses the get method from iterator parent class Vector).
   *
   * @return the next item in the Stack.
   */
  public String next() {
    return items.get(position++);
  }

  /**
   * Checks to see if there are any more items in the Stack
   * by checking if the index position is less than the size
   * of the items stack and if the item at that index is not null
   * (This method uses the get method found in the java documentation
   * for the iterator's parent class, java.util.Vector).
   *
   * @return a boolean that is true if there are more items in the Stack
   *         and false if there are no more items in the Stack.
   */
  public boolean hasNext() {
    return !(position >= items.size() || items.get(position) == null);
  }
}
