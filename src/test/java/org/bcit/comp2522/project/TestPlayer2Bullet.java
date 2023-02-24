package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPlayer2Bullet {
  @Test
  void testMove() {
    Player2Bullet bullet = new Player2Bullet(0, 0, 0, 0);
    bullet.move();
    assertEquals(0, bullet.getY());
  }

  @Test
  void testCollide() {
    Player2Bullet bullet = new Player2Bullet(0, 0, 0, 0);
    bullet.collide();
    assertEquals(false, bullet.getVisible());
  }
}
