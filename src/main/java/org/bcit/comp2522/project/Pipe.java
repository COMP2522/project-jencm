package org.bcit.comp2522.project;

import processing.core.PApplet;

public class Pipe {
private float x;
private float topHeight;
private float bottomY;
private int width;
private float gap;
private float velocityX;



  public Pipe(float x, float topHeight, float bottomY, int width, float gap, float velocityX ){
    this.x = x;
    this.topHeight = topHeight;
    this.bottomY = bottomY;
    this.width = width;
    this.gap = gap;
    this.velocityX = velocityX;
  }
  public void update(){
    x += velocityX;
  }

  public void render(PApplet p){
    p.fill(0, 255, 0);
    p.rect(x, 0, width, topHeight);
    p.rect(x, bottomY, width, p.height - bottomY);
  }


  public float getX() {
    return x;
  }

  public float getTopHeight() {
    return topHeight;
  }

  public float getBottomHeight() {
    return bottomY;
  }


  public int getWidth() {
    return width;
  }

  public float getGap() {
    return gap;
  }

}