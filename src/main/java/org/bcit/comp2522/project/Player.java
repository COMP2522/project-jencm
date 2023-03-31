package org.bcit.comp2522.project;

import processing.core.PApplet;

public class Player implements Collidable {
  private float x,y;
  private int width, height;
  private float velocity;
  private int jumpF;
  private float gravity;
  private float gemgravity;

  public float getX() {
    return x;
  }

  public Player(float x, float y, int width, int height, int velocity){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.velocity = 0;
    this.gravity = 0.6f;
    this.jumpF = 9;
    this.gemgravity = 0.25f;
  }

  //updates the position of the bird with the gravity
  public void update(){
    velocity -= gravity;
    y -= velocity;
  }

  public void updategem(){
    velocity -= gravity;
    y -=(1.5 * velocity);
  }

  public void render(PApplet p){
p.fill(255,0,0);
p.rect(x,y,width,height);
  }

  public void jump(){
    velocity = jumpF;
  }

  public boolean isCollidingWith(Pipe pipe) {
    return(x + width > pipe.getX() && (x < pipe.getX() + pipe.getWidth()) &&
        (y < pipe.getTopHeight() || (y+height) > pipe.getBottomHeight() ));
    }

  public boolean isCollidingWithg(Gem gem) {
    return(x == gem.getX() && (y == gem.getY()));
  }
  }

