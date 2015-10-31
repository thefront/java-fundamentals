// Code-Listing 9-9

/**
    This program demonstrates the DateComponent class.
*/

public class DateTester {
  public static void main(String[] args) {
    String date = "10/26/2015";
    DateComponent dc = new DateComponent(date);

    System.out.println("Here's the date: " + date);
    System.out.println("The month is " + dc.getMonth());
    System.out.println("The day is " + dc.getDay());
    System.out.println("The year is " + dc.getYear());
  }
}
