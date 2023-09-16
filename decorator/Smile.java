package decorator;

import java.util.ArrayList;

/**
 * Incorporates/adds the smile decoration to the vehicle.
 *
 * @Author Ryan Malone
 */
public class Smile extends VehicleDecorator {
  /**
   * Initializes the vehicle with the lines provided, gathers the new lines for the
   * smile to be added to the vehicle using the smile.txt file, and integrates the new smile.
   *
   * @param vehicle The vehicle to add the smile to
   */
  Smile(Vehicle vehicle) {
    super(vehicle.lines);
    ArrayList<String> decor = FileReader.getLines("decorator/txt/smile.txt");
    integrateDecor(decor);
  }
}
