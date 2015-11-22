// Code-Listing 11-8
import java.io.*;     // For the File class and the FileNotFoundException
import java.util.*;   // For Scanner and InputMismatchException

/**
    This program demonstrates how multiple exceptions can be caught with a
    single catch clause.
*/

public class MultiCatch {
  public static void main(String[] args) {
    int number;       // to hold a number from the file.

    try {
      // open the file.
      File file = new File("Numbers.txt");
      Scanner inputFile = new Scanner(file);

      // process the contents of the file.
      while (inputFile.hasNext()) {
        // Get a number from the file
        number = inputFile.nextInt();

        // display the number.
        System.out.println(number);
      }

      // close the file
      inputFile.close();
    }
    catch(FileNotFoundException | InputMismatchException ex) {
      // display an error message
      System.out.println("Error processing the file.");
    }
  }
}
