package factory;

/**
* Abstract class that defines a bike, its components, and "assembles"
* the bike.
*
* @author Ryan Malone
*/
public abstract class Bike {
  protected String name;
  protected double price;
  protected int numWheels;
  protected boolean hasPedals;
  protected boolean hasTrainingWheels;
  
  /**
  * Assembles the bike by calling the private methods that add the
  * components of the bike to a String representation of the bike.
  *
  * @return a string representation of all the components of the bike
  */
  public String assembleBike() {
    String bike = "Creating a " + this.name + "\n";
    bike += createFrame();
    bike += addWheels();
    bike += addPedals();
    return bike;
  }
  
  /**
  * Creates the frame of the bike.
  *
  * @return a string expressing the creation of the frame of the bike
  */
  private String createFrame() {
    return "- Assembling " + this.name + " frame\n";
  }
  
  /**
  * Adds the wheels onto the bike.
  *
  * @return a string expressing the addition of the wheels to the bike
  */
  private String addWheels() {  
    String wheels = "";  
    wheels += "- Adding " + this.numWheels + " wheel(s)\n";
    if (this.hasTrainingWheels) {
      wheels += "- Adding training wheels\n";
    }
    return wheels;
  }
  
  /**
  * Adds the pedals to the bike if the bike has pedals (checked by
  * boolean hasPedals).
  *
  * @return A string representing the addition of pedals to the bike
  *     if the bike has pedals, or no addition if it doesn't.
  */
  private String addPedals() {
    if (this.hasPedals) {
      return "- Adding pedals\n";
    } else {
      return "";
    }
  }
  
  /**
   * Gets the price of the bike.
   *
   * @return the price of the bike
   */
  public double getPrice() {
    return this.price;
  }
}
