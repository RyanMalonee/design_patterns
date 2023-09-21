package factory;

/**
 * A class that extends the Bike class that sets
 * the variables of the Kids Bike to have the correct values.
 *
 * @author Ryan Malone
 */
public class KidsBike extends Bike {
  /**
   * Sets the variables of the Kids Bike to the correct values for the bike type.
   */
  public KidsBike() {
    name = "Kids Bike";
    numWheels = 2;
    hasPedals = true;
    hasTrainingWheels = true;
  }
}
