package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

  @Test
  void isCollidingWith() {
    Player player = new Player(100, 300, 30, 30, 4);

    // Test case 1: Player is not colliding with the pipe
    Pipe pipe1 = new Pipe(200, 200, 400, 100, 200, -3);
    assertFalse(player.isCollidingWith(pipe1));

    // Test case 2: Player is colliding with the top part of the pipe
    Pipe pipe2 = new Pipe(100, 0, 200, 100, 200, -3);
    assertTrue(player.isCollidingWith(pipe2));

    // Test case 3: Player is colliding with the bottom part of the pipe
    Pipe pipe3 = new Pipe(100, 400, 600, 100, 200, -3);
    assertTrue(player.isCollidingWith(pipe3));
  }
}