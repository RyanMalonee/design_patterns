package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Creates a single instance of a Game that will be used throughout the program.
 *
 * @author Ryan Malone
 */
public class Game {
  private static Game game;
  private Random rand;
  private Difficulty level;
  private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
  private Anagram currentAnagram;
  private int score;
  
  /**
   * Creates a single instance of a Game by creating the anagrams HashMap and
   * setting all the variables to their default value (e.g. difficulty is easy,
   * score starts at 0, etc.)
   */
  private Game() {
    rand = new Random();
    level = Difficulty.EASY;
    anagrams = new HashMap<Difficulty, ArrayList<Anagram>>();
    // I did use w3 schools for reference here because I've never used a HashMap before
    anagrams.put(Difficulty.EASY, FileReader.getAnagrams(Difficulty.EASY));
    anagrams.put(Difficulty.MEDIUM, FileReader.getAnagrams(Difficulty.MEDIUM));
    anagrams.put(Difficulty.HARD, FileReader.getAnagrams(Difficulty.HARD));
    score = 0;
  }
  
  /**
   * If there is no instance of a game yet, it will create one. Otherwise, it
   * will simply return the instance that is already created.
   *
   * @return an instance of the Game object
   */
  public static Game getInstance() {
    if (game == null) {
      game = new Game();
    }
    return game;
  }
  
  /**
   * Retrieves a question of a certain difficulty that is 
   * based on the current score of the player (as they score more
   * it gets more difficult questions and vice versa).
   *
   * @return the question to be displayed/asked
   */
  public String getQuestion() {
    if (score < 5) {
      level = Difficulty.EASY;
    } else if (score < 10) {
      level = Difficulty.MEDIUM;
    } else {
      level = Difficulty.HARD;
    }
    currentAnagram = anagrams.get(level).get(rand.nextInt(anagrams.get(level).size()));
    return currentAnagram.getQuestion();
  }

  /**
   * Checks if the user's answer is correct and updates the
   * user's score accordingly.
   *
   * @param userAnswer the user's answer to the question
   * @return true if the user's answer is correct, false otherwise
   */
  public boolean isCorrect(String userAnswer) {
    if (currentAnagram.isCorrect(userAnswer)) {
      score++;
      return true;
    } else {
      score--;
      return false;
    }
  }
  
  /**
   * Gets the user's current score.
   *
   * @return the score of the user
   */
  public int getScore() {
    return score;
  }
}
