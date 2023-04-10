package org.bcit.comp2522.project;

import processing.core.PApplet;
import processing.core.PImage;

public class Player {
    private float x, y;
    public int width, height;
    private float velocity;
    private int jumpF;
    private float gravity;

    private float gemgravity;

    PImage playerImage;

    public float getX() {
        return x;
    }

    public Player(float x, float y, int width, int height, int velocity) {
        this.x = x;
        this.y = y;
        this.width = 300;
        this.height = 300;
        this.velocity = 0;
        this.gravity = 0.6f;
        this.jumpF = 9;
        this.gemgravity = 0.25f;
    }


    //pulls the player down
    public void update() {
        velocity -= gravity;
        y -= velocity; // subtract the velocity from the y position
    }

    public void updategem(){
        velocity -= gravity;
        y -=(1.5 * velocity);
    }

    public void render(PApplet p) {
        PImage playerImage = p.loadImage("Player1_Right_Frame_1.png");
        p.image(playerImage, x, y, width, height);
        ;
    }

    public void jump() {
        velocity = jumpF;
    }

    public boolean isCollidingWith(Pipe pipe) {
        return (x + width > pipe.getX() && x < pipe.getX() &&
                (y + height < pipe.getTopHeight() || y > pipe.getBottomHeight()));
    }

    public boolean isCollidingWithg(Gem gem) {
        return (x == gem.getX() && (y == gem.getY()));
    }

    public int getY() {
        return 0;
    }
}

