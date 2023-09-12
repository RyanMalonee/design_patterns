package decorator;
import java.util.ArrayList;
public class Rims extends VehicleDecorator {
  
  Rims(Vehicle vehicle) {
    super(vehicle.lines);
    ArrayList<String> decor = FileReader.getLines("decorator/txt/rims.txt");
    integrateDecor(decor);
  }
}
