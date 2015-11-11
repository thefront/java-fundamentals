// Code-Listing 10-33
/**
    Compact Disc class
*/

public class CompactDisc implements RetailItem {
  private String title;       // The CD's title
  private String artist;      // The CD's artist
  private double retailPrice; // The CD's retail price

  /**
      The constructor
      @param cdTitle The CD title
      @param cdArtist The name of the artist
      @param cdPrice The CD's price
  */

  public CompactDisc(String cdTitle, String cdArtist, double cdPrice) {
    title = cdTitle;
    artist = cdArtist;
    retailPrice = cdPrice;
  }

  /**
      getTitle method
      @return The CD's Title.
  */

  public String getTitle() {
    return title;
  }

  /**
      getArtist method
      @return The CD's Artist.
  */

  public String getArtist() {
    return artist;
  }

  /**
      getRetailPrice method
      @return The retail price of the CD.
  */

  public double getRetailPrice() {
    return retailPrice;
  }
}
