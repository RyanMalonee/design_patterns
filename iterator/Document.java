package iterator;

import java.util.Stack;

/**
 * A class that creates a document object and
 * manages its changes, undoing, and redoing actions.
 *
 * @author Ryan Malone
 */
public class Document {
  private String title;
  private Stack<String> undoStack;
  private Stack<String> redoStack;
  
  /**
   * Creates (initializes) a document with the title provided
   * and initializes the undo and redo stacks.
   *
   * @param title the title of the document.
   */
  public Document(String title) {
    this.title = title;
    this.undoStack = new Stack<String>();
    this.redoStack = new Stack<String>();
  }
  
  /**
   * Makes a change to the document by adding the supplied change
   * to the undo stack (pushing it to the top of the stack) and
   * returning a string representation of the change.
   *
   * @param change The change to make to the document.
   * @return A string representation of the change that was made.
   */
  public String makeChange(String change) {
    undoStack.push(change);
    return "Making Change: " + undoStack.peek();
  }
  
  /**
   * Undoes the last change made to the document by popping the
   * change off of the undo stack and pushing it to the top of the
   * redo stack.
   *
   * @return A string representation of the change that was undone.
   */
  public String undoChange() {
    redoStack.push(undoStack.pop());
    return "Undoing: " + redoStack.peek();
  }
  
  /**
   * Checks to see if there are any changes that can be undone
   * by seeing if the undoStack is empty (if it is then no changes can
   * be undone).
   *
   * @return a boolean that is true if changes can be undone and false
   *         if changes can not be undone.
   */
  public boolean canUndo() {
    if (undoStack.empty()) {
      return false;
    } else {
      return true;
    }
  }
  
  /**
   * Redoes the last change made to the document by popping the
   * change off of the redo stack and pushing it to the top of the
   * undo stack.
   *
   * @return A string representation of the change that was redone.
   */
  public String redoChange() {
    undoStack.push(redoStack.pop());
    return "Redoing: " + undoStack.peek();
  }
  
  /**
   * Checks to see if there are any changes that can be redone
   * by seeing if the redoStack is empty (if it is then no changes can
   * be redone).
   *
   * @return a boolean that is true if changes can be redone and false
   *         if changes can not be redone.
   */
  public boolean canRedo() {
    if (redoStack.empty()) {
      return false;
    } else {
      return true;
    }
  }
  
  /**
   * Creates a StackIterator object that is used to iterate
   * through the elements of the undoStack that was provided.
   *
   * @return a StackIterator object that is used to iterate through
   *         the elements of the undoStack
   */
  public StackIterator getUndoIterator() {
    return new StackIterator(undoStack);
  }
  
  /**
   * Creates a StackIterator object that is used to iterate
   * through the elements of the redoStack that was provided.
   *
   * @return a StackIterator object that is used to iterate through
   *         the elements of the redoStack
   */
  public StackIterator getRedoIterator() {
    return new StackIterator(redoStack);
  }
}
