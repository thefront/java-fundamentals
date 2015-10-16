// Code-Listing 8-8
/**
    This program demonstrates an enumerated type.
*/

public class EnumDemo {
  // Decalre the Day enumerated type.
  enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

  public static void main(String[] args) {
    // Declare a Day variable and assign it a value.
    Day workDay = Day.WEDNESDAY;

    // the following statement displays WEDNESDAY.
    System.out.println(workDay);

    // The following statement displays the ordinal value for Day.SUNDAY, which
    // is 0.
    System.out.println("The ordinal value for " + Day.SUNDAY + " is " +
                        Day.SUNDAY.ordinal());

    // the following statement displays the ordinal value for Day.SATURDAY, which
    // is 6.
    System.out.println("The ordinal value for " + Day.SATURDAY + " is " +
                        Day.SATURDAY.ordinal());

    // The following state compares two enum constants.
    if (Day.FRIDAY.compareTo(Day.MONDAY) > 0) {
      System.out.println(Day.FRIDAY + " is greater than " + Day.MONDAY);
    }
    else {
      System.out.println(Day.FRIDAY + " is NOT greater than " + Day.MONDAY);
    }
  }
}
