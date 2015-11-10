// Name: Richard Tzeng
// Date: 11/08/2015
// Description: This progarm contains the NumberGuesser class which will
//              contain all the logic for guessing the number:
//              Constructor, lower, higher, getCurrentGuess, and reset methods
//

public class NumberGuesser {

  // assign instance variables set to protected to make available to subclasses
  protected int lowerGuess;    // lowerGuess value changes after each answer
  protected int upperGuess;    // upperGuess value changes after each answer
  protected int origLower;     // variable to set the original values
  protected int origUpper;     // variable to set the original values


  /**
      The Constructor method to assign the values to the instance variables
  */

  public NumberGuesser(int lowerBound, int upperBound) {
    lowerGuess = lowerBound;
    upperGuess = upperBound;
    origLower  = lowerBound;
    origUpper  = upperBound;
  }


  /**
      The higher method sets the lowerGuess value.
  */

  public void higher() {
    lowerGuess = getCurrentGuess();
  }


  /**
      The lower method sets the upperGuess value.
  */

  public void lower() {
    upperGuess = getCurrentGuess();
  }


  /**
      The getCurrentGuess method returns the current mid point value.
      @return the mid point value.
  */

  public int getCurrentGuess() {
    return (lowerGuess + upperGuess) / 2;
  }


  /**
      The reset method sets the lower/upper values back to the original ones
  */

  public void reset() {
    lowerGuess = origLower;
    upperGuess = origUpper;
  }
}
