// Code-Listing 7-24

// this program demonstrates how the enhanced for loop can be used with an
// arraylist

import java.util.ArrayList;   // used for the ArrayList class

public  class ArrayListDemo2 {
  public static void main (String [] args) {
    // create ArrayList
    ArrayList<String> nameList = new ArrayList<String>();

    // add elements to the arraylist
    nameList.add("Garrett");
    nameList.add("Surekea");
    nameList.add("Micheal");

    // Print out the arraylist size
    System.out.println("This array is " + nameList.size() + " objects large.");

    // loop to print the values
    for (String value: nameList) {
      System.out.println(value);
    }
  }
}
