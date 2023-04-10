package org.bcit.comp2522.project;

import processing.core.PApplet;

/**
 * This is the Player Class that creates
 * a player object, it includes the player constructor
 * update, jump and render methods.
 * @author noorsangha
 */
public class Player {
  private float x;
  private float y;
  private int width;
  private int height;
  private float velocity;
  private int jumpF;
  private float gravity;
  private float gemgravity;

  public float getX() {
    return x;
  }

  public float getVelocity() {
    return velocity;
  }

  public float getY() {
    return y;
  }

  /**
   * Player constructor.
   *
   * @param x        float position
   * @param y        float position
   * @param width    int size of player
   * @param height   int size  of player
   * @param velocity int movement
   */
  public Player(float x, float y, int width, int height, int velocity) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.velocity = 0;
    this.gravity = 0.6f;
    this.jumpF = 9;
    this.gemgravity = 0.25f;
  }


  /**
   * updates the position of the bird with the gravity
   */
  public void update() {
    velocity -= gravity;
    y -= velocity;
  }

  /**
   * Updates gem position.
   */
  public void updategem() {
    velocity -= gravity;
    y -= (1.5 * velocity);
  }

  /**
   * render the shape of player.
   *
   * @param p square player
   */
  public void render(PApplet p) {
    p.fill(255, 0, 0);
    p.rect(x, y, width, height);
  }

  /**
   * the speed of jump.
   */
  public void jump() {
    velocity = jumpF;
  }

  /**
   * collision restrictions for the pipe.
   *
   * @param pipe image
   * @return boolean if player collided with pipe
   */
  public boolean isCollidingWith(Pipe pipe) {
    return (x + width > pipe.getX() && (x < pipe.getX() + pipe.getWidth()) &&
        (y < pipe.getTopHeight() || (y + height) > pipe.getBottomHeight()));
  }

  /**
   * If gem has collided with player.
   *
   * @param gem image
   * @return boolean true if the player and gem have collided
   */
  public boolean isCollidingWithg(Gem gem) {
    return (x == gem.getX() && (y == gem.getY()));
  }
}

