// Code-Listing 6-17

/**
    Dealer class for the game of Cho-Han
*/

public class Dealer {
  private  int die1Value;  // The valur of die #1
  private  int die2Value;  // The valur of die #2

  /**
      Constructor
  */

  public Dealer() {
    die1Value = 0;
    die2Value = 0;
  }

  /**
      The rollDice method rolls the dice and saves their values.
  */

  public void rollDice() {
    final int SIDES = 6;  // Number of sides for the dice

    // create the two dice.
    Die die1 = new Dice(SIDES);
    Die die2 = new Dice(SIDES);

    // Record their values
    die1Value = die1.getValue();
    die2Value = die2.getValue();
  }

  /**
      The getChoOrHan method returns the results of the dice roll, Cho or Han.
      @return Either "Cho (even)" or "Han (odd)"
  */

  public String getChoOrHan() {
    String results;  // to hold the results

    // Get the sum of the dice.
    int sum = die1Value + die2Value;

    // determine even or odd
    if (sum % 2 == 0) {
      result = "Cho (even)";
    } else {
      result = "Han (odd)";
    }

    // return the result
    return result;
  }

  /**
      The getDieValue method returns the value of die #1
      @return The die1Value field
  */

  public int getDie1Value() {
    return die1Value;
  }

  /**
      The getDieValue method returns the value of die #2
      @return The die2Value field
  */

  public int getDie2Value() {
    return die2Value;
  }
}
