package decorator;

import java.util.ArrayList;

/**
 * Class that will incorporate/implement decorations to the vehicle.
 *
 * @author Ryan Malone
 */
public abstract class VehicleDecorator extends Vehicle {
  
  /**
   * Initializes the vehicle with the lines provided.
   *
   * @param lines the lines that make up the vehicle
   */
  public VehicleDecorator(ArrayList<String> lines) {
    super(lines);
  }
  
  /**
   * Integrates the decoration into the vehicle (rims, paint, or smile) by comparing
   * the lines of the vehicle to the lines of the decor arraylist and replacing the characters
   * that make up the new decoration. It will implement the paint color by reading the first index
   * of the array list and reset the paint color to black by reading the last index of the array
   * list.
   *
   * @param decor The lines from the .txt file that holds the decoration
   */
  protected void integrateDecor(ArrayList<String> decor) {
    for (int i = 1; i < lines.size() - 1; i++) {
      for (int j = 0; j < lines.get(i).length(); j++) {
        if (lines.get(i).charAt(j) != decor.get(i - 1).charAt(j)
            && decor.get(i - 1).charAt(j) != ' ' && j < lines.get(i).length()) {
          lines.set(i, lines.get(i).substring(0, j) 
              + decor.get(i - 1).charAt(j) + lines.get(i).substring(j + 1));
        }
      }
    }
  }
}
