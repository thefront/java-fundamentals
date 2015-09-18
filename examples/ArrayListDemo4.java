// Code-Listing 7-26

// This program demonstrates inserting an item to an ArrayList

import java.util.ArrayList;    // for the ArrayList class

public class ArrayListDemo4 {
  public static void main (String [] args) {
    // create ArrayList
    ArrayList<String> nameList = new ArrayList<String>(5);

    // add items
    nameList.add("Jay");
    nameList.add("James");
    nameList.add("Jayne");

    // print the ArrayList
    for (int i = 0; i < nameList.size(); i++) {
      System.out.println("Index: " + i + " Name: " + nameList.get(i));
    }

    System.out.println("Now we are going to insert a value.");

    // insert item
    for (int i = 0; i < 15; i++) {
      nameList.add(1, "Json" + i);
    }

    for (int i = 0; i < nameList.size(); i++) {
      System.out.println("Index: " + i + " Name: " + nameList.get(i));
    }
  }
}
