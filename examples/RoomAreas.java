// Code-Listing 6-9

import javax.swing.JOptionPane;

/**
    This program creates 3 instances of the Rectangle class
*/

public class RoomAreas {
  public static void main(String[] args) {
    double number;        // to hold a number
    double totalArea;     // The total area
    String input;         // to hold the user input

    // create 3 Rectangle objects
    Rectangle kitchen = new Rectangle();
    Rectangle bedroom = new Rectangle();
    Rectangle den = new Rectangle();

    // Get and store the dimensions of the kitchen
    input = JOptionPane.showInputDialog("What is the kitchen's length?");

    number = Double.parseDouble(input);
    kitchen.setLength(number);
    input = JOptionPane.showInputDialog("What is the kitchen's width?");

    number = Double.parseDouble(input);
    kitchen.setWidth(number);

    // Get and store the dimensions of the bedroom
    input = JOptionPane.showInputDialog("What is the bedroom's length?");

    number = Double.parseDouble(input);
    bedroom.setLength(number);
    input = JOptionPane.showInputDialog("What is the bedroom's width?");

    number = Double.parseDouble(input);
    bedroom.setWidth(number);

    // Get and store the dimensions of the den
    input = JOptionPane.showInputDialog("What is the den's length?");

    number = Double.parseDouble(input);
    den.setLength(number);
    input = JOptionPane.showInputDialog("What is the den's width?");

    number = Double.parseDouble(input);
    den.setWidth(number);

    // calculate the total area of the rooms
    totalArea = kitchen.getArea() + bedroom.getArea() + den.getArea();

    // display the total area of the rooms
    JOptionPane.showMessageDialog(null, "The total area " + "of the room is " +
                                  totalArea);

    System.exit(0);
  }
}
