package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double x, double y){
    this.x = x;
    this.y = y;
  }

  public static double distance(Point p1, Point p2) {
    double point1 = (p2.x - p1.x);
    double point2 = (p2.y - p1.y);
    return Math.sqrt(Math.pow(point1,2) + Math.pow(point2,2));
  }

  public static double showDistanse(Point p1, Point p2) {
   return distance(p1, p2);
  }
}
