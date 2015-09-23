// Code-Listing 6-1

import java.util.Scanner;   // needed for the Scanner class
import java.util.Random;    // needed for the Random class
import java.io.*;      // needed for file I/O classes

/*
    This program writes random numbers to a file/
*/

public class ObjectDemo {
  public static void main(String[] args) throws IOException {
    int maxNumbers;   // Max number of random numbers
    int number;       // To hold a random number

    // create a Scanner object for keyboard input
    Scanner keyboard = new Scanner(System.in);

    // create a Random object to generate random numbers
    Random rand = new Random();

    // create a PrintWriter object to open the file.
    PrintWriter outputFile = new PrintWriter("numbers.txt");

    // Get the number of random numbers to write.
    System.out.println("How many random numbers should I write? ");
    maxNumbers = keyboard.nextInt();

    // Write the numbers to the file
    for (int count = 0; count < maxNumbers; count++) {
      // generate a random integer
      number = rand.nextInt();

      // write the random int to the file
      outputFile.println(number);
    }

    // close the file
    outputFile.close();
    System.out.println("Done.");
  }
}
