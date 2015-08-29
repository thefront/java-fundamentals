// Name: Richard Tzeng
// Date: Aug 28, 2015
// Description: A command line game of a simplified version of Blackjack.
//              This game has no Aces and your do not play against the dealer.
//              The program should generate random number between 1 and 10 each
//              time the player gets a card. It should keep a running total of
//              the players cards, and ask the player whether or not it should
//              deal another card.
// Input:   yes or no to program prompts
// Output:  cards, total hand, bust or win
//

import java.util.*;

public class BlackjackGame {
  public static void main(String [] args) {
    // declare initial variables
    int card1;                // first card
    int cardN;                // next card
    int total;                // total hand
    char repeat = 'y';        // play again response
    char hit = 'y';           // deal another card response
    Scanner keyIn = new Scanner(System.in);   // Scanner for keyboard input
    Random randomNum = new Random();          // Random class to gen numbers

    //System.out.println("Let's play a simple Blackjack game!");

    // outer loop to deal and to play again
    while (repeat != 'n') {

      // generate cards, total and print
      // need to add 1 since random class starts at 0
      card1 = randomNum.nextInt(10) + 1;
      cardN = randomNum.nextInt(10) + 1;
      total = card1 + cardN;
      System.out.println("> First cards: " + card1 + ", " + cardN);
      System.out.println("> Total: " + total);

      // inner hit loop to see if player wants another card
      while (hit != 'n') {
        System.out.print("> Do you want another card? (y/n): ");
        hit = keyIn.next().charAt(0);         // assign hit to player decision

        // outcome of hit decision
        if (hit == 'Y' || hit == 'y') {

          // generate new card, add to total, print new card and total
          cardN = randomNum.nextInt(10) + 1;
          System.out.println("> Card: " + cardN);
          total += cardN;
          System.out.println("> Total: " + total);

          // check total if it's > 21, bust or = 21 win!
          if (total > 21) {
            System.out.println("> Bust.");
            hit = 'n'; // needed to break out to hit loop
          }
          if (total == 21) {
            System.out.println("> You win!");
            hit = 'n'; // needed to break out to hit loop
          }
        }
        else if ( hit == 'n' || hit == 'N') {
          hit = 'n';  // might not be needed, but assigning to lower case n
        }
        else {
          // address if player enters some crazy answer, just repeats hit loop
          System.out.println("> I didn't understand your response!");
        }
      }

      // Play again decision clause
      System.out.print("> Would you like to play again? (y/n): ");
      repeat = keyIn.next().charAt(0);

      if (repeat == 'y' || repeat == 'Y') {
        hit = 'y';      // reset hit response
        repeat = 'y';   // reset repeat in case is upper case
        System.out.println();
      }
      else if (repeat == 'n' || repeat == 'N') {
        repeat = 'n';   // reset repeat in case is upper case
      }
      else {
        // address if player enters some crazy answer, just exit
        System.out.println("> I didn't understand, exiting!");
      }
    }
  }
}
