// Name: Richard Tzeng
// Date: 09/22/2015

/**
    This program demos the Rectangle class's setLength, setWidth, getLength,
    getWidth, and getArea methods.
*/

public class MyCircleTester {
  public static void main(String[] args) {
    // create a Rectangle object
    MyCircle c1 = new MyCircle();
    MyCircle c2 = new MyCircle();

    // set x to 10.0, y to 20.0, radius 5 for circle 1
    c1.setX(10.0);
    c1.setY(20.0);
    c1.setRadius(5.0);

    // set x to 10.0, y to 20.0, radius 5 for circle 1
    c2.setX(100.0);
    c2.setY(200.0);
    c2.setRadius(20.0);


    // display the circle1 x, y, radius, and area
    System.out.println("The c1 x is " + c1.getX());
    System.out.println("The c1 y is " + c1.getY());
    System.out.println("The c1 radius is " + c1.getRadius());
    System.out.println("The c1 area is " + c1.getArea());

    // display the circle2 x, y, radius, and area
    System.out.println("The c2 x is " + c2.getX());
    System.out.println("The c2 y is " + c2.getY());
    System.out.println("The c2 radius is " + c2.getRadius());
    System.out.println("The c2 area is " + c2.getArea());
  }
}
