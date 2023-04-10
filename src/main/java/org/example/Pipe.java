package org.example;

import processing.core.PApplet;
import processing.core.PImage;

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

    PImage pipeImage;

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

    public boolean isPass(){
        return pass;
    }

    public void setPass(boolean b){
        this.pass = pass;
    }

    /** Renders the image.
     * @param p image
     */
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