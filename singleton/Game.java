package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game {
  private static Game game;
  private Random rand;
  private Difficulty level;
  private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
  private Anagram currentAnagram;
  private int score;
  
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
  
  public static Game getInstance() {
    if (game == null) {
      game = new Game();
    }
    return game;
  }
  
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
  
  public boolean isCorrect(String userAnswer) {
    if (currentAnagram.isCorrect(userAnswer)) {
      score++;
      return true;
    } else {
      score--;
      return false;
    }
  }
  
  public int getScore() {
    return score;
  }
}
