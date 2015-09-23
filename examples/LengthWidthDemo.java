// Code-Listing 6-6

/**
    This program demos the Rectangle class's setLength, setWidth, getLength, and
    getWidth methods.
*/

public class LengthWidthDemo {
  public static void main(String[] args) {
    // create a Rectangle object
    Rectangle box = new Rectangle();

    // call the object's setLength method, passing 10.0
    box.setLength(10.0);

    // Call the object's setWidth method, passing 20.0
    box.setWidth(20.0);

    // display the object length and width
    System.out.println("The box's length is " + box.getLength());
    System.out.println("The box's width is " + box.getWidth());
  }
}
