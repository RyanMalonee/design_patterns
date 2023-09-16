package decorator;

import java.util.ArrayList;

/**
 * Abstract class used to create vehicle objects using an ArrayList that hold
 * the lines that make up the vehicle.
 *
 * @Author Ryan Malone
 */
public abstract class Vehicle {
  protected ArrayList<String> lines;

  /**
   * Initializes the vehicle with the lines provided.
   *
   * @param lines the lines that make up the vehicle
   */
  public Vehicle(ArrayList<String> lines) {
    this.lines = lines;
  }

  /**
   * Prints the lines of the vehicle using new lines for each index in lines.
   *
   * @return A string representation of the vehicle (with new lines separating each index)
   */
  public String toString() {
    String result = "";
    for (String line : lines) {
      result += line + "\n";
    }
    return result;
  }
}
