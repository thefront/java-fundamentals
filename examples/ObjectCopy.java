// Code-Listing 8-11

/**
    This program uses the Stock class's copy method to create a copy of a stk obj.
*/

public class ObjectCopy {
  public static void main(String[] args) {
    // create a Stock ObjectCopy
    Stock company1 = new Stock("XYZ", 9.62);

    // declare a stock varialbe
    Stock company2;

    // make company2 ref a copy of the obj ref by company1
    company2 = company1.copy();

    // Display the contents of both objects
    System.out.println("Company 1:\n" + company1);
    System.out.println();
    System.out.println("Company 2:\n" + company2);

    // Confirm that we actuall have two objects
    if (company1 == company2) {
      System.out.println("The company1 and company2 " +
                          "variables reference the same object.");
    }
    else {
      System.out.println("The company1 and company2 " +
                          "variables reference different objects.");
    }
  }
}
