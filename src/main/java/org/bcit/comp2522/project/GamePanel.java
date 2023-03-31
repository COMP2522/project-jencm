package org.bcit.comp2522.project;

import processing.core.PApplet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GamePanel {
  public GamePanel gamePanel;
  private Player p1;

  private List<Pipe> pipes;
  private GameState gameState;

  private int score;

  public enum GameState {
    START,
    PLAYING,
    GAME_OVER
  }
public GamePanel(){
    p1 = new Player(100, 300, 30, 30, 4);
    pipes = new ArrayList<>();
    gameState = GameState.START;
    score = 0;
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

    }
}

public void render(PApplet p){
    p1.render(p);

    for (Pipe pipe: pipes){
      pipe.render(p);
    }

    p.fill(0);
    p.textSize(32);
    if (gameState == GameState.START){
      p.text("Press SPACE to play", 250, 100);
    }else if (gameState == GameState.GAME_OVER){
      p.text("Game Over", 350, 100);
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