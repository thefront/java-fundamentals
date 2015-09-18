// Code-Listing 7-25

// This program demonstrates an ArrayList

import java.util.ArrayList;    // for the ArrayList class

public class ArrayListDemo3 {
  public static void main (String [] args) {
    // create and ArrayList
    ArrayList<String> nameList = new ArrayList<String>();

    // add some elements to the list
    nameList.add("Wesley");
    nameList.add("Prince");
    nameList.add("Jason");

    // display items and indices
    for (int index = 0; index < nameList.size(); index++) {
      System.out.println("Index: " + index + " Name: " + nameList.get(index));
    }

    System.out.println("Now we are going to remove index 1");
    
    // now remove index 1
    nameList.remove(1);

    // display
    for (int index = 0; index < nameList.size(); index++) {
      System.out.println("Index: " + index + " Name: " + nameList.get(index));
    }
  }
}
