// Code-Listing 6-11

/**
    This program demonstrates the Rectangle class's
    constructor.
*/

public class ConstructorDemo {
  public static void main(String[] args) {
    // create a Rectangle object, passing 5.0 and
    // 15.0 as arguments to the constructor.
    Rectangle box = new Rectangle(5.0, 15.0);

    // display the length
    System.out.println("The box's length is " + box.getLength());

    // display the width
    System.out.println("The box's width is " + box.getWidth());

    // display the area
    System.out.println("The box's area is " + box.getArea());
  }
}
