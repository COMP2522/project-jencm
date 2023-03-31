package org.example;

import processing.core.PApplet;
import processing.core.PImage;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.security.PrivateKey;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class GameWindow extends PApplet {
    private PApplet p;
    private GamePanel gamePanel;

    PImage backgroundImage;


    public GameWindow() {
        gamePanel = new GamePanel();
    }



    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        backgroundImage = loadImage("cave.jpg");
        frameRate(60);
    }

    @Override
    public void draw() {
        image(backgroundImage, 0, 0, width, height);
        gamePanel.update();
        gamePanel.render(this);
        if (frameCount % 100 == 0) {
            float topHeight = random(100, 400);
            float gap = 200;
            gamePanel.addPipe(new Pipe(width, topHeight, topHeight + gap, 100, gap, -3));
            float xgem = random(100,400);
            float ygem = random(100,400);
        }

    }

    @Override
    public void keyPressed() {
        gamePanel.onKeyPressed(key);
    }

    public static void main(String[] args) {
        PApplet.main("org.bcit.comp2522.project.GameWindow");
    }

}
