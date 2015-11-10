// Code-Listing 10-14

import java.util.Scanner;

/**
    This program demonstrates the CurvedActivity class, which inherits from the
    GradedActivity class.
*/

public class CurvedActivityDemo {
  public static void main(String[] args) {
    double score;         // raw score
    double curvePercent;  // Curve percentage

    // create a Scanner object to read keyboard input
    Scanner keyboard = new Scanner(System.in);

    // Get the unadjusted exam score.
    System.out.print("Enter the student's raw numberic score: ");
    score = keyboard.nextDouble();

    // Get the curve percentage.
    System.out.print("Enter the curve percentage: ");
    curvePercent = keyboard.nextDouble();

    // create a CurvedActivity object.
    CurvedActivity curvedExam = new CurvedActivity(curvePercent);

    // set the exan score.
    curvedExam.setScore(score);

    // display the raw score.
    System.out.println("The raw score is " + curvedExam.getRawScore() + "points.");

    // display the curved scroe.
    System.out.println("The curved score is " + curvedExam.getScore());

    // Display th exam grade
    System.out.println("The exam grade is " + curvedExam.getGrade());
  }
}
