package org.bcit.comp2522.project;

import processing.core.PApplet;

/**
 * This is the pipe class and creates a random Pipe
 * object with getters and setter for the
 * variables that make up the pipe object.

 * @author noorsangha
 */
public class Pipe {
  private float x;
  private float topHeight;
  private float bottomY;
  private int width;
  private float gap;
  private float velocityX;
  private boolean pass;


  /**
   * Pipe objects contructor.

   * @param x position
   * @param topHeight top of pipe
   * @param bottomY bottom of pipe
   * @param width size
   * @param gap in between to and bottom pipe
   * @param velocityX speed of pipe
   */
  public Pipe(float x, float topHeight, float bottomY, int width, float gap, float velocityX) {
    this.x = x;
    this.topHeight = topHeight;
    this.bottomY = bottomY;
    this.width = width;
    this.gap = gap;
    this.velocityX = velocityX;
    pass = false;
  }

  public void update() {
    x += velocityX;
  }

  public boolean isPass() {
    return pass;
  }

  public void setPass(boolean b) {
    this.pass = pass;
  }

  /** Renders the image.

   * @param p image
   */
  public void render(PApplet p) {
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
