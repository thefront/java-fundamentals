// Code-Listing 6-19
import java.util.Scanner;

public class ChoHan {
  public static void main(String[] args) {

    final int MAX_ROUNDS = 5;  // Number of rounds
    String player1Name;        // First player's name
    String player2Name;        // First player's name

    // create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Get the player's names.
    System.out.print("Enter the first player's name: ");
    player1Name = keyboard.nextLine();
    System.out.print("Enter the first player's name: ");
    player2Name = keyboard.nextLine();

    // create th dealer
    Dealer dealer = new Dealer();

    // create the two players
    Player player1 = new Player(player1Name);
    Player player2 = new Player(player2Name);

    // Play the rounds
    for (int round = 0; round < MAX_ROUNDS; round++) {
      System.out.println("-----------------------------------");
      System.out.printf("Now playing round %d. \n", round + 1);

      // roll the dice.
      dealer.rollDice();

      // The players make their guesses
      player1.makeGuess();
      player2.makeGuess();

      // determince the winner of this round
      roundResults(dealer, player1, player2);
    }

    // display the grand winner.
    displayGrandWinner(player1, player2);
  }

  /**
      The roundResults method determines the results of the current round.
      @param dealer The Dealer object
      @param player1 Player #1 object
      @param player2 Player #2 object
  */

  public static void roundResults(Dealer dealer, Player player1, Player player2) {
    // Show the dice values.
    System.out.printf("The dealer rolled %d and %d. \n",
                       dealer.getDie1Value(), dealer.getDie2Value());
    System.out.printf("Result: %s\n", dealer.getChoOrHan());

    // check each player's guess and award points
    checkGuess(player1, dealer);
    checkGuess(player2, dealer);
  }

  /**
      The checkGuess method checks a player's guess against the dealer's result.
      @param player The Player object to check.
      @param dealer The Dealer object.
  */

  public static void checkGuess(Player player, Dealer dealer) {
    final int POINT_TO_ADD = 1;          // Points to aware winner
    String guess = player.getGuess();    // player's guess
    String choHanResult = dealer.getChoOrHan();  // Cho or Han

    // display the player's guess.
    System.out.printf("The player %s guessed %s.\n", player.getName(),
                       player.getGuess());

    // Award points if the player guessed correctly.
    if (guess.equalsIgnoreCase(choHanResult)) {
      player.addPoints(POINT_TO_ADD);
      System.out.printf("Awarding %d point(s) to %s.\n", POINT_TO_ADD,
                         player.getName());
    }
  }

  /**
      The displayGrandWinner method displays the games' grand winner.
      @param player1 Player #1
      @param player2 Player #2
  */

  public static void displayGrandWinner(Player player1, Player player2) {
    System.out.println("-----------------------------");
    System.out.println("Game over. Here are the results: ");
    System.out.printf("%s %d points. \n", player1.getName(), player1.getPoints());
    System.out.printf("%s %d points. \n", player2.getName(), player2.getPoints());

    if (player1.getPoints() > player2.getPoints()) {
      System.out.println(player1.getName() + " is the grand winner!");
    }
    else if (player2.getPoints() > player1.getPoints()) {
      System.out.println(player2.getName() + " is the grand winner!");
    }
    else {
      System.out.println("Both players are tied!");
    }
  }
}
