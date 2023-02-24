package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMonsterPlayer1 {
  @Test
  void testGetHealth() {
    MonsterPlayer1 monsterPlayer1 = new MonsterPlayer1();
    assertEquals(100, monsterPlayer1.getHealth());
  }
}
