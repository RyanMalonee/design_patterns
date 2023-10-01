package singleton;

import java.util.ArrayList;

/**
 * Creates an anagram object with a question and answers to that question.
 *
 * @author Ryan Malone
 */
public class Anagram {
  private String question;
  private ArrayList<String> answers;

  /**
   * Creates an anagram object with a question and answers to that question.
   *
   * @param question the question to be asked
   * @param answers the answers to the question
   */
  public Anagram(String question, ArrayList<String> answers) {
    this.question = question;
    this.answers = answers;
  }

  /**
   * Retrieves the question of the anagram.
   *
   * @return the question that the current anagram stores
   */
  public String getQuestion() {
    return this.question;
  }

  /**
   * Checks to see if the user's answer matches the possible answers of the anagram.
   *
   * @param userAnswer the user's answer to the anagrams question
   * @return true if the user's answer matches the possible answers, false otherwise
   */
  public boolean isCorrect(String userAnswer) {
    for (String answer : answers) {
      if (userAnswer.equals(answer)) {
        return true;
      }
    }
    return false;
  }
}
