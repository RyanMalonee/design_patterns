package observer;

public class HoleScoreDisplay implements Observer {
  private Subject golfer;
  private int strokes;
  private int par;
  
  public HoleScoreDisplay(Subject golfer) {

  }

  public void update(int strokes, int par) {
    this.strokes = strokes;
    this.par = par;
  }

  private String toString() {
    if( strokes < par) {
      return "Current Hole stats: Par (" + par + ") Strokes (" + strokes + "), "
      + (par-strokes) + " under par";
    } else if( strokes == par) {
      return "Current Hole stats: Par (" + par + ") Strokes (" + strokes + "), Making par";
    } else {
      return "Current Hole stats: Par (" + par + ") Strokes (" + strokes + "), "
      + (strokes - par) + " over par";
    }
  }
}
