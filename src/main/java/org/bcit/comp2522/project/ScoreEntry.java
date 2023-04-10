package org.bcit.comp2522.project;

/**
 * Score Entry for actual game.
 * @author noorsangha
 */
public class ScoreEntry {

  private String pname;

  private int score;

  /**
   * Score Entry Constructor.
   * @param pname string
   * @param score int
   */
  public ScoreEntry(String pname, int score) {
    this.pname = pname;
    this.score = score;
  }

  /** get score.
   *
   * @return score int
   */
  public int getScore() {
    return score;
  }

  /** Get players name.
   * @return string pname
   */
  public String getPname() {
    return pname;
  }
}