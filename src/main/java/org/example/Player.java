package org.example;

import processing.core.PApplet;
import processing.core.PImage;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

import static processing.awt.ShimAWT.loadImage;

/**
 * This is the Player Class that creates
 * a player object, it includes the player constructor
 * update, jump and render methods.
 * @author noorsangha
 */

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

    /**
     * Player constructor.
     * @param x float position
     * @param y float position
     * @param width int size of player
     * @param height int size  of player
     * @param velocity int movement
     */
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

    /**
     * updates the position of the Player with the gravity
     */
    public void update() {
        velocity -= gravity;
        y -= velocity;
    }

    /**
     * Updates gem position.
     */
    public void updategem(){
        velocity -= gravity;
        y -=(1.5 * velocity);
    }

    /**
     * render the shape of player.
     * @param p square player
     */
    public void render(PApplet p) {
        PImage playerImage = p.loadImage("Player1_Right_Frame_1.png");
        p.image(playerImage, x, y, width, height);
    }

    /**
     * the speed of the jump.
     */
    public void jump() {
        velocity = jumpF;
    }

    /**
     * collision restrictions for the pipe.
     * @param pipe image
     * @return boolean if player collided with pipe
     */
    public boolean isCollidingWith(Pipe pipe) {
        return (x + width > pipe.getX() && x < pipe.getX() &&
                (y + height < pipe.getTopHeight() || y > pipe.getBottomHeight()));
    }

    /**
     * collision restrictions for the enemy
     * @param enemy1 image
     * @return boolean if player collided with enemy
     */
    public boolean isCollidingWithE(Enemy1 enemy1) {
        return (x + width > enemy1.getX() && x < enemy1.getX() &&
                (y + height < enemy1.getHeight()));
    }

    /**
     * If gem has collided with player.
     * @param gem image
     * @return boolean true if the player and gem have collided
     */
    public boolean isCollidingWithg(Gem gem) {
        return (x == gem.getX() && (y == gem.getY()));
    }

    public int getY() {
        return 0;
    }
}

