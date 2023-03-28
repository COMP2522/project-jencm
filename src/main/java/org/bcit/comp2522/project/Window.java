package org.bcit.comp2522.project;

import javax.swing.*;
import java.awt.*;

public class Window {


  private static final int WINDOW_WIDTH = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
  private static final int WINDOW_HEIGHT = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
  private JFrame f = new JFrame("Flappy Bird Redux");

  private static Window window = new Window();

  public Window(){

  }
}
