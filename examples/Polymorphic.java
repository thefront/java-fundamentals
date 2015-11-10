// Code-Listing 10-25

/**
    This program demonstrates polymorphic behavior
*/

public class Polymorphic {
  public static void main(String[] args) {
    // create an array of GradedActivity references.
    GradedActivity[] tests = new GradedActivity[3];

    // the first test is a regular exam with a numberic score of 75.
    tests[0] = new GradedActivity();
    tests[0].setScore(95);

    // the second test is a pass/fail test. The student missed 5 out of 20
    // questions, and the minumum passing grade is 60.
    tests[1] = new PassFailExam(20, 5, 60);

    // the third test is the final exam. There were 50 questions and the
    // student missed 7.
    tests[2] = new FinalExam(50, 7);

    // display the grades.
    for (int i = 0; i < tests.length; i++) {
      System.out.println("Test " + (i + 1) + ": " + "score " +
                  tests[i].getScore() + ", grade " + tests[i].getGrade());
    }
  }
}
