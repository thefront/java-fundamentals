// Code-Listing 10-21

/**
    This class holds a numeric score and determinses whether the score is passing
    or failing.
*/

public class PassFailActivity extends GradedActivity {
  private double minPassingScore;    // Minimum passing score

  /**
      The constructor sets the minimum passing score.
      @param mps the minimum passing score
  */

  public PassFailActivity(double mps) {
    minPassingScore = mps;
  }

  /**
      The getGrade method returns a letter grade determined from the score
      field. This method overrides the superclass method.
      @return The letter grade.
  */

  public char getGrade() {
    char letterGrade;

    if (super.getScore() >= minPassingScore) {
      letterGrade = 'P';
    }
    else {
      letterGrade = 'F';
    }

    return letterGrade;
  }
}
