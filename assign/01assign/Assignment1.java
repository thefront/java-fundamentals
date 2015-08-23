// Name: Richard Tzneg
// Date: 08/21/2015
// description: the program will prompt the user to input how many astericks
//              to print out, then print them out. After printing, then then
//              the program will ask whether to repeat the process until n is
//              entered.
//
// Inputs: number of astericks and whether to repeat or not
// Outputs: number of astericks
//

// import Scanner to prompt user
import java.util.Scanner;

public class Assignment1 {
  public static void main (String [] args) {
    // declare variables
    int count;
    char repeat = 'y';
    Scanner keyboard = new Scanner(System.in);

    // loop to prompt user
    while (repeat != 'n') {

      // prompt user and scan into variable count
      System.out.print("How many astericks do you want to print?: ");
      count = keyboard.nextInt();

      // loop to print the astericks
      for (int i = 0; i < count; i++) {
        System.out.print("*");
      }

      // prompt to repeat
      System.out.println();
      System.out.print("Do you want to print again? [y/n]: ");
      repeat = keyboard.next().charAt(0);
    }
  }
}
