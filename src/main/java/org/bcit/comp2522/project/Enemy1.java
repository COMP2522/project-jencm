package org.bcit.comp2522.project;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * This is the first Enemy class that chases the player
 * @author Ebony Proskow
 */

public class Enemy1 {
    private float x, y;
    private int width, height;
    private float velocity;

    private PImage enemyImage;

    /**
     * Enemy constructor
     * @param x position
     * @param y position
     * @param width
     * @param height
     * @param velocity
     */
    public Enemy1(float x, float y, int width, int height, float velocity) {
        this.x = (float) Math.random();;
        this.y = (float) Math.random();
        this.width = 300;
        this.height = 300;
        this.velocity = velocity;
    }

    /**
     * Updates the Enemy to chase after the player.
     */
    public void update(float playerX, float playerY) {
        float dx = playerX - x;
        float dy = playerY - y;
        float angle = PApplet.atan2(dy, dx);
        float vx = PApplet.cos(angle) * velocity;
        float vy = PApplet.sin(angle) * velocity;
        x += vx;
        y += vy;
    }

    /**
     * Renders the enemy on the screen.
     */
    public void render(PApplet p) {
        PImage enemyImage = p.loadImage("Enemy1_Frame1.png");
        p.image(enemyImage, x, y, width, height);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }


    public int getWidth() {
        return width;
    }


}

