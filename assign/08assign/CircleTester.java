// Name: Richard Tzeng
// Date: 10/12/2015
// Description: This program tests the Circle class. It creates 10 circles
//              and prints their respective information.
// Inputs: none
// Outputs: x and y coordinates, area, radius, and if they overlap

import java.util.*;

public class CircleTester {
  public static void main(String[] args) {
    final int NUM_CIRCLES = 6; // Number of circles

    // create the circle and point objects
    Circle [] circles = new Circle[NUM_CIRCLES];
    Point  [] points  = new Point[NUM_CIRCLES];

    // create the circle x, y, and radius values for the first 5 circles
    double [] xValues   = {10.0, 100.0,   5.0,  -5.0, -1.0, -36.0};
    double [] yValues   = {20.0, 200.0, -10.0, -10.0, 30.0, -50.0};
    double [] radValues = { 5.0,  20.0,  50.0, 100.0, 10.0,  34.0};

    // use loop to create the points
    for (int p = 0; p < points.length; p++ ) {
      points[p] = new Point();
      points[p].setX(xValues[p]);
      points[p].setY(yValues[p]);
    }

    // use set values for 1st 5 circles
    for (int i = 0; i < circles.length; i++) {
      if (i == 1 ) {
        // create circle1 with three arg constructor
        circles[i] = new Circle(xValues[i], yValues[i], radValues[i]);
        System.out.println("Three arg constructor circle: ");
      }
      else if (i == 2) {
        // create circle2 with two arg constructor
        circles[i] = new Circle(points[i], radValues[i]);
        System.out.println("Two arg constructor circle: ");
      }
      else if (i == 3) {
        // create circle3 with copy of previous circle
        circles[i] = new Circle(circles[i - 1]);
        System.out.println("Copy constructor circle: ");
      }
      else if (i == 4) {
        // use point 4 but set x to 1st element of array
        circles[i] = new Circle(points[i], radValues[i]);
        circles[i].setX(xValues[0]);
        System.out.println("Two arg with X valued changed circle: ");
      }
      else if (i == 5) {
        // use point 5 but set y to 1st element of array
        circles[i] = new Circle(points[i], radValues[i]);
        circles[i].setY(yValues[0]);
        System.out.println("Two arg with Y valued changed circle: ");
      }
      else {
        circles[i] = new Circle();
        System.out.println("Default constructor circle: ");
      }
      // print toString
      System.out.println("This is toString: " + circles[i].toString());

      // Does the circle equal the last circle?
      if (i > 0) {
        if (circles[i].equals(circles[i - 1])) {
          System.out.println("Circle " + (i + 1) +
                             " is equal to Circle " + i);
        }
        else {
          System.out.println("Circle " + (i + 1) +
                             " is not equal to Circle " + i);
        }
      }

      System.out.println();
    }

    // display the circle1 x, y, radius, and area
    for (int i = 0; i < circles.length; i++) {
      System.out.println("Circle " + (i + 1) + " x is " + circles[i].getX());
      System.out.println("Circle " + (i + 1) + " y is " + circles[i].getY());
      System.out.println("Circle " + (i + 1) + " radius is " +
                          circles[i].getRadius());
      System.out.print("Circle " + (i + 1));
      System.out.printf(" area is %.2f \n", circles[i].getArea());

      for (int j = (i + 1); j < (circles.length); j++ ) {
        // see if the circles overlap
        if (circles[i].doesOverlap(circles[j])) {
          System.out.println("Circle " + (i + 1) +
                             " overlaps with Circle " + (j + 1));
        }
        else {
          System.out.println("Circle " + (i + 1) +
                             " does NOT overlap Circle " + (j + 1));
        }
      }
      // add extra line
      System.out.println();
    }
  }
}
