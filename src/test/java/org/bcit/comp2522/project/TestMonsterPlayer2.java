package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMonsterPlayer2 {
  @Test
  void testGetHealth() {
    MonsterPlayer2 monsterPlayer2 = new MonsterPlayer2();
    assertEquals(100, monsterPlayer2.getHealth());
  }
}
