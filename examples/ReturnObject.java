// Code-Listing 8-7

import javax.swing.JOptionPane;

/**
    This program demonstrates how a method can return a reference to an object.
*/

public class ReturnObject {
  public static void main(String[] args) {
    BankAccount account;

    // Get a reference to a BankAccount object
    account = getAccount();

    // display the account's balance
    JOptionPane.showMessageDialog(null, "The account has a balance of $" +
                account.getBalance());

    System.exit(0);
  }

  /**
      The getAccount method creates a BankAccount object with the balance
      specified by the user.
      @return A reference to the object.
  */

  public static BankAccount getAccount() {
    String input;      // to hold input
    double balance;    // Account balance

    // get the balance from the user
    input  = JOptionPane.showInputDialog("Enter " + "the account balance.");
    balance = Double.parseDouble(input);

    // create a BankAccount object and return a reference to it.
    return new BankAccount(balance);
  }
}
