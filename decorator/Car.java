package decorator;

/**
 * Creates a car object that extends the vehicle class.
 *
 * @author Ryan Malone
 */
public class Car extends Vehicle {
  /**
   * Initializes the car with the lines provided in the car.txt file
   */
  public Car() {
    super(FileReader.getLines("decorator/txt/car.txt"));
  }
}
