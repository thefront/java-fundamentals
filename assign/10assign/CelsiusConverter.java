// Name: Richar Tzeng
// Date: 10/23/2015
// Description: This progarm will use a JFrame and prompt you to enter a
//              temperature in Celsius and then converts it to farenheit.
// Inputs: a number
// Outputs: the number converted into farenheit
//

import javax.swing.*;       // needed for Swing classe
import java.awt.event.*;    // needed for ActionListener Interface


/**
    The CelsiusConverter class displays a JFrame that lets the user enter a
    temperature in Celsius. When the Calculate button is clicked, a JTextField
    will display the converted temperature.
*/

public class CelsiusConverter extends JFrame {
  private JPanel panel;                   // To reference a panel
  private JLabel farenheitLabel;          // To reference a label
  private JTextField celsiusTextField;    // To reference a text field
  private JButton convertButton;          // To reference a button
  private final int WINDOW_WIDTH  = 200;  // Window width in pixels
  private final int WINDOW_HEIGHT = 100;  // Window height in pixels


  /**
      Constructor
  */

  public CelsiusConverter() {
    // Set the window title.
    setTitle("Celsius Converter");

    // Set the size of the window.
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

    // Specify what happens when the close button is clicked
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Build the panel and add it to the frame.
    buildPanel();

    // Add the panel to the frame's content pane.
    add(panel);

    // display the Window
    setVisible(true);
  }


  /**
      The buildPanel method adds a label, a text field, and a button to a panel.
  */

  private void buildPanel() {
    // Create a text field 10 characters wide.
    celsiusTextField = new JTextField(5);

    // Create a button wih the caption "Calculate".
    convertButton = new JButton("Convert");

    // Add an action listener to the button.
    convertButton.addActionListener(new convertButtonListener());

    // Create a JPanel object and let the panel field reference it.
    panel = new JPanel();

    // set Farenheit text
    farenheitLabel = new JLabel("Farenheit: ");

    // Add the label, text field, and button components to the panel.
    panel.add(celsiusTextField);
    panel.add(convertButton);
    panel.add(farenheitLabel);
  }


  /**
      convertButtonListener is an action listener
  */

  private class convertButtonListener implements ActionListener {
    /**
        The actionPerformed method executes when the user clicks on the
        Convert button.
        @param e The event object.
    */

    public void actionPerformed(ActionEvent e) {
      final double CONVERSION = 1.8;
      String input;       // To hold the user's input
      double farenheit;   // temperature in Farenheit

      // Get the text entered by the user in to the text field
      input = celsiusTextField.getText();

      // convert the input to miles
      farenheit = (Double.parseDouble(input) * CONVERSION) + 32.0;

      // assign the value to the new JLabel
      farenheitLabel.setText("Farenheit: " + farenheit + " Degrees");
    }
  }


  /**
      main method
  */

  public static void main(String[] args) {
    new CelsiusConverter();
  }
}
