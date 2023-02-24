package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWindow {
  @Test
  void testBoundary() {
    Window window = new Window();
    assertEquals(0, window.getBoundary());
  }

  @Test
  void testCollide() {
    Window window = new Window();
    assertEquals(false, window.collide());
  }

  @Test
  void testCompareTo() {
    Window window = new Window();
    assertEquals(0, window.compareTo(window));
  }

  @Test
  void testDraw() {
    Window window = new Window();
    window.draw();
  }
}
