// Code-Listing 11-6
import java.io.*;             // For File class and FileNotFoundException
import java.util.*;           // For Scanner and InputMismatchException
import java.text.DecimalFormat;   // For the DecimalFormat class
import javax.swing.JOptionPane;   // For the JOptionPane class

/**
    This program demonstrates how exception handlers can be used to recover from
    errors.
*/

public class SalesReport2 {
  public static void main(String[] args) {
    String fileName = "SalesData.txt";    // File name
    int months = 0;                       // Month counter
    double oneMonth;                      // One month's Sales
    double totalSales = 0.0;              // Total sales
    double averageSales;                  // Average sales

    // Create a DecimalFormat object.
    DecimalFormat dollar = new DecimalFormat("#,##0.00");

    // Attempt to open the file by calling the openFile method.
    Scanner inputFile = openFile(fileName);

    // If the openFile method returned null, then the file was not found.
    // Get a new file name.

    while (inputFile == null) {
      fileName = JOptionPane.showInputDialog("Error: " + fileName +
                          " does not exist.\nEnter another file name:");
      inputFile = openFile(fileName);
    }

    // Process the contents of the file.
    while (inputFile.hasNext()) {
      try {
        // Get a month's sales amount.
        oneMonth = inputFile.nextDouble();

        // Accumulate the amount.
        totalSales += oneMonth;

        // Increment the month counter.
        months++;

      }
      catch (InputMismatchException e){
        // Display an error message.
        JOptionPane.showMessageDialog(null, "Non-numeric data found in the " +
                    " file.\nThe invalid record will be skipped.");

        // Skip past the invalid data.
        inputFile.nextLine();
      }
    }

    // close the file
    inputFile.close();

    // calculate the average.
    averageSales = totalSales / months;

    // Display the results.
    JOptionPane.showMessageDialog(null, "Numbe of months: " + months +
                          "\nTotal Sales: $" + dollar.format(totalSales) +
                          "\nAverage Sales: $" + dollar.format(averageSales));

    System.exit(0);
  }

  /**
      The openFile method opens the specified file and returns a reference to a
      Scanner object.
      @param filename The name of the file to open.
      @return A Scanner reference, if the file exists Otherwise, null is returned.
  */

  public static Scanner openFile(String filename) {
    Scanner scan;

    // Attempt to open the file.
    try {
      File file = new File(filename);
      scan = new Scanner(file);
    }
    catch (FileNotFoundException e) {
      scan = null;
    }

    return scan;
  }
}
