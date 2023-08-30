package strategy;
// I don't know if this can be here
import java.util.Random;
public class BlockBehavior implements DefenseBehavior {
    public String play() {
        // the name should already be printed, so just put the equal chances of each play
        Random random = new Random();
        int play = random.nextInt(3);
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
