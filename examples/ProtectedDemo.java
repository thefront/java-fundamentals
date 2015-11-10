// Code-Listing 10-20

import javax.swing.JOptionPane;

/**
    This program demonstrates the FinalExam2 class, which extends the
    GradedActivity2 class.
*/

public class ProtectedDemo {
  public static void main(String[] args) {
    String input;     // to hold input
    int questions;    // Number of questions
    int missed;       // Number of questions missed

    // Get the number of questions on the exam.
    input = JOptionPane.showInputDialog("How many questions are on final exam?");
    questions = Integer.parseInt(input);

    // Get the number of questions the student missed.
    input = JOptionPane.showInputDialog("How many questions did student missed?");
    missed = Integer.parseInt(input);

    // create a FinalExam object
    FinalExam2 exam = new FinalExam2(questions, missed);

    // Display the test results.
    JOptionPane.showMessageDialog(null, "Each question counts " +
                exam.getPointsEach() + " points.\nThe exam score is " +
                exam.getGrade());

    System.exit(0);
  }
}
