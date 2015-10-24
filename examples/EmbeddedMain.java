// Code-Listing 12-4

import javax.swing.*;    // Needed for Swing classes

/**
    This class defines a GUI window and has its own main method.
*/

public class EmbeddedMain extends JFrame {
  final int WINDOW_WIDTH = 350;    // Window width in pixels
  final int WINDOW_HEIGHT = 250;    // Window height in pixels

  /**
      Constructor
  */

  public EmbeddedMain () {
    // Set the title.
    setTitle("A Simple Window");

    // Set the size of the window.
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

    // Specify what happens when the close button is clicked
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // display the Window
    setVisible(true);
  }

  /**
      This main method creates an instance of the EmbeddedMain class, which
      causes it to display its window.
  */

  public static void main(String[] args) {
    EmbeddedMain em = new EmbeddedMain();
  }
}
