package factory;

public abstract class Bike {
  protected String name;
  protected double price;
  protected int numWheels;
  protected boolean hasPedals;
  protected boolean hasTrainingWheels;

  public String assembleBike() {

  }
  
  private String createFrame() {

  }

  private String addWheels() {
    
  }

  private String addPedals() {

  }

  public double getPrice() {
    return this.price;
  }
}
