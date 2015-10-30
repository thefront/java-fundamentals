// Code-Listing 9-5

import javax.swing.JOptionPane;

/**
    This program displays the number of letters, digits, and whitespace
    characters in a string.
*/

public class StringAnalyzer {
  public static void main(String[] args) {
    String input;         // to hold input
    char[] array;         // array for input
    int letters = 0;      // Number of letters
    int digits = 0;       // Number of digits
    int whitespace = 0;   // Number of whitespace

    // Get a string from the user.
    input = JOptionPane.showInputDialog("Enter a string: ");

    // convert the sting to a char array.
    array = input.toCharArray();

    // Analyze the characters
    for (int i = 0; i < array.length; i++) {
      if (Character.isLetter(array[i])) {
        letters++;
      }
      else if (Character.isDigit(array[i])) {
        digits++;
      }
      else if (Character.isWhitespace(array[i])) {
        whitespace++;
      }
    }

    // Display the results
    JOptionPane.showMessageDialog(null, "That string contains " + letters +
                  " letters, " + digits + " digits " + whitespace +
                  " whitespace characters.");

    System.exit(0);
  }
}
