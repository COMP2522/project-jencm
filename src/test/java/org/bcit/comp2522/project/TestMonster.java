package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;

public class TestMonster {
  @Test
  void testMove() {
    Monster monster = new Monster();
    monster.move();
  }

  @Test
  void testCollide() {
    Monster monster = new Monster();
    monster.collide();
  }

  @Test
  void testAttack() {
    Monster monster = new Monster();
    monster.attack();
  }

  @Test
  void testShoot() {
    Monster monster = new Monster();
    monster.shoot();
  }
}
