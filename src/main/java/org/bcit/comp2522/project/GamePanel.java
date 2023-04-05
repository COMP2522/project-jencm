package org.bcit.comp2522.project;

import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GamePanel {
  public GamePanel gamePanel;
  private Player p1;

  private List<Pipe> pipes;
  private List<Gem> gems;
  private GameState gameState;

  private int score;
  private ScoreRepository scoreRepository;



  public enum GameState {
    START,
    PLAYING,
    GAME_OVER
  }
public GamePanel(){
    p1 = new Player(100, 300, 30, 30, 4);
    pipes = new ArrayList<>();
    gems = new ArrayList<>();
    gameState = GameState.START;
    score = 0;
  scoreRepository = new ScoreRepository();
}

public void update(){
    if (gameState == GameState.PLAYING){
      p1.update();

      Iterator<Pipe> iterator = pipes.iterator();
      while(iterator.hasNext()){
        Pipe pipe = iterator.next();
        pipe.update();

        if(p1.isCollidingWith(pipe)) {
          gameState = GameState.GAME_OVER;
        }

        if (pipe.getX() + pipe.getWidth() < 0){
          iterator.remove();
        }
      }

      Iterator<Gem> iteratorg = gems.iterator();
      while(iteratorg.hasNext()){
        Gem gem = iteratorg.next();
        gem.update();

        if(p1.isCollidingWithg(gem)){
          p1.updategem();
        }

        if(gem.getX() + gem.getWidth() < 0){
          iteratorg.remove();
        }

      }

      for(Pipe pipe: pipes){
        if(!pipe.isPass() && p1.getX() >pipe.getX() + pipe.getWidth()){
          pipe.setPass(true);
          score++;
        }
      }

    }
  if (gameState == GameState.GAME_OVER) {
    // Save the player's score and name (replace "Player" with the actual player name)
    scoreRepository.insertScore("Player", score);
  }
}

public void render(PApplet p){
    p1.render(p);

    for (Pipe pipe: pipes){
      pipe.render(p);
    }

  for (Gem gem: gems){
    gem.render(p);
  }

    p.fill(0);
    p.textSize(32);
    if (gameState == GameState.START){
      p.text("Press SPACE to play", 250, 100);
    }else if (gameState == GameState.GAME_OVER){
      p.text("Game Over", 350, 100);
    }
    p.fill(255);
    p.textSize(24);
    p.text("Score: " + score/32, 20, 70);



    if (gameState == GameState.START) {
      List<ScoreEntry> topFiveScores = scoreRepository.getTopFiveScores();

      p.fill(255);
      p.textSize(20);
      p.text("Top 5 Scores:", 250, 150);

      int yOffset = 180;
      for (ScoreEntry entry : topFiveScores) {
        p.text(entry.getPName() + ": " + entry.getScore(), 250, yOffset);
        yOffset += 30;
      }
    }



}

public void reset(){
    p1 = new Player(100,300,30,30,4);
    pipes.clear();
    gameState = GameState.START;
    score = 0;

}

public void addPipe(Pipe pipe){
    pipes.add(pipe);
}

public void onKeyPressed(char key) {
    if (key == ' '){
      if(gameState == GameState.START){
        gameState = GameState.PLAYING;
      } else if (gameState == GameState.PLAYING){
        p1.jump();
      } else if (gameState == GameState.GAME_OVER) {
        reset();
      }
    }
}
}
