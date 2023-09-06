package observer;

public class RoundScoreDisplay implements Observer{
  private Subject golfer;
  private int strokesTotal;
  private int parTotal;

  public RoundScoreDisplay(Subject golfer) {
    
  }

  public void update(int strokes, int par) {
    this.strokesTotal += strokes;
    this.parTotal += par;
  }

  private String toString() {

    return "Overall stats: Par (" + parTotal + ") Strokes (" + strokesTotal + ")";
  }
}
