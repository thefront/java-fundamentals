// Code-Listing 11-5
import java.io.*;             // For File class and FileNotFoundException
import java.util.*;           // For Scanner and InputMismatchException
import java.text.DecimalFormat;   // For the DecimalFormat class
import javax.swing.JOptionPane;   // For the JOptionPane class

/**
    This program demonstrates how multiple exceptions can be caught with
    one try statement.
*/

public class SalesReport {
  public static void main(String[] args) {
    String fileName = "SalesData.txt";    // File name
    int months = 0;                       // Month counter
    double oneMonth;                      // One month's Sales
    double totalSales = 0.0;              // Total sales
    double averageSales;                  // Average sales

    // Create a DecimalFormat object.
    DecimalFormat dollar = new DecimalFormat("#,##0.00");

    try {
      // Open the file.
      File file = new File(fileName);
      Scanner inputFile = new Scanner(file);

      // Process the contents of the file.
      while (inputFile.hasNext()) {
        // Get a month's sales amount.
        oneMonth = inputFile.nextDouble();

        // Accumulate the amount.
        totalSales += oneMonth;

        // Increment the month counter
        months++;
      }

      // close the file
      inputFile.close();

      // calculate the average.
      averageSales = totalSales / months;

      // Display the results.
      JOptionPane.showMessageDialog(null, "Numbe of months: " + months +
                            "\nTotal Sales: $" + dollar.format(totalSales) +
                            "\nAverage Sales: $" + dollar.format(averageSales));
    }
    catch (FileNotFoundException e){
      // Thrown by the Scanner constructor wehn the file is not found.
      JOptionPane.showMessageDialog(null, "The file " + fileName + " does not exist.");
    }
    catch (InputMismatchException e){
      // Thrown by the Scanner class's nextDouble method when a non-numeric
      // value is found.
      JOptionPane.showMessageDialog(null, "Non-numeric data found in the file.");
    }

    System.exit(0);
  }
}
