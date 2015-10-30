// Code-Listing 9-4

import java.util.Scanner;

/**
    This program uses the startsWith method to search using a partial string.
*/

public class PersonSearch {
  public static void main(String[] args) {
    String lookUp;  // to hold a lookup string

    // create and array of names.
    String[] people = { "Cushaw, Will", "Davis, George",
                        "Marone, Garrett", "Russert, Phil",
                        "Davis, Jenny", "Setzer, Charles",
                        "Smathers, Holly", "Smith, Charles",
                        "Smith, Brad", "Williams, Jean"};

    // create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Get a partial name to search for.
    System.out.print("Enter the first few characters of the last name to " +
                       "lookup: ");
    lookUp = keyboard.nextLine();

    // Display all of the names that begin with the string entered by the user.
    System.out.println("Here are the names that match:");
    for (String person : people) {
      if (person.startsWith(lookUp)) {
        System.out.println(person);
      }
    }
  }
}
