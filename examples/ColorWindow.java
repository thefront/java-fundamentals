// Code-Listing 12-7

import javax.swing.*;     // Needed for Swing classes
import java.awt.*;        // Needed for Color class
import java.awt.event.*;  // Needed for event listener Interface

/**
    This class demonstrates how to set the background color of a panel and the
    foreground color of a label.
*/

public class ColorWindow extends JFrame {
  private JPanel panel;                   // A panel to hold components
  private JLabel messageLabel;            // To reference a label
  private JButton redButton;              // Changes color to red
  private JButton blueButton;             // Changes color to blue
  private JButton yellowButton;           // Changes color to yellow
  private final int WINDOW_WIDTH  = 200;  // Window width in pixels
  private final int WINDOW_HEIGHT = 125;  // Window height in pixels

  /**
      Constructor
  */

  public ColorWindow() {
    // Set the window title.
    setTitle("Colors");

    // Set the size of the window.
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

    // Specify what happens when the close button is clicked
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Create a label to display instructions.
    messageLabel = new JLabel("Click a button to select a color");

    // Create the three buttons
    redButton = new JButton("Red");
    blueButton = new JButton("Blue");
    yellowButton = new JButton("Yellow");

    // Register an event listener with all 3 buttons
    redButton.addActionListener(new RedButtonListener());
    blueButton.addActionListener(new BlueButtonListener());
    yellowButton.addActionListener(new YellowButtonListener());

    // Create a panel and add the components to it.
    panel = new JPanel();
    panel.add(messageLabel);
    panel.add(redButton);
    panel.add(blueButton);
    panel.add(yellowButton);

    // Add the panel to the frame's content pane.
    add(panel);

    // display the Window
    setVisible(true);
  }

  /**
      Private inner class that handles the event when the user clicks the red button.
  */

  private class RedButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      // set the panel's background to red.
      panel.setBackground(Color.RED);

      // set the label's text to bloe.
      messageLabel.setForeground(Color.BLUE);
    }
  }

  /**
      Private inner class that handles the event when the user clicks the yellow button.
  */
  private class YellowButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      // set the panel's background to yellow.
      panel.setBackground(Color.YELLOW);

      // set the label's text to black.
      messageLabel.setForeground(Color.BLACK);
    }
  }

  /**
      Private inner class that handles the event when the user clicks the blue button.
  */

  private class BlueButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      // set the panel's background to blue.
      panel.setBackground(Color.BLUE);

      // set the label's text to yellow.
      messageLabel.setForeground(Color.YELLOW);
    }
  }

  /**
      main method
  */

  public static void main(String[] args) {
    new ColorWindow();
  }
}
