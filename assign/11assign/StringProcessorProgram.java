// Name: Richard Tzeng
// Date: 11/1/2015
// Description: This program tests the StringProcessor class
//

import java.util.*;

public class StringProcessorProgram {
  public static void main(String[] args) {
    String input;       // To hold the string input
    Scanner keyboard = new Scanner(System.in);

    // get the string
    System.out.print("Enter a line of text: ");
    input = keyboard.nextLine();

    StringProcessor textQuote = new StringProcessor(input);

    System.out.println("This is getString: " + textQuote.getString());
    System.out.println("This is the word count: " + textQuote.wordCount());
    System.out.println("This is # upper words: " + textQuote.uppercaseCount());
    System.out.println("This is digitCount: " + textQuote.digitCount());
    System.out.println("DigitWords: " + textQuote.digitWordCount());
    System.out.println("noSpaces: " + textQuote.getNoSpaceString());
    System.out.println("vowel: " + textQuote.getNoVowelString());
    System.out.println("wordTo: " + textQuote.getNoDigitWordString());
  }
}
