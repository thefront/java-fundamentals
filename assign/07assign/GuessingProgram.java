// Name: Richard Tzeng
// Date: 10-05-2015
// Description: This program is a number guessing game. It uses the
//              NumberGuesser class to adjust the guessing values based on the
//              user's response. It also uses the binary search algorithm. To
//              guess the right value.
//
// Inputs: none
// Outputs: prompts user if the number is higher (h), lower(l), or correct(c)
//          prompts user if they want to play again
//

import java.util.*;

public class GuessingProgram {

  /** This is the main method that loops through the game and prompts to play
      again or not.
  */

  public static void main(String[] args) {
    // create game object
    NumberGuesser game = new NumberGuesser(1, 100);

    // start guessing loop
    do {
      playOneGame(game);              // start one game with the game object
    } while (shouldPlayAgain(game));  // play again and reset the game
  }


  /** This method prompts the user whether to play again or not.
      @return true for play again, false for end
  */

  public static boolean shouldPlayAgain(NumberGuesser oneGame) {
    boolean playAgain;
    Scanner input = new Scanner(System.in);

    System.out.print("Do you want to play again? [y/n]: ");
    char answer = input.next().charAt(0);

    if (answer == 'y' || answer == 'Y') {
      playAgain = true;
      oneGame.reset();      // resets the game back to original values
    }
    else if (answer == 'n' || answer == 'N') {
      playAgain = false;
      System.out.println("Good Bye.");
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

  public static void playOneGame (NumberGuesser mainGame) {
    // define default variables
    char guessAgain = 'y';

    System.out.println("Think of a number between 1 and 100.");

    // loop between response to guess and get midpoint to narrow the guess
    do {
      guessAgain = getUserResponseToGuess(mainGame.getCurrentGuess());

      if (guessAgain == 'l' || guessAgain == 'L') {
        // calls lower to assign guess to high int
        mainGame.lower();
      }
      else if (guessAgain == 'h' || guessAgain == 'H') {
        // calls higher to assign guess to low int
        mainGame.higher();
      }
      else if (guessAgain == 'c' || guessAgain == 'C') {
        // c or C ends the loop and prints the pick.
        System.out.println("You picked " + mainGame.getCurrentGuess() + "?" +
                            " Great pick!");
      }
      else {
        // If the input is gargage, ask again
        System.out.println("I didn't understand your response.");
      }
    } while (guessAgain != 'c');
  }


  /** This method prompts the user to reveal that the number is higher, lower,
      or the correct number.
      @param1 guess the computer's guess from the object's method
      @return the character answer response, l/h/c
  */

  public static char getUserResponseToGuess (int guess) {
    System.out.print("Is it " + guess + "? (h/l/c): ");
    Scanner input = new Scanner(System.in);
    char answer = input.next().charAt(0);
    return answer;
  }
}
