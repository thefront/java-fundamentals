// Name: Richard Tzeng
// Date: 11/08/2015
// Description:  The subclass should override the behavior of the
//               getCurrentGuess method from the NumberGuesser superclass.

import java.util.*;

public class RandomNumberGuesser extends NumberGuesser {
  // set private variables to hold numbers
  private int upperNum;
  private int lowerNum;
  private int randomGuess;

  /**
      The constructor calls the superclass constructor since the superclass has
      no default or no-arg constructors.
  */

  public RandomNumberGuesser(int lowerBound, int upperBound) {
    super(lowerBound, upperBound);
  }


  /**
      The getCurrentGuess method overrides the superclass's getCurrentGuess
      method.
      @return A random number between the given limits rather than an average.
  */

  public int getCurrentGuess() {
    // create random object
    Random randomNum = new Random();

    // test original values and set original random guess
    if (lowerGuess == origLower && upperGuess == origUpper) {
      upperNum = upperGuess;
      lowerNum = lowerGuess;
      if (randomGuess == 0) {
        randomGuess = randomNum.nextInt(upperNum - lowerNum) + lowerNum;
      }
    }
    // test if the number is lower, then reassign the upper limit, and generate
    // new randomGuess
    else if (upperGuess < upperNum || randomGuess == upperNum) {
      upperNum = upperGuess;
      randomGuess = randomNum.nextInt(upperNum - lowerGuess) + lowerGuess;
    }
    // test if the number is higher, then reassign the lower limit, and generate
    // new randomGuess
    else if (lowerGuess > lowerNum || randomGuess == lowerNum) {
      lowerNum = lowerGuess;
      randomGuess = randomNum.nextInt(upperGuess - lowerNum) + lowerNum;
    }

    // return the value
    return randomGuess;
  }


  /**
      The reset method sets the lower/upper/randomGuess values back to the
      original values.
  */

  public void reset() {
    lowerGuess = origLower;
    upperGuess = origUpper;
    randomGuess = 0;
  }
}
