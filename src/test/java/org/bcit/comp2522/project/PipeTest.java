package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * This class tests the functions of Pipe
 * this ensures that pipes are rendered correctly,
 * and makes sure to check if the player has passed
 * a certain pipe
 *
 * @author Jaina Jose
 */

public class PipeTest {

  // Test that the constructor initializes the object correctly
  @Test
  public void testConstructor() {
    Pipe pipe = new Pipe(10, 100, 400, 50, 200, 5);
    assertEquals(10, pipe.getX(), 0.01);
    assertEquals(100, pipe.getTopHeight(), 0.01);
    assertEquals(400, pipe.getBottomHeight(), 0.01);
    assertEquals(50, pipe.getWidth());
    assertEquals(200, pipe.getGap(), 0.01);
    assertEquals(false, pipe.isPass());
  }

  // Test that the update method correctly updates the x position
  @Test
  public void testUpdate() {
    Pipe pipe = new Pipe(10, 100, 400, 50, 200, 5);
    pipe.update();
    assertEquals(15, pipe.getX(), 0.01);
  }

  // Test that the setPass method correctly sets the pass variable
  @Test
  public void testSetPass() {
    Pipe pipe = new Pipe(10, 100, 400, 50, 200, 5);
    pipe.setPass(true);
    assertEquals(true, pipe.isPass());
  }

  // Test that all the getters return the correct values
  @Test
  public void testGetters() {
    Pipe pipe = new Pipe(10, 100, 400, 50, 200, 5);
    assertEquals(10, pipe.getX(), 0.01);
    assertEquals(100, pipe.getTopHeight(), 0.01);
    assertEquals(400, pipe.getBottomHeight(), 0.01);
    assertEquals(50, pipe.getWidth());
    assertEquals(200, pipe.getGap(), 0.01);
  }

  // Test that the setPass method correctly sets the pass variable to false
  @Test
  public void testSetPassFalse() {
    Pipe pipe = new Pipe(10, 100, 400, 50, 200, 5);
    pipe.setPass(false);
    assertEquals(false, pipe.isPass());
  }

  // Test that the setPass method correctly sets the pass variable to true
  @Test
  public void testSetPassTrue() {
    Pipe pipe = new Pipe(10, 100, 400, 50, 200, 5);
    pipe.setPass(true);
    assertEquals(true, pipe.isPass());
  }
}

