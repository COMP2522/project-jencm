package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestObstacles {
  @Test
  void testObstacleXPos() {
    Obstacle obstacle = new Obstacle();
    assertEquals(0, obstacle.getX());
  }

  @Test
  void testObstacleYPos() {
    Obstacle obstacle = new Obstacle();
    assertEquals(0, obstacle.getY());
  }

  @Test
  void testMove() {
    Obstacle obstacle = new Obstacle();
    obstacle.move();
    assertEquals(0, obstacle.getX());
  }
}
