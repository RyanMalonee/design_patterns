package factory;

/**
 * A class that extends the Bike class that sets the variables of the
 * Tricycle bike type to the correct values.
 *
 * @author Ryan Malone
 */
public class Tricycle extends Bike {
  /**
   * Sets the variables of the Tricycle to the correct values for the bike type.
   */
  public Tricycle() {
    name = "Tricycle";
    numWheels = 3;
    hasPedals = true;
    hasTrainingWheels = false;
  }
}
