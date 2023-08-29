package strategy;
// I don't know if this can be here
import java.util.Random;

public class ReceiveBehavior implements OffenseBehavior {
    public String play() {
        Random random = new Random();
        int play = random.nextInt(1,5);
        if (play == 1) {
            return "runs a slant route";
        } else if (play == 2) {
            return "runs a out route";
        } else if (play == 3) {
            return "runs a seem route";
        } else if (play == 4) {
            return "runs a screen pass";
        } else {
            return "runs a hail mary";
        }
    }
}
