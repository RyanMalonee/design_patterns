package strategy;

import java.util.Random;
public class BlockBehavior implements DefenseBehavior {
    public String play() {
        Random random = new Random();
        int play = random.nextInt(4);
        if (play == 0) {
            return "block a kick";
        } else if (play == 1) {
            return "block a punt";
        } else if (play== 2) {
            return "block a pass";
        } else {
            return "block a catch";
        }
    }
}
