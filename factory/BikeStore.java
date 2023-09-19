package factory;

public class BikeStore {
  public Bike createBike(String type) {
    Bike bike = null;
    if (type.equalsIgnoreCase("Tricycle")) {
      bike = new Tricycle();
    } else if (type.equalsIgnoreCase("KidsBike")) {
      bike = new KidsBike();
    } else {
      bike = new Strider();
    }
    return bike;
  }
}
