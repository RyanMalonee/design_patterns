package decorator;

/**
 * Class that changes the color of the car (by changing the color of the text in the terminal).
 *
 * @author Ryan Malone
 */
public class Paint extends VehicleDecorator {
  /**
   * Adds the color of the car to the first index of the lines arraylist.
   * and adds black to reset the color to the last index of the arraylist.
   *
   * @param vehicle the vehicle that needs to be painted
   * @param color the color that the vehicle should be painted
   */
  Paint(Vehicle vehicle, String color) {
    super(vehicle.lines);
    if (color.equalsIgnoreCase("None")) {
      vehicle.lines.add(0, "\u001B[0m");
      vehicle.lines.add(vehicle.lines.size(), "\u001B[0m");
    } else if (color.equalsIgnoreCase("Red")) {
      vehicle.lines.add(0, "\u001B[31m");
      vehicle.lines.add(vehicle.lines.size(), "\u001B[0m");
    } else if (color.equalsIgnoreCase("Green")) {
      vehicle.lines.add(0, "\u001B[32m");
      vehicle.lines.add(vehicle.lines.size(), "\u001B[0m");
    } else if (color.equalsIgnoreCase("Yellow")) {
      vehicle.lines.add(0, "\u001B[33m");
      vehicle.lines.add(vehicle.lines.size(), "\u001B[0m");
    } else if (color.equalsIgnoreCase("Blue")) {
      vehicle.lines.add(0, "\u001B[34m");
      vehicle.lines.add(vehicle.lines.size(), "\u001B[0m");
    } else if (color.equalsIgnoreCase("Purple")) {
      vehicle.lines.add(0, "\u001B[35m");
      vehicle.lines.add(vehicle.lines.size(), "\u001B[0m");
    } else if (color.equalsIgnoreCase("Cyan")) {
      vehicle.lines.add(0, "\u001B[36m");
      vehicle.lines.add(vehicle.lines.size(), "\u001B[0m");
    }
  }
}
