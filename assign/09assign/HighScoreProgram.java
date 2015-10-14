// Name: Richard Tzeng
// Date: 10/13/2015
// HighScore Program

import java.util.*;

public class HighScoreProgram {
  public static void main(String args[]) {
    // declare array
    final int NUM_USERS = 5;
    HighScore[] scores = new HighScore[NUM_USERS];

    // method to get scores
    initialize(scores);

    // method to sort scores
    sort(scores);

    // method to display scores
    display(scores);

    System.out.println();
  }

  public static void initialize(HighScore[] scores) {
    // define input object and other variables
    Scanner input = new Scanner(System.in);
    String user;
    int score;

    for (int i = 0; i < scores.length; i++) {
      // get the names
      System.out.print("Enter the name for score #" + (i + 1) + ": ");
      user = input.next();

      // get the scores
      System.out.print("Enter the score for score #" + (i + 1) + ": ");
      score = input.nextInt();

      // create new object
      scores[i] = new HighScore(user, score);
    }
  }

  public static void sort(HighScore[] scores) {
    // declare minimum values, minimum name string, and minimum index
    int minValue, minIndex;
    String minName;

    // first outer loop to test one value in array at a time
    for (int i = 0; i < (scores.length - 1); i++) {
      // assign values to minimum for swapping purposes as we don't have a swap
      // method
      minIndex = i;
      minValue = scores[i].getScore();
      minName  = scores[i].getName();

      // second inner loop compares the array element from outer loop with others
      // in the array. If there is a minimum value found, assign that index to
      // minimum
      for (int j = i + 1; j < scores.length; j++) {
        if (scores[j].getScore() < scores[minIndex].getScore()) {
          minIndex = j;
          minValue = scores[j].getScore();
          minName  = scores[j].getName();
        }
      }

      // swap score and name values
      scores[minIndex].setScore(scores[i].getScore());
      scores[minIndex].setName(scores[i].getName());
      scores[i].setScore(minValue);
      scores[i].setName(minName);
    }
  }

  public static void display(HighScore[] scores) {
    System.out.println("\nTop Scorers:");

    // print the names and scores from highest to lowest
    for (int i = (scores.length - 1); i >= 0; i--) {
      System.out.println(scores[i].getName() + ": " + scores[i].getScore());
    }
  }
}
