package factory;

public abstract class Bike {
  protected String name;
  protected double price;
  protected int numWheels;
  protected boolean hasPedals;
  protected boolean hasTrainingWheels;

  public String assembleBike() {
    String bike = "Creating a " + this.name + "\n";
    bike += createFrame();
    bike += addWheels();
    bike += addPedals();
    return bike;
  }
  
  private String createFrame() {
    return "- Assembling " + this.name + " frame\n";
  }

  private String addWheels() {  
    String wheels = "";  
     wheels += "- Adding " + this.numWheels + " wheel(s)\n";
     if(this.hasTrainingWheels) {
       wheels += "- Adding training wheels\n";
     }
     return wheels;
  }

  private String addPedals() {
    if (this.hasPedals) {
      return "- Adding pedals\n";
    } else {
      return "";
    }
  }

  public double getPrice() {
    return this.price;
  }
}
