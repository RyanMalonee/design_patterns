package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Game {
  private Game game;
  private Random rand;
  private Difficulty level;
  private HashMap<Difficulty, ArrayList<Anagram>> anagrams;
  private Anagram currentAnagram;
  private int score;
  
  private Game() {
    
  }
  
  public static Game getInstance() {
    
  }
  
  public String getQuestion() {
    
  }
  
  public boolean isCorrect(String userAnswer) {
    
  }
  
  public int getScore() {
    
  }
}
