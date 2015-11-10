// Code-Listing 10-22

/**
    This class determines a passing or failing grade for an exam
*/

public class PassFailExam extends PassFailActivity {
  private int numQuestions;       // Number of questions
  private double pointsEach;      // Point for each question
  private int numMissed;          // Number of questions missed

  /**
      The constructor sets the number of questions, the number of questions
      missed, and the minimum passing score.
      @param questions The number of questions.
      @param missed The number of questions missed.
      @param minPassing The minimum passing score.
  */

  public PassFailExam(int questions, int missed, double minPassing) {
    // call the superclass constructor
    super(minPassing);

    // declare a local variable for th escore.
    double numericScore;

    // set the numQuestions and numMissed fields
    numQuestions = questions;
    numMissed = missed;

    // Calculate the points for each question and the numeric score for this exam
    pointsEach = 100.0 / questions;
    numericScore = 100.0 - (missed * pointsEach);

    // call the superclass's setScore method to set the numeric score
    setScore(numericScore);
  }

  /**
      The getPointsEach method returns the number of points each question is
      worth.
      @return The value in the pointsEach field.
  */

  public double getPointsEach() {
    return pointsEach;
  }

  /**
      The getNumMissed method returns the number of questions missed.
      @return The value in the numMissed field.
  */

  public int getNumMissed() {
    return numMissed;
  }
}
