package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class tests the functions of Player,
 * ensures states such as velocity and colliding
 * are accurate
 * @author Jaina Jose
 */

class PlayerTest {

  // Test case to ensure that the player is not colliding with the pipe
  @Test
  void testIsCollidingWithNotColliding() {
    // Initialize the player
    Player player = new Player(100, 300, 30, 30, 4);

    // Initialize the pipe object with position, width, height, and velocity
    Pipe pipe = new Pipe(200, 200, 400, 100, 200, -3);

    // Assert that the player is not colliding with the pipe
    assertFalse(player.isCollidingWith(pipe));
  }

  // Test case to ensure that the player is colliding with the top part of the pipe
  @Test
  void testIsCollidingWithCollidingWithTop() {
    // Initialize the player
    Player player = new Player(100, 300, 30, 30, 4);

    // Initialize the pipe object with position, width, height, and velocity such that
    // the player will collide with the top part of the pipe
    Pipe pipe = new Pipe(100, 0, 200, 100, 200, -3);

    // Assert that the player is colliding with the top part of the pipe
    assertTrue(player.isCollidingWith(pipe));
  }

  // Test case to ensure that the player is colliding with the bottom part of the pipe
  @Test
  void testIsCollidingWithCollidingWithBottom() {
    // Initialize the player
    Player player = new Player(100, 300, 30, 30, 4);

    // Initialize the pipe object with position, width, height, and velocity such that
    // the player will collide with the bottom part of the pipe
    Pipe pipe = new Pipe(100, 400, 600, 100, 200, -3);

    // Assert that the player is colliding with the bottom part of the pipe
    assertTrue(player.isCollidingWith(pipe));
  }

  //Tests for correct velocity when the player jumps
  @Test
  public void testPlayerJump() {
    //Initialize player
    Player player = new Player(100, 200, 50, 50, 5);
    player.jump();

    // Assert that the player's velocity has been set to 9
    assertEquals(9, player.getVelocity(), 0.1f);
  }

  //Checks if player's updated velocity
  @Test
  public void testPlayerUpdateVelocity() {
    // Initialize player
    Player player = new Player(100, 200, 50, 50, 5);

    // Call the update() method to update the position of the player
    player.update();

    // Assert that the velocity of the player has decreased by the gravity value
    assertEquals(-0.6f, player.getVelocity(), 0.1f);
  }

  //Checks player's y position
  @Test
  public void testPlayerUpdatePosition() {
    // Initialize player
    Player player = new Player(100, 200, 50, 50, 5);
    // Get the initial y-coordinate of the player
    float initialY = player.getY();
    // Call the update() method to update the position of the player
    player.update();
    // Assert that the y-coordinate of the player has changed by the velocity value
    assertEquals(initialY + player.getVelocity(), player.getY(), 0.1f);
  }


}