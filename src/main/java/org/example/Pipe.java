package org.example;

import processing.core.PApplet;
import processing.core.PImage;

public class Pipe {
    private float x;
    private float topHeight;
    private float bottomY;
    private int width;
    private float gap;
    private float velocityX;

    PImage pipeImage;

    private boolean pass;


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

    public boolean isPass(){
        return pass;
    }

    public void setPass(boolean b){
        this.pass = pass;
    }

    public void render(PApplet p) {
        PImage pipeImage = p.loadImage("pipe.png");
        p.image(pipeImage, x, 0, width, topHeight);
        p.image(pipeImage, x, bottomY, width, p.height - bottomY);
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