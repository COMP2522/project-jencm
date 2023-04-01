package org.bcit.comp2522.project;

import processing.core.PApplet;

abstract class SpeedChanger extends PApplet implements Collidable {
  private float x;
  private float y;
  private int width;
  private int height;
  private float velocityX;

  public SpeedChanger(float x, float y, int width, int height, float velocityX){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.velocityX = velocityX;
  }

  public void render(PApplet p){
    p.fill(180,0,0);
    p.rect(x,y,width,height);
  }

  public void update(){
    this.x +=this.velocityX;
  }

  public float getY() {
    return y;
  }

  public float getX() {
    return x;
  }

  public float getWidth() {
    return x;
  }

}
