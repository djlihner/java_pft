package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

  @Test
  public void testDistance() {
    Point point1 = new Point(1,2);
    Point point2 = new Point(5,5);
    Assert.assertEquals(Point.showDistanse(point1,point2),5.0);
  }
}
