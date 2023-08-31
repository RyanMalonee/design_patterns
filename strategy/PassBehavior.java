package strategy;

import java.util.Random;

public class PassBehavior implements OffenseBehavior {
    public String play() {
        Random random = new Random();
        int play = random.nextInt(5);
        if (play == 0) {
            return "throws a slant route";
        } else if (play == 1) {
            return "throws a out route";
        } else if (play == 2) {
            return "throws a seem route";
        } else if (play == 3) {
            return "throws a screen pass";
        } else {
            return "throws a hail mary";
        }
    }
}
