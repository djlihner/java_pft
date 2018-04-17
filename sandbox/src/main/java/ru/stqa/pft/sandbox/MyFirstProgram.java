package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("World");
    hello("Me");
    hello("Day");

    Square square = new Square(5);
    System.out.println("Площадь квадрата со стороной " + square.l + " равна " + square.area());

    Rectangle rectangle = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + rectangle.a + " и " + rectangle.b + " равна " + rectangle.area());

    Point point1 = new Point(3.1,4.4);
    Point point2 = new Point(2.3,5.3);

    System.out.println("Расстояние между двумя точками: " + Point.showDistanse(point1,point2));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

}