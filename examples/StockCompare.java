// Code-Listing 8-10

/**
    This program uses the Stock class's equals method to compare two Stock objs.
*/

public class StockCompare {
  public static void main(String[] args) {
    // create two stock objects with the same values
    Stock company1 = new Stock("XYZ", 9.62);
    Stock company2 = new Stock("XYZ", 9.62);

    // use the equals method to compare the objects
    if (company1.equals(company2)) {
      System.out.println("Both objects are the same.");
    }
    else {
      System.out.println("The objects are different");
    }
  }
}
