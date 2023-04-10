package org.example;

import processing.core.PApplet;
import processing.core.PImage;

public class Gem extends PApplet{
    private float x;

    private float y;
    private int width;

    private int height;
    private float velocityX;

    PImage gemImage;

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
