// Name: Richard Tzeng
// Date: 11/3/2015
// Description: This program tests the StringProcessor class
//

import java.util.*;

public class StringProcessorProgram {
  public static void main(String[] args) {
    // set repeat answer to yes
    char answer = 'y';

    // create StringProcessor object
    StringProcessor textQuote = new StringProcessor();

    // loop to get input and print output
    do {
      // get the string
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a line of text: ");
      String input = keyboard.nextLine();

      //set the StringProcessor object to string
      textQuote.setString(input);

      // print output
      System.out.println("words: " + textQuote.wordCount());
      System.out.println("uppercase: " + textQuote.uppercaseCount());
      System.out.println("digits: " + textQuote.digitCount());
      System.out.println("digit words: " + textQuote.digitWordCount());
      System.out.println("line w/whitespace removed: " + '"' +
                          textQuote.getNoSpaceString() + '"');
      System.out.println("line w/digit vowels replaced: " + '"' +
                          textQuote.getNoVowelString() + '"');
      System.out.println("line w/digit words replaced: " + '"' +
                          textQuote.getNoDigitWordString() + '"');

      // repeat
      System.out.print("Do you want to enter another? (y/n): ");
      answer = keyboard.next().charAt(0);

    } while (Character.toLowerCase(answer) != 'n');
  }
}
