// Name: Richard Tzeng
// Date: Aug 28, 2015
// Description: A command line game of a simplified version of Blackjack.
//              This game has no Aces and your do not play against the dealer.
//              The program should generate random number between 1 and 10 each
//              time the player gets a card. It should keep a running total of
//              the players cards, and ask the player whether or not it should
//              deal another card.
//              This adds a dealer to the game.
//                1) Dealers must take more cards as long as their total is less
//                   than 17.
//                2) If the player and dealer tie it is called a push. The
//                   player does not win or lose money.
// Input:   yes or no to program prompts
// Output:  cards, total hand, bust or win
//

import java.util.*;

public class BlackjackGameDealer {
  public static void main(String [] args) {
    // declare initial variables
    int dealer1, dealerN;     // dealer first and Nth cards
    int dealerTotal, total;   // dealer and player totals
    int card1, cardN;         // player first and Nth card
    char repeat ='y';         // play again response
    char hit = 'y';           // deal another card response
    char win = 'n';           // player wins
    char bust = 'n';          // player loses
    Scanner keyIn = new Scanner(System.in);   // Scanner for keyboard input
    Random randomNum = new Random();          // Random class to gen numbers

    System.out.println("Let's play a simple Blackjack game with a dealer!");

    // outer loop to deal and to play again
    do {
      // generate cards, total and print
      // need to add 1 since random class starts at 0
      dealer1 = randomNum.nextInt(10) + 1;
      card1 = randomNum.nextInt(10) + 1;
      cardN = randomNum.nextInt(10) + 1;
      total = card1 + cardN;
      System.out.println("> The dealer starts with: " + dealer1);
      System.out.println("> Your first cards: " + card1 + ", " + cardN);
      System.out.println("> Total: " + total);

      // inner hit loop to see if player wants another card
      do {
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
            hit = 'n';  // needed to break out to hit loop
            bust = 'y'; // set bust to yes to skip dealer
          }
          if (total == 21) {
            System.out.println("> You win!");
            hit = 'n';  // needed to break out to hit loop
            win = 'y';  // set win to yes to skip dealer
          }
        }
        else if ( hit == 'n' || hit == 'N') {
          hit = 'n';  // might not be needed, but assigning to lower case n
        }
        else {
          // address if player enters some crazy answer, just repeats hit loop
          System.out.println("> I didn't understand your response!");
        }
      } while (hit != 'n');  // post test condition

      // if player busts or wins, skip to play again
      if (bust != 'y' || win != 'y') {
      System.out.println("> The dealer started with: " + dealer1 + "...");
      dealerTotal = dealer1; // assing dealer's total to first card

        // loop for dealer's cards, post test because dealer needs 2nd card
        do {
          // get dealers new cards
          dealerN = randomNum.nextInt(10) + 1;
          dealerTotal += dealerN;
          System.out.println("> Dealer gets a " + dealerN);
          System.out.println("> Total: " + dealerTotal);
        } while (dealerTotal < 17);

        // conditions for win or lose
        if (dealerTotal > 21) {
          System.out.println("> Dealer busts! You win!");
        }
        else if (dealerTotal == total) {
          System.out.println("> Push.");
        }
        else if (dealerTotal < total) {
          System.out.println("> You win!");
        }
        else {
          System.out.println ("> You lost!");
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
        repeat = 'n';
      }
    } while (repeat != 'n');
  }
}
