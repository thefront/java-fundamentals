// Code-Listing 6-15

/**
    This program simulates the rolling of the dice.
*/

public class DiceDemo {
  public static void main(String[] args) {
    final int DIE1_SIDES = 6;    // Number of the sides for die #1
    final int DIE2_SIDES = 12;   // Number of the sides for die #2
    final int MAX_ROLLS = 5;     // Number of times to roll

    // create two instaces of the Die class
    Die die1 = new Die(DIE1_SIDES);
    Die die2 = new Die(DIE2_SIDES);

    // display the inital state of the die
    System.out.println("This simulates the rolling of a " +
                       DIE1_SIDES + " sided die and a " +
                       DIE2_SIDES + " sided die.");

    System.out.println("Initial vale of the dice: ");
    System.out.println(die1.getValue() + " " + die2.getValue());

    // Roll the dice five times.
    System.out.println("Rolling the dice " + MAX_ROLLS + " times.");

    for (int i = 0; i < MAX_ROLLS; i++) {
      // roll the dice
      die1.roll();
      die2.roll();

      // display the values of the dice.
      System.out.println(die1.getValue() + " " + die2.getValue());
    }
  }
}
