// Name: Richard Tzeng
// Date: 11-01-2015
// Description: This class provides methods to analyze a given string of text.

import java.util.*;

public class StringProcessor {
  private String str;         // to hold the string that was entered

  /**
      The default constructor
  */

  public StringProcessor() {
    str = "";
  }

  /**
      The constructor
      @param s The string to analyze and set str to.
  */

  public StringProcessor(String s) {
    str = s;
  }

  /**
      The setString method
      @param s The string to set variable str to.
  */

  public void setString(String s) {
    str = s;
  }

  /**
      The getString method
      @return The string that's entered.
  */

  public String getString() {
    return str;
  }

  /**
      The workCount method
      @return The count of words.
  */

  public int wordCount() {
    // need to tokenize the string
    StringTokenizer strTokenizer = new StringTokenizer(str);
    return strTokenizer.countTokens();
  }

  /**
      The uppercaseCount method
      @return The number of upper case words.
  */

  public int uppercaseCount() {
    int count = 0;  // set count to 0
    // need to tokenize the string
    StringTokenizer strTokenizer = new StringTokenizer(str);

    // loop through tokens to count uppercase words
    while (strTokenizer.hasMoreTokens()) {
      // convert token back to string
      String word = strTokenizer.nextToken();

      if (Character.isUpperCase(word.charAt(0))) {
        count++;
      }
    }

    return count;   // return count of upper case words
  }

  /**
    The digitCount method
    @return The count of any numberical digits in the given text.
  */

  public int digitCount() {
    int count = 0;  // set count to 0
    // need to tokenize the string
    StringTokenizer strTokenizer = new StringTokenizer(str);

    // loop through tokens to count words that are digits
    while (strTokenizer.hasMoreTokens()) {
      // convert token back to string
      String word = strTokenizer.nextToken();

      // Test that word is one character
      if (word.length() == 1) {
        // assign character to ch variable
        char ch = word.charAt(0);

        if (Character.isDigit(ch)) {
          count++;
        }
      }
    }

    return count; // return count of upper case words
  }

  /**
      The digitWordCount method
      @return The count of words that spell out a digit.
  */

  public int digitWordCount() {
    int count = 0;  // set count to 0
    // need to tokenize the string
    StringTokenizer strTokenizer = new StringTokenizer(str);
    // Create string array
    String[] wordDigit = { "zero", "one", "two", "three", "four", "five", "six",
                           "seven", "eight", "nine" };

    while (strTokenizer.hasMoreTokens()) {
      // convert token to string
      String word = strTokenizer.nextToken();

      // loop to find matches of word digits
      for (int i = 0; i < wordDigit.length; i++) {
        if (word.trim().startsWith(wordDigit[i])) {
          count++;
        }
      }
    }

    return count; // return count of upper case words
  }

  /**
      The getNoSpaceString method
      @return The string with all spaces taken out.
  */

  public String getNoSpaceString() {
    // need to tokenize the string
    StringTokenizer strTokenizer = new StringTokenizer(str);

    // create a string builder
    StringBuilder noSpaces = new StringBuilder();

    // loop through the string to append with out the spaces.
    while (strTokenizer.hasMoreTokens()) {
      // convert token to string and append to StringBuilder
      String word = strTokenizer.nextToken();
      noSpaces.append(word.trim());
    }

    // convert StringBuilder toString and return newString
    String newString = noSpaces.toString();
    return newString;
  }

  /**
      The getNoVowelString method
      @return The string with vowels replaced with a -.
  */

  public String getNoVowelString() {
    // create character array covert string to characters
    char[] strCharArray = str.toCharArray();

    // create a string builder
    StringBuilder vowelReplace = new StringBuilder();

    // loop through each character and
    for (int i = 0; i < strCharArray.length; i++) {
      if (strCharArray[i] == 'a' || strCharArray[i] == 'e' ||
          strCharArray[i] == 'i' || strCharArray[i] == 'o' ||
          strCharArray[i] == 'u') {
          strCharArray[i] = '-';
      }

      // append to new string
      vowelReplace.append(strCharArray[i]);
    }

    // convert StringBuilder toString and return newString
    String newString = vowelReplace.toString();
    return newString;
  }

  /**
      The getNoDigitWordString method
      @return The string with number words replaced with digits.
  */

  public String getNoDigitWordString() {
    // create a string builder
    String wordToDigit = str; // = new StringBuilder(str);

    // loop to replace word to numbers
    for (int i = 0; i <= 9; i++) {
      wordToDigit = wordToDigit.replaceAll(String.valueOf(i), Integer.toString(i));
    }
    /*/ replace word numbers with digits
    wordToDigit = str.replaceAll("zero", "0");
    wordToDigit = wordToDigit.replaceAll("one", "1");
    /**wordToDigit.replaceAll("two", "2");
    wordToDigit.replaceAll("three", "3");
    wordToDigit.replaceAll("four", "4");
    wordToDigit.replaceAll("five", "5");
    wordToDigit.replaceAll("six", "6");
    wordToDigit.replaceAll("seven", "7");
    wordToDigit.replaceAll("eight", "8");
    wordToDigit.replaceAll("nine", "9");
*/

    // convert StringBuilder toString and return newString
    //String newString = wordToDigit.toString();
    return wordToDigit;
  }
}
