package org.bcit.comp2522.project;

import processing.core.PApplet;

public class Player {
  private float x,y;
  private int width, height;
  private float velocity;
  private int jumpF;
  private float gravity;

  public Player(float x, float y, int width, int height, int velocity){
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
    this.velocity = 0;
    this.gravity = 0.6f;
    this.jumpF = 9;
  }

  //updates the position of the bird with the gravity
  public void update(){
    velocity -= gravity;
    y -= velocity;
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
  }
