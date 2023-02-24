package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMonsterCollection {
  @Test
  void testGetPLayerVal() {
    MonsterCollection monsterCollection = new MonsterCollection();
    assertEquals(0, monsterCollection.getPlayerVal());
  }
}
