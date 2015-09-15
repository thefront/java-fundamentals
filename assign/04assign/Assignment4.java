// Name: Richard Tzeng
// Date: 09/14/2015
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
    final int NUMCARDS = 5;           // max 5 cards
    int[] hand = new int[NUMCARDS];   // declare array

    // use getHand method to get the array of cards
    getHand(hand);

    // parse through the different methods to determine hand
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
  }

  /** The getHand method gets the 5 cards for the array
      @param1 pokerHand this is the number of cards to be dealt
  */

  public static void getHand(int pokerHand[]) {
    Scanner input = new Scanner(System.in);
    char tooMany = 'n';


    System.out.println("Enter five numberic cards, no face cards. Use 2-9.");

    for (int i = 0; i < pokerHand.length; i++ ) {
      int cardNum = (i + 1); // declare for below loop
      char checks = 'n';   // declared for card number in 2 and 9

      // use do while loop to test if the card is between 2 and 9
      do {
        System.out.print("Card " + (cardNum) + ": ");
        pokerHand[i] = input.nextInt();

        // test to see if between 2 and 9
        if (2 <= pokerHand[i] && pokerHand[i] <= 9) {
          checks = 'y';
        }
        else {
          System.out.println("Card not between 2 and 9. Enter again.");
        }
      } while (checks == 'n');
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
    // The sum of cardX array needs to equal 2 to have only 2 pair
    int total = countCards(hand);

    // Exaclty 2 positions that equal 1, then there are only 2 pair
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
    // The sum of cardX array needs to equal 3 to have 3 of a kind
    int total = countCards(hand);

    // The sum of cardX array needs to equal 3 to have three of a kind
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
    // declare varialbles
    int minSubScript;
    int minArrayValue;
    boolean answer = false;

    // first loop to go through each index of the array
    for (int i = 0; i < (hand.length - 1); i++) {
      minSubScript = i;
      minArrayValue = hand[i];

      // second loop to compare i value with next value, j
      for (int j = i + 1; j < hand.length; j++) {
        // if the values are equal, then break. Not a straight.
        if (hand[i] == hand[j]) {
          break;
        }
        // else if the next array element is less than element at i
        // then assign next value to the min value and the lowest index is
        // position is at j
        else if (hand[j] < minArrayValue) {
          minArrayValue = hand[j];
          minSubScript = j;
        }
      }

      // after deciding the minimum value, assign min value to position i
      hand[minSubScript] = hand[i];
      hand[i] = minArrayValue;
    }

    // need to loop to compare the values of the array
    for (int z = 0; z < (hand.length - 1); z++) {

      // if current number = (next number - 1), than boolean true, else
      // break and exit method
      if (hand[z] == (hand[z + 1] - 1)) {
        answer = true;
      }
      else {
        break;
      }
    }

    return answer;
  }

  /** The containsFullHouse method checks the array for 1 pair and a three of a
      kind and returns true or false
      @param1 poker hand array
      @return true or false if the array has a full house
  */

  public static boolean containsFullHouse(int hand[]) {
    // The sum of cardX array needs to == 4 to have only 1 pair and a 3 of kind
    int total = countCards(hand);

    // The sum of cardX array needs to equal 4
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
    // The sum of cardX array needs to equal 2 to have only 2 pair
    int total = countCards(hand);

    // The sum of cardX array needs to equal 6 to have four of a kind
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
