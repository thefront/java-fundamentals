// Code-Listing 7-27

// this program demonstrates how to store BankAccount objects in an ArrayList

import java.util.ArrayList;    // for the ArrayList class

public class ArrayListDemo6 {
  public static void main(String[] args) {
    //create ArrayList to hold bank accounts
    ArrayList<BankAccount> list = new ArrayList<BankAccount>();

    // Add three BankAccount objects to the ArrayList
    list.add(new BankAccount(100.0));
    list.add(new BankAccount(2300.0));
    list.add(new BankAccount(300.0));
    list.add(new BankAccount(1100.0));
    list.add(new BankAccount(1200.0));

    // Display each item
    for (int i = 0; i < list.size(); i++) {
      BankAccount account = list.get(i);
      System.out.println("Account at Index " + i + "\nBalance: " +
                          account.getBalance());
    }
  }
}
