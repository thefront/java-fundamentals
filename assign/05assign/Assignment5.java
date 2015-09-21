// Name: Richard Tzeng
// Date: 09/19/2015
// Description: This program will prompt the user to enter 5 names and 5 scores.
//              The program will then print out the ranking of the scores from
//              the highest to the lowest scores.
//
// Inputs:      5 names and 5 scores
// Outputs:     a ranking of the scores from highest to lowest
//

import java.util.*;     // includes ArrayList and scanner

public class Assignment5 {
  public static void main(String[] args) {
    // declare variables
    ArrayList<String> namesList  = new ArrayList<String>();    // for names
    ArrayList<Integer> scoresList = new ArrayList<Integer>();  // for scores

    // method to get scores
    initailize(namesList, scoresList);

    // method to sort scores
    sort(namesList, scoresList);

    // method to display scores
    display(namesList, scoresList);
  }


  /** The initialize method accepts the two ArrayLists as its arguments.
      The user is prompted to enter the names and scores for each element.
      @param1 names    A reference to the ArrayList for names
      @param2 scores   A reference to the ArrayList for scores
  */

  public static void initailize(ArrayList<String> names, ArrayList<Integer> scores) {
    final int NUMUSERS = 5;
    Scanner input = new Scanner(System.in);
    String user;
    int score;

    for (int i = 0; i < NUMUSERS; i++) {
      // get the names and add to ArrayList
      System.out.print("Enter the name for score #" + (i + 1) + ": ");
      user = input.next();
      names.add(user);

      // get the scores and add to ArrayList
      System.out.print("Enter the score for score #" + (i + 1) + ": ");
      score = input.nextInt();
      scores.add(score);
    }
  }


  /** The sort method accepts the two ArrayLists as its arguments and then
      displays the ArrayLists.
      @param1 names    A reference to the ArrayList for names
      @param2 scores   A reference to the ArrayList for scores
  */

  public static void sort(ArrayList<String> names, ArrayList<Integer> scores) {
    // declare minimum valies and minimum index
    int minValue, minIndex;
    String minName;

    for (int i = 0; i < (scores.size() - 1); i++) {
      minIndex = i;
      minValue = scores.get(i);
      minName  = names.get(i);

      for (int j = i + 1; j < scores.size(); j++) {
        if (scores.get(j) < scores.get(minIndex)) {
          minIndex = j;
          minValue = scores.get(j);
          minName  = names.get(j);
        }
      }

      // swap score and name values
      scores.set(minIndex, scores.get(i));
      names.set(minIndex, names.get(i));
      scores.set(i, minValue);
      names.set(i, minName);
    }
  }


  /** The display method accepts the two ArrayLists as its arguments and then
      displays the ArrayLists.
      @param1 names    A reference to the ArrayList for names
      @param2 scores   A reference to the ArrayList for scores
  */

  public static void display(ArrayList<String> names, ArrayList<Integer> scores) {

    System.out.println("\nTop Scorers:");

    // print the names and scores
    for (int i = (names.size() - 1); i >= 0; i--) {
      System.out.print(names.get(i) + ": " + scores.get(i) + "\n");
    }
  }
}
