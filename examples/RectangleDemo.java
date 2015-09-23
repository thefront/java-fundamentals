// Code-Listing 6-8

/**
    This program demos the Rectangle class's setLength, setWidth, getLength,
    getWidth, and getArea methods.
*/

public class RectangleDemo {
  public static void main(String[] args) {
    // create a Rectangle object
    Rectangle box = new Rectangle();

    // set length to 10.0 and width to 20.0
    box.setLength(10.0);
    box.setWidth(20.0);

    // display the object length, width and area
    System.out.println("The box's length is " + box.getLength());
    System.out.println("The box's width is " + box.getWidth());
    System.out.println("The box's area is " + box.getArea());
  }
}
