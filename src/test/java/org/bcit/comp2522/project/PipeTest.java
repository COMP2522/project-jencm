package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PipeTest {
  @Test
  void update() {
    Pipe pipe = new Pipe(200, 100, 300, 50, 200, -3);

    pipe.update();
    assertEquals(197, pipe.getX());

    pipe.update();
    assertEquals(194, pipe.getX());
  }
}
