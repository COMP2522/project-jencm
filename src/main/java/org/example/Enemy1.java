package org.example;

import processing.core.PApplet;
import processing.core.PImage;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import static processing.awt.ShimAWT.loadImage;


public class Enemy1 {
    private float x, y;
    private int width, height;
    private float velocity;

    private PImage enemyImage;


    public Enemy1(float x, float y, int width, int height, float velocity) {
        this.x = (float) Math.random();;
        this.y = (float) Math.random();
        this.width = 300;
        this.height = 300;
        this.velocity = velocity;
    }

    public void update(float playerX, float playerY) {
        // Update the position of the enemy to chase after the player
        float dx = playerX - x;
        float dy = playerY - y;
        float angle = PApplet.atan2(dy, dx);
        float vx = PApplet.cos(angle) * velocity;
        float vy = PApplet.sin(angle) * velocity;
        x += vx;
        y += vy;
    }

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

