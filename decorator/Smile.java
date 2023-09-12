package decorator;

import java.util.ArrayList;

public class Smile extends VehicleDecorator {
  
  Smile(Vehicle vehicle) {
    super(vehicle.lines);
    ArrayList<String> decor = FileReader.getLines("decorator/txt/smile.txt");
    integrateDecor(decor);
  }
}
