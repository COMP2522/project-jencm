package org.bcit.comp2522.project;

import processing.core.PApplet;

/**
 * This class deals with the way images
 * appear on the screen using PApplet
 * it's main function is to add the visuals.

 * @author noorsangha
 */
public class GameWindow extends PApplet {
  private GamePanel gamePanel;
  private ScoreRepository scoreRepository;

  public GameWindow() {
    gamePanel = new GamePanel();
  }

  @Override
  public void settings() {
    size(800, 600);
  }

  @Override
  public void setup() {
    frameRate(60);
  }

  @Override
  public void draw() {
    background(135, 206, 235);
    gamePanel.update();
    gamePanel.render(this);
    if (frameCount % 100 == 0) {
      float topHeight = random(100, 400);
      float gap = 200;
      gamePanel.addPipe(new Pipe(width, topHeight, topHeight + gap, 100, gap, -3));
      float xgem = random(100, 400);
      float ygem = random(100, 400);

    }
  }

  public ScoreRepository getScoreRepository() {
    return scoreRepository;
  }

  @Override
  public void keyPressed() {
    gamePanel.onKeyPressed(key);
  }

  /**
   * Main method to run GameWindow.

   * @param args arguements
   */
  public static void main(String[] args) {
    PApplet.main("org.bcit.comp2522.project.GameWindow");
    GameWindow gameWindow = new GameWindow();
    PApplet.runSketch(new String[]{"GameWindow"}, gameWindow);

    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      gameWindow.getScoreRepository().close();
    }));
  }


}

