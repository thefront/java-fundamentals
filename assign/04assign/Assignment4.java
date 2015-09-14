// Name: Richard Tzeng
// Date: 09/13/2015
// Class: CS111B Sec:
// Description: This program prompts the user to input 5 cards from 2 to 9. The
//              program will then tell the user the card hand type. The order of
//              hands from low to high are: high card, pair, two pair, three of
//              a kind, straight, full house, and four of a kind.
//
// Input:   5 integer values between 2 to 9
// Output:  the type of hand
//

import java.util.*;  // used for scanner

public class Assignment4 {
  public static void main (String [] args) {
    final int NUMCARDS = 5;
    int[] hand = new int[NUMCARDS];

    // use do-while loop to play each hand and query user to play again
    do {
      // use getHand method to get the array of cards
      getHand(hand);

      // parse through the different hands and methods to determine hand
      if (containsPair(hand)) {
        System.out.println("Pair!");
      }
      else if (containsTwoPair(hand)) {
        System.out.println("Two Pair!");
      }
      else if (containsThreeOfaKind(hand)) {
        System.out.println("Three of a Kind!");
      }
      else if (containsStraight(hand)) {
        System.out.println("Straight!");
      }
      else if (containsFullHouse(hand)) {
        System.out.println("Full House!");
      }
      else if (containsFourOfaKind(hand)) {
        System.out.println("Four of a Kind!");
      }
      else {
        System.out.println("High Card!");
      }

    } while (playAgain());
  }

  /** The getHand method gets the 5 cards for the array
      @param1 pokerHand this is the number of cards to be dealt
  */

  public static void getHand(int pokerHand[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter five numberic cards, no face cards. Use 2-9.");

    for (int i = 0; i < pokerHand.length; i++ ) {
      System.out.print("Card " + (i + 1) + ": ");
      pokerHand[i] = input.nextInt();
    }
  }

  /** The playAgain method asks the user if they would like to play again.
      @return boolean response
  */

  public static boolean playAgain() {
    Scanner input = new Scanner(System.in);

    System.out.print("Do you want to play again? [y/n]: ");
    char answer = input.next().charAt(0);

    if (answer == 'n' || answer == 'N') {
      return false;
    }
    else {
      return true;
    }
  }

  /** The containsPair method checks the array and returns true or false
      @param1 hand poker hand array
      @return true or false if the array has one pair
  */

  public static boolean containsPair(int hand[]) {
    // The sum of cardX array needs to equal 1 to have only 1 pair
    int total = countCards(hand);

    // now test total and return boolean
    if (total == 1) {
      return true;
    }
    else {
      return false;
    }
  }

  /** The containsTwoPair method checks the array and returns true or false
      @param1 hand poker hand array
      @return true or false if the array has two pair
  */

  public static boolean containsTwoPair(int hand[]) {
    int total = countCards(hand);
    // Exaclty 2 positions that equal 1, then there are only 2 pair

    // now test total == 2 pair and return boolean
    if (total == 2) {
      return true;
    }
    else {
      return false;
    }
  }

  /** The containsThreeOfakind method checks the array and returns true or false
      if the there a three of a kind
      @param1 hand poker hand array
      @return true or false if the array has three of a kind
  */

  public static boolean containsThreeOfaKind(int hand[]) {
    int total = countCards(hand);     // get count of each card in hand

    // The sum of cardX array needs to equal 3 to have three of a kind

    // now test total and return boolean
    if (total == 3) {
      return true;
    }
    else {
      return false;
    }
  }

  /** The containsStraight method checks the array for a straight hand and
      returns true or false
      @param1 poker hand array
      @return true or false if the array is a straight
  */

  public static boolean containsStraight(int hand[]) {
    //for (int a = 1; a < hand.length; a++) {
      //if (hand[a] < hand[a - 1])
    //}
    return false;
  }

  /** The containsPair method checks the array and returns true or false
      @param1 poker hand array
      @return true or false if the array has one pair
  */

  public static boolean containsFullHouse(int hand[]) {
    int total = countCards(hand);     // get count of each card in hand

    // The sum of cardX array needs to equal 3 to have three of a kind

    // now test total and return boolean
    if (total == 4) {
      return true;
    }
    else {
      return false;
    }
  }

  /** The containsFourOfaKind method checks the array and returns true or false
      if the hand is four of a kind
      @param1 hand poker hand array
      @return true or false if the array has four of a kind
  */

  public static boolean containsFourOfaKind(int hand[]) {
    int total = countCards(hand);     // get count of each card in hand

    // The sum of cardX array needs to equal 3 to have three of a kind


    // now test total and return boolean
    if (total == 6) {
      return true;
    }
    else {
      return false;
    }
  }

  /** The countCards method counts the occurrences of each card of the hand and
      returns the sum of the counted cards array
      @ param1 hand the poker hand array
      @ return int sum of the array of the counted cards
  */

  public static int countCards(int hand[]) {
    int [] cardX = new int[5];    // array to hold counts of each card
    int total = 0;                // total sum of the counted cards

    // first loop to go through each card and count matches with each card
    for (int i = 0; i < hand.length; i++) {
      int count = 0;  // reset the count for each card

      // second loop test the match from card i with the next card i + 1
      for (int j = (i + 1); j < hand.length; j++) {

        // if there is a match, increment count, update cardX array at index i
        // with the new count of matches
        if (hand[i] == hand[j]) {
          count++;
          cardX[i] = count;
        }
      }
    }

    // add the vales of each of the counts to get the total
    for (int value: cardX) {
      total += value;
    }

    return total;
  }
}
