// Name: Richard Tzeng
// Date: 09/22/2015
// Description: class definition of a circle
//

public class MyCircle {
  private double x;       // x coordinate instance variable
  private double y;       // y coordinate instance variable
  private double radius;  // radius instance variable for the circle

  /**
      The setX method stores a value in the length field.
      @param1 value The value to store in x.
  */

  public void setX(double value) {
    x = value;
  }

  /**
      The getX method returns a MyCirle object's x coordinate.
      @return The value in the x field.
  */

  public double getX() {
    return x;
  }

  /**
      The setY method stores a value in the y field.
      @param1 value The value to store in y.
  */

  public void setY(double value) {
    y = value;
  }

  /**
      The getY method returns a MyCirle object's y coordinate.
      @return The value in the y field.
  */

  public double getY() {
    return y;
  }

  /**
      The setRadius method stores a value in the radius field.
      @param1 value The value to store in radius.
  */

  public void setRadius(double value) {
    radius = value;
  }

  /**
      The getRadius method returns a MyCirle object's radius.
      @return The value in the radius field.
  */

  public double getRadius() {
    return radius;
  }

  /**
      The getArea method returns a MyCirle object's area.
      @return The product of PI times radius squared.
  */

  public double getArea() {
    return 3.14 * Math.pow(radius, 2.0);
  }

  //public boolean doesOverlap(MyCircle, otherCircle) {

  //}
}
