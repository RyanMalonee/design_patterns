package factory;

public class BikeStore {
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
