package factory;

/**
 * Creates a bike based on the type of bike requested.
 *
 * @author Ryan Malone
 */
public class BikeStore {
  /**
   * Creates a bike based on the type of bike requested.
   *
   * @param type the type of bike that is to be created
   * @return the bike that was created and assembled
   */
  public Bike createBike(String type) {
    Bike bike;
    if (type.equalsIgnoreCase("Tricycle")) {
      bike = new Tricycle();
    } else if (type.equalsIgnoreCase("Kids Bike")) {
      bike = new KidsBike();
    } else {
      bike = new Strider();
    }
    return bike;
  }
}
