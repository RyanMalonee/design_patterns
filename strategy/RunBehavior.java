package strategy;
// I don't know if this can be here
import java.util.Random;
public class RunBehavior implements OffenseBehavior{
    public String play() {
        Random random = new Random();
        int play = random.nextInt(3);
        if (play == 0) {
            return "runs a drive (up the gut)";
        } else if (play == 1) {
            return "runs a draw";
        } else if (play == 2) {
            return "runs a pitch";
        } else {
            return "runs a reverse";
        }
    }
}