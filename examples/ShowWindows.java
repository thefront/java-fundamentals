// Code-Listing 12-1

import javax.swing.*;    // Needed for Swing classes

/**
    This program displays a simple window with a title. The application exits
    when the user clicks the close button.
*/

public class ShowWindows {
  public static void main(String[] args) {
    final int WINDOW_WIDTH = 350;    // Window width in pixels
    final int WINDOW_HEIGHT = 250;    // Window height in pixels

    // create a Window.
    JFrame window = new JFrame();

    // Set the title.
    window.setTitle("A Simple Window");

    // Set the size of the window.
    window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

    // Specify what happens when the close button is clicked
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // display the Window
    window.setVisible(true);
  }
}
