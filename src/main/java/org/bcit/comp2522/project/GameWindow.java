package org.bcit.comp2522.project;

import processing.core.PApplet;
import processing.core.PImage;

/**
 * This class deals with the way images
 * appear on the screen using PApplet
 * it's main function is to add the visuals.
 * @author noorsangha
 */

public class GameWindow extends PApplet {
    private PApplet p;
    private GamePanel gamePanel;

    private ScoreRepository scoreRepository;

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
        frameRate(60);
        size(800, 600);
        backgroundImage = loadImage("cave.jpg");
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
    public ScoreRepository getScoreRepository() {
        return scoreRepository;
    }

    @Override
    public void keyPressed() {
        gamePanel.onKeyPressed(key);
    }

    /**
     * Main method to run GameWindow.
     * @param args arguements
     */
    public static void main(String[] args) {
        PApplet.main("org.example.GameWindow");
        GameWindow gameWindow = new GameWindow();
        PApplet.runSketch(new String[]{"GameWindow"}, gameWindow);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            gameWindow.getScoreRepository().close();
        }));
    }

}