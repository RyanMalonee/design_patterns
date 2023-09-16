package decorator;

import java.util.ArrayList;

/**
 * Incorporates/adds the rims decoration to the vehicle.
 *
 * @Author Ryan Malone
 */
public class Rims extends VehicleDecorator {
  /**
   * Initializes the vehicle with the lines provided, gathers the new lines for the
   * rims to be added to the vehicle using the rims.txt file, and integrates the new rims.
   *
   * @param vehicle The vehicle to add the rims to
   */
  Rims(Vehicle vehicle) {
    super(vehicle.lines);
    ArrayList<String> decor = FileReader.getLines("decorator/txt/rims.txt");
    integrateDecor(decor);
  }
}
