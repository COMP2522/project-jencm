package org.bcit.comp2522.project;

import processing.core.PApplet;

public class GameWindow extends PApplet {
  private GamePanel gamePanel;
  public GameWindow(){
    gamePanel = new GamePanel();
  }

  @Override
  public void settings(){
    size(800,600);
  }

  @Override
  public void setup(){
    frameRate(60);
  }

  @Override
  public void draw(){
    background(135,206,235);
    gamePanel.update();
    gamePanel.render(this);
    if(frameCount % 100 == 0) {
      float topHeight = random(100,400);
      float gap = 250;
      gamePanel.addPipe(new Pipe(width, topHeight, topHeight + gap, 100, gap, -3));
      if(gamePanel.getScore() > 5 && frameCount % 200 == 0) {
        float xGem = random(600, 1000);
        float yGem = random(200,400);
        gamePanel.addGem(new Gem(xGem, yGem, 25, 25, -3));
      }
    }
  }

  @Override
  public void keyPressed(){
    gamePanel.onKeyPressed(key);
  }

  public static void main(String[] args){
    PApplet.main("org.bcit.comp2522.project.GameWindow");
  }

}

