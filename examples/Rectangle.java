// Code-Listing 6-2
// Code-Listing 6-4
// Code-Listing 6-5
// Code-Listing 6-7

/**
    Rectangle class, phase 4
    Under Construction!
*/

public class Rectangle {
  private double length;
  private double width;

  /**
      Constructor
      @param len The length of the Rectangle
      @param w The width of the Rectangle
  */

  public Rectangle(double len, double w) {
    length = len;
    width  = w;
  }
  
  /**
      The setLength method stores a value in the length field.
      @param1 len The value to store in length.
  */

  public void setLength(double len) {
    length = len;
  }

  /**
      The setWidth method stores a value in the width field.
      @param1 w The value to store in width.
  */

  public void setWidth(double w) {
    width = w;
  }

  /**
      The getLength method returns a Rectangle object's length.
      @return The value in the length field.
  */

  public double getLength() {
    return length;
  }

  /**
      The getWidth method returns a Rectangle object's width.
      @return The value in the width field.
  */

  public double getWidth() {
    return width;
  }

  /**
      The getArea method returns a Rectangle object's area.
      @return The product of length times width.
  */

  public double getArea() {
    return length * width;
  }

}
