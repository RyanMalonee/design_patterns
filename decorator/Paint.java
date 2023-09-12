package decorator;

import java.util.ArrayList;

public class Paint extends VehicleDecorator {
  Paint(Vehicle vehicle, String color) {
    super(vehicle.lines);
    if(color.equalsIgnoreCase("Red")) {
        vehicle.lines.add(0,"\u001B[31m");
        
        //vehicle.lines.add(vehicle.lines.size(), "\u001B[31m");
    }
  }
}
