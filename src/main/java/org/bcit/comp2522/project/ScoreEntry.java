package org.bcit.comp2522.project;

public class ScoreEntry {


  private String PName;



  private int score;

  public ScoreEntry(String PName, int score){
    this.PName = PName;
    this.score= score;
  }

  public int getScore() {
    return score;
  }

  public String getPName() {
    return PName;
  }
}
