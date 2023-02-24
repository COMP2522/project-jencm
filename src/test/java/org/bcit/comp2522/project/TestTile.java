package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTile {
  @Test
  void testGetObstacle() {
    Tile tile = new Tile();
    assertEquals(null, tile.getObstacle());
  }

  @Test
  void testGetTilePos() {
    Tile tile = new Tile();
    assertEquals(0, tile.getTilePos());
  }

  @Test
  void getImage() {
    Tile tile = new Tile();
    assertEquals(null, tile.getImage());
  }
}
