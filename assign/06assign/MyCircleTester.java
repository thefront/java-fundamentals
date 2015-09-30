// Name: Richard Tzeng
// Date: 09/22/2015
// Description: This program tests the MyCircle class. It creates 10 circles
//              and prints their respective information.
// Inputs: none
// Outputs: x and y coordinates, area, radius, and if they overlap

import java.util.*;

public class MyCircleTester {
  public static void main(String[] args) {
    final int NUM_CIRCLES = 10; // Number of circles

    // create the circle objects
    MyCircle[] circles = new MyCircle[NUM_CIRCLES];

    // create the circle x, y, and radius values for the first 5 circles
    double [] xValues   = {10.0, 100.0,   5.0,  -5.0, -1.0};
    double [] yValues   = {20.0, 200.0, -10.0, -10.0, 30.0};
    double [] radValues = { 5.0,  20.0,  50.0, 100.0, 10.0};
    Random randomValue = new Random();

    // use set values for 1st 5 circles
    for (int i = 0; i < (circles.length / 2); i++) {
      circles[i] = new MyCircle();
      circles[i].setX(xValues[i]);
      circles[i].setY(yValues[i]);
      circles[i].setRadius(radValues[i]);
    }

    // use random numbers for last 5 circles
    for (int z = (circles.length / 2); z < circles.length; z++) {
      circles[z] = new MyCircle();
      circles[z].setX(randomValue.nextDouble() * 100.0);
      circles[z].setY(randomValue.nextDouble() * 100.0);
      circles[z].setRadius(randomValue.nextDouble() * 100.0);
    }

    // display the circle1 x, y, radius, and area
    for (int i = 0; i < circles.length; i++) {
      System.out.println("The Circle " + (i + 1) + " x is " + circles[i].getX());
      System.out.println("The Circle " + (i + 1) + " y is " + circles[i].getY());
      System.out.println("The Circle " + (i + 1) + " radius is " +
                          circles[i].getRadius());
      System.out.println("The Circle " + (i + 1) + " area is " +
                          circles[i].getArea());

      for (int j = (i + 1); j < (circles.length); j++ ) {
        // see if the circles overlap
        if (circles[i].doesOverlap(circles[j])) {
          System.out.println("Circle " + (i + 1) + " overlaps with Circle " + (j + 1));
        }
        else {
          System.out.println("Circle " + (i + 1) + " does NOT overlap Circle " + (j + 1));
        }
      }
      // add extra line
      System.out.println();
    }
  }
}
