// Code-Listing 8-8

/**
    The Stock class holds data about a stock.
*/

public class Stock {
  private String symbol;      // Trading symbol of stock
  private double sharePrice;  // Current price per share

  /**
      Constructor
      @param sym The stock's trading symbol
      @param price The stock's share price
  */

  public Stock(String sym, double price) {
    symbol = sym;
    sharePrice = price;
  }

  /**
      another constructor using this
  */

  public Stock(String sym) {
    this(sym, 0.0);
  }

  /**
      Copy constructor
  */

  public Stock(Stock object2) {
    symbol = object2.symbol;
    sharePrice = object2.sharePrice;
  }

  /**
      getSymbol method
      @return The stock's trading symbol
  */

  public String getSymbol() {
    return symbol;
  }

  /**
      getSharePrice method
  */

  public double getSharePrice() {
    return sharePrice;
  }

  /**
      toString method
      @return A string indicating the object's trading symbol and share price.
  */

  public String toString() {
    // Create a string describing the stock.
    String str = "Trading symbol: " + symbol + "\nShare price: " + sharePrice;

    // return the string
    return str;
  }

  public boolean equals(Stock object2) {
    boolean status;

    // determine whetehr this object's symbol and sharePrice fields are equal to
    // object2's symbol and sharePrice
    if (symbol.equals(object2.symbol) &&
       sharePrice == object2.sharePrice) {
       status = true;   // yes, the objects are equal
    }
    else
      status = false;   // no, the objects are not equal

    return status;
  }

  public Stock copy() {
    // create a new stock ojbect and initialize it with the same data held by
    // the calling object.
    Stock copyObject = new Stock(symbol, sharePrice);

    // return a reference to the new object
    return copyObject;
  }

}
