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
    frameRate(60);}

  @Override
  public void draw(){
    background(135,206,235);
    gamePanel.update();
    gamePanel.render(this);
    if(frameCount % 100 == 0) {
      float topHeight = random(100,400);
      float gap = 200;
      gamePanel.addPipe(new Pipe(width, topHeight, topHeight + gap, 100, gap, -3));
      float xgem = random(100,400);
      float ygem = random(100,400);

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
