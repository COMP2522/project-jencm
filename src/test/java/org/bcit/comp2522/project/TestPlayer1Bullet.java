package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPlayer1Bullet {
  @Test
  void testGetXpos() {
    Player1Bullet bullet = new Player1Bullet(0, 0);
    assertEquals(0, bullet.getXpos());
  }

  @Test
  void testGetYpos() {
    Player1Bullet bullet = new Player1Bullet(0, 0);
    assertEquals(0, bullet.getYpos());
  }

  @Test
  void testGetColor() {
    Player1Bullet bullet = new Player1Bullet(0, 0);
    assertEquals("red", bullet.getColor());
  }

}
