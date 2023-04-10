package org.example;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * This is the Gem class that can affect the Player's gravity.
 * @author noorsangha
 */
public class Gem extends PApplet{
    private float x;

    private float y;
    private int width;

    private int height;
    private float velocityX;

    PImage gemImage;

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
        this.width = 100;
        this.height = 200;
        this.velocityX = velocityX;
    }

    public void update() {
        x += velocityX;
    }

    public void render(PApplet p) {
        PImage gemImage = p.loadImage("gem.png");
        p.image(gemImage, x, y, width, height);
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
        return y;
    }


}
