// Code-Listing 10-34
/**
    DvdMovie class
*/

public class DvdMovie implements RetailItem {
  private String title;       // The DVD's title
  private int runningTime;    // Runing time in minutes
  private double retailPrice; // The DVD's retail price

  /**
      The constructor
      @param dvdTitle The DVD's title
      @param runTime The running time in minutes.
      @param dvdPrice The DVD's price
  */

  public DvdMovie(String dvdTitle, int runTime, double dvdPrice) {
    title = dvdTitle;
    runningTime = runTime;
    retailPrice = dvdPrice;
  }

  /**
      getTitle method
      @return The DVD's Title.
  */

  public String getTitle() {
    return title;
  }

  /**
      getRunningTime method
      @return The running time in minutes.
  */

  public int getRunningTime() {
    return runningTime;
  }

  /**
      getRetailPrice method (Required by the RetailItem interface)
      @return The retail price of the DVD.
  */

  public double getRetailPrice() {
    return retailPrice;
  }
}
