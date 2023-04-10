package org.bcit.comp2522.project;

import processing.core.PApplet;

/** This class is to create a gem object
 * the class deals with the creating, updating
 * and getters an setters to enable other
 * classes to use the object.

 * @author noorsangha
 */
public class Gem extends PApplet {
  private float x;



  private float y;
  private int width;

  private int height;
  private float velocityX;

  /** Gem constructor.

   * @param x position
   * @param y position
   * @param width size
   * @param height size
   * @param velocityX speed
   */
  public Gem(float x, float y, int width, int height, float velocityX) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.velocityX = velocityX;
  }

  public void update() {
    x += velocityX;
  }

  public void render(PApplet p) {
    p.fill(180, 0, 0);
    p.rect(x, y, width, height);
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

  public float getHeight() {
    return x;
  }


}

