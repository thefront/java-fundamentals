// Name: Richard Tzeng
// Date: 09-03-2015
// Description: This program is a number guessing game. It heavily uses java
//              methods. It also uses the binary search algorithm.
//
// Inputs: none
// Outputs: prompts user if the number is higher (h), lower(l), or correct(c)
//          prompts user if they want to play again
//

import java.util.*;

public class NumberGuess {

  /** This is the main method that loops through the game and prompts to play
      again or not.
  */

  public static void main(String[] args) {
    do {
      playOneGame();
    } while (shouldPlayAgain());
  }


  /** This method prompts the user whether to play again or not.
      @return true for play again, false for end
  */

  public static boolean shouldPlayAgain() {
    boolean playAgain;
    Scanner input = new Scanner(System.in);

    System.out.print("Great! do you want to play again? [y/n]: ");
    char answer = input.next().charAt(0);

    if (answer == 'y' || answer == 'Y') {
      playAgain = true;
    }
    else if (answer == 'n' || answer == 'N') {
      playAgain = false;
    }
    else {
      // if we don't understand user, exit the game
      System.out.println("I didn't understand your response. Exiting.");
      playAgain = false;
    }

    return playAgain;
  }


  /** This method plays the actual game. It passes values to get responses and
      based on the users response, determines the next guest. This is not a
      value returning method.
  */

  public static void playOneGame () {
    // define default variables
    int low  = 0,
        high = 100,
        middle = 50;
    char guessAgain = 'y';

    System.out.println("Guess a number between 1 and 100.");

    // loop between response to guess and get midpoint to narrow the guess
    do {
      guessAgain = getUserResponseToGuess(middle);

      if (guessAgain == 'l' || guessAgain == 'L') {
        // assigns guess to high int to narrow down and gets new average
        high = middle;
        middle = getMidPoint(low, high);
      }
      else if (guessAgain == 'h' || guessAgain == 'H') {
        // assigns guess to low int to narrow down and gets new average
        low = middle;
        middle = getMidPoint(low, high);
      }
      else if (guessAgain == 'c' || guessAgain == 'C') {
        // c or C ends the loop
        continue;
      }
      else {
        // If the input is gargage, ask again
        System.out.println("I didn't understand your response.");
      }
    } while (guessAgain != 'c');
  }


  /** This method prompts the user to reveal that the number is higher, lower,
      or the correct number.
      @param1 guess the computer's guess
      @return the character answer response, l/h/c
  */

  public static char getUserResponseToGuess (int guess) {
    System.out.print("Is it " + guess + "? (h/l/c): ");
    Scanner input = new Scanner(System.in);
    char answer = input.next().charAt(0);
    return answer;
  }


  /** This method calculates the midpoint between the high and low limits.
      @param1 lowInt  the lower integer number
      @param2 highInt the higher integer number
      @return result  the average of the 2 integer numbers
  */

  public static int getMidPoint(int lowInt, int highInt) {
    // declare a variabe called result as double and cast to integer
    double result = (lowInt + highInt) / 2.0;
    return (int)result;
  }
}
