package org.bcit.comp2522.lecture.ll02;

import processing.core.PApplet;

public class Window extends PApplet {

  public static void main(String[] args){
    PApplet.main("org.bcit.comp2522.lecture.ll02.Window");

  }

  @Override
  public void setup(){

    background(255);
  }

  public void settings() {
    size(800, 600);
  }

  @Override
  public void draw(){
    fill(0);
    ellipse(400, 300,50,50);
  }
}