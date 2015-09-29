// Name: Richard Tzeng
// Date: 09/28/2015
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
      The getX method returns a MyCircle object's x coordinate.
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
      The getY method returns a MyCircle object's y coordinate.
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
      The getRadius method returns a MyCircle object's radius.
      @return The value in the radius field.
  */

  public double getRadius() {
    return radius;
  }

  /**
      The getArea method returns a MyCircle object's area.
      @return The product of PI times radius squared.
  */

  public double getArea() {
    return Math.PI * Math.pow(radius, 2.0);
  }

  public boolean doesOverlap(MyCircle otherCircle) {
    // circles overlap if the sum of the Radius is greater than the distance
    // between the centers of the circles
    double sumRadius   = getRadius() + otherCircle.getRadius();

    // dist between centers is sqrt(a^2 + b^2)
    double distCenters = Math.sqrt(Math.pow(getX() + otherCircle.getX(), 2.0) +
                                   Math.pow(getY() + otherCircle.getY(), 2.0) );

    if (sumRadius > distCenters) {
      return true;
    }
    else {
      return false;
    }
  }
}
