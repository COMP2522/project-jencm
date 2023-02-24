package org.bcit.comp2522.project;

import org.junit.jupiter.api.Test;

public class TestBulletCollection {
  @Test
  void testDraw() {
    BulletCollection bulletCollection = new BulletCollection();
    bulletCollection.draw();
  }

  @Test
  void testMove() {
    BulletCollection bulletCollection = new BulletCollection();
    bulletCollection.move();
  }

  @Test
  void testHit() {
    BulletCollection bulletCollection = new BulletCollection();
    bulletCollection.hit();
  }

  @Test
  void testUsedBullet() {
    BulletCollection bulletCollection = new BulletCollection();
    bulletCollection.usedBullet();
  }

  @Test
  void testCollide() {
    BulletCollection bulletCollection = new BulletCollection();
    bulletCollection.collide();
  }
}
