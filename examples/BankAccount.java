// Code-Listing 6-20

/**
    The BankAccount class simulates a bank account.
*/

public class BankAccount {
  private double balance;      // Account balance

  /**
      This constructor sets the starting balance at 0.0/
  */

  public BankAccount() {
    balance = 0.0;
  }

  /**
      This constructor sets the starting balance to the value passes as an argument.
      @param startBalance The starting balance.
  */

  public BankAccount(double startBalance) throws NegativeStartingBalance {
    if (startBalance < 0) {
      throw new NegativeStartingBalance(startBalance);
    }

    balance = startBalance;
  }

  /**
      This constructor sets the starting balance to the value in the string argument.
  */

  public BankAccount(String str) {
    balance = Double.parseDouble(str);
  }

  /**
      The deposit method makes a deposit into the account.
      @param amount The amount to add to the balance field.
  */

  public void deposit(double amount) {
    balance += amount;
  }

  /**
      The deposit method makes a deposit into the account.
      @param str The amount to add to the balance field.
  */

  public void deposit(String str) {
    balance += Double.parseDouble(str);
  }

  /**
      The withdraw method withdraws an amount from the account.
      @param amount The amount to subtract from the balance field.
  */

  public void withdraw(double amount) {
    balance -= amount;
  }

  /**
      The withdraw method withdraws an amount from the account.
      @param str The amount to subtract from the balance field.
  */

  public void withdraw(String str) {
    balance -= Double.parseDouble(str);
  }

  /**
      The setBalance method sets the account balance.
      @param b The value to store in the balance field.
  */

  public void setBalance(double b) {
    balance = b;
  }

  /**
      The setBalance method sets the account balance.
      @param str The value to store in the balance field.
  */

  public void setBalance(String b) {
    balance = Double.parseDouble(b);
  }

  /**
      The getBalance method returns the account balance.
      @return The value in the balance field.
  */

  public double getBalance() {
    return balance;
  }
}
