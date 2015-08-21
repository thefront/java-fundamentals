// Name: Richard Tzneg
// Date: 08/20/2015
// description: the program will prompt the user to input how many astericks
//              to print out, then print them out. After printing, then then
//              the program will ask whether to repeat the process until n is
//              entered.
//
// Inputs: number of astericks and whether to repeat or not
// Outputs: number of astericks
//

import java.util.Scanner;

public class Assignment1 {
  public static void main(String[] args) {
    // declare variables
    int numAstericks;
    char repeat = 'y';
    Scanner keyboard = new Scanner(System.in);

    // start loop
    while (repeat != 'n') {
      // ask for # of astericks
      System.out.print("How many astericks to print?: ");
      numAstericks = keyboard.nextInt();

      // print the astericks
      for (int i = 0; i < numAstericks; i++) {
        System.out.print('*');
      }

      // ask to go again?
      System.out.print("\nDo you want to play again? [y/n]: ");
      repeat = keyboard.next().charAt(0);
    }
  }
}
