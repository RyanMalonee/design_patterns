package decorator;
import java.util.ArrayList;
public abstract class Vehicle {
  protected ArrayList<String> lines;

  public Vehicle(ArrayList<String> lines) {
    this.lines = lines;
  }

  public String toString() {
    String result = "";
    for (String line : lines) {
      result += line + "\n";
    }
    return result;
  }
}
