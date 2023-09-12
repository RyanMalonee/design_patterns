package decorator;
import java.util.ArrayList;
public abstract class VehicleDecorator extends Vehicle {
  
  public VehicleDecorator(ArrayList<String> lines) {
    super(lines);
  }
  
  protected void integrateDecor(ArrayList<String> decor) {
    System.out.print(lines.get(0));
    for (int i = 1; i < lines.size()-1; i++) {
      for (int j = 0; j < lines.get(i).length(); j++) {
        if (lines.get(i).charAt(j) != decor.get(i - 1).charAt(j) &&
            decor.get(i - 1).charAt(j) != ' ' && j < lines.get(i).length()) {
          lines.set(i, lines.get(i).substring(0, j) 
              + decor.get(i - 1).charAt(j) + lines.get(i).substring(j + 1));
        }
      }
    }
    System.out.print(lines.get(lines.size()-1));
  }
  
}
