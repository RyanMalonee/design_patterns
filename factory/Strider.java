package factory;

/**
 * A class that extends the Bike class that sets the variables of the
 * Strider to the correct values.
 *
 * @author Ryan Malone
 */
public class Strider extends Bike {
  /**
   * Sets the variables of the Strider to the correct values for the bike type.
   */
  public Strider() {
    name = "Strider";
    numWheels = 2;
    hasPedals = false;
    hasTrainingWheels = false;
  }
}
