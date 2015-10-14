// Code-Listing 8-9

/**
    This program demonstrates the stock class's toString method
*/

public class StockDemo1 {
  public static void main(String[] args) {
    // create a Stock object for the XYZ Company.
    // The trading symbol is XYZ and the current price
    // per share is $9.62.
    Stock xyzcompany = new Stock ("XYZ", 9.62);

    // Display the object's values
    System.out.println(xyzcompany);
  }
}
