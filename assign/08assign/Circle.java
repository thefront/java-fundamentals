// Name: Richard Tzeng
// Date: 10/13/2015
// Description: class definition of a circle
//

public class Circle {
  private Point  origin;  // variable for center of circle
  private double radius;  // radius instance variable for the circle


  /**
      Two argument constructor.
      param o The center or origin of the circle.
      param r The radius of the circle.
  */

  public Circle(Point o, double r) {
    origin = new Point(o);
    radius = r;
  }


  /**
      Three argument constructor.
      param xValue The x coordinate of the center of the circle.
      param yValue The y coordinate of the center of the circle.
      param r      The radius of the circle.
  */

  public Circle(double xValue, double yValue, double r) {
    origin = new Point(xValue, yValue);
    radius = r;
  }


  /**
      No argument constructor.
      sets x, y to 0.0, 0.0 and radius to 1.0
  */

  public Circle() {
    this(0, 0, 1);
  }


  /**
      Copy constructor.
  */

  public Circle(Circle c) {
    this(c.origin, c.radius);
  }


  /**
      The getOrigin method returns the x and y values
      @return The origin coordinates
  */

  public Point getOrigin() {
    return origin;
  }


  /**
      The setOrigin method sets the origin
      @param p The origin value x, y
  */

  public void setOrigin(Point p) {
    origin = new Point(p);
  }


  /**
      The getX method returns a Circle object's x coordinate.
      @return The value in the x field.
  */

  public double getX() {
    return origin.getX();
  }


  /**
      The setX method stores a value in the length field.
      @param value The value to store in x.
  */

  public void setX(double value) {
    origin.setX(value);
  }


  /**
      The getY method returns a MyCircle object's y coordinate.
      @return The value in the y field.
  */

  public double getY() {
    return origin.getY();
  }


  /**
      The setY method stores a value in the y field.
      @param1 value The value to store in y.
  */

  public void setY(double value) {
    origin.setY(value);
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


  /**
      toString method
      @return A string of the x, y and radius values
  */

  public String toString() {
    // create a string describing the circle
    String str = "X value: " + this.getX() + "  Y value: " + this.getY() +
                 "  Radius: " + this.getRadius();
    // return string
    return str;
  }


  /**
      equals method
      param c The circle to compare with
      @return boolean if the x, y, and radius are equal
  */

  public boolean equals(Circle c) {
    boolean outcome;

    if (this.getOrigin().equals(c.getOrigin()) &&
       (this.getRadius() == c.getRadius())) {
      return outcome = true;
    }
    else {
      return outcome = false;
    }
  }


  /**
      The doesOverlap method returns a whether the called circle object overlaps
      with the other circle parameter
      @param1 otherCircle the other circle to compare to
      @return True or False if the circles overlap
  */

  public boolean doesOverlap(Circle otherCircle) {
    // circles overlap if the sum of the Radius is greater than the distance
    // between the centers of the circles
    double sumRadius   = this.getRadius() + otherCircle.getRadius();

    // dist between centers is sqrt(a^2 + b^2)
    double distCntrs = Math.sqrt(Math.pow(this.getX() - otherCircle.getX(), 2.0)
                       + Math.pow(this.getY() - otherCircle.getY(), 2.0));

    // now check for overlap
    if (sumRadius > distCntrs) {
      return true;
    }
    else {
      return false;
    }
  }
}
