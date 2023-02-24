package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPlayerCollection {
  @Test
  void testAddPlayer() {
    PlayerCollection playerCollection = new PlayerCollection();
    playerCollection.addPlayer(new Player());
    assertEquals(1, playerCollection.getPlayers().size());
  }

  @Test
  void testMovePlayer() {
    PlayerCollection playerCollection = new PlayerCollection();
    playerCollection.addPlayer(new Player());
    playerCollection.movePlayer();
    assertEquals(0, playerCollection.getPlayers().get(0).getX());
  }

  @Test
  void TestGetPlayer() {
    PlayerCollection playerCollection = new PlayerCollection();
    playerCollection.addPlayer(new Player());
    assertEquals(0, playerCollection.getPlayer(0).getX());
  }
}
