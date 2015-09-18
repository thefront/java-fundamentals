// Name: Richard Tzeng
// Date: 09/17/2015
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
    ArrayList<Integer>    scoresList = new ArrayList<Integer>();      // for scores

    // method to get scores
    initailize(namesList, scoresList);

    for (int i = 0; i < namesList.size(); i++) {
      System.out.println(namesList.get(i));
    }

    for (int j = 0; j < scoresList.size(); j++) {
      System.out.println(scoresList.get(j));
    }

    // method to sort scores
    //sort(namesList, scoresList);

    // method to display scores
    //display(namesList, scoresList);
  }

  /** this method collects the names and scores
      @param1 userList  an ArrayList for names
      @param2 marksList an ArrayList for the scores
      @return ArrayList of names and scores
  */

  public static void initailize(ArrayList<String> userList, ArrayList<Integer> marksList) {
    final int NUMUSERS = 5;
    Scanner input = new Scanner(System.in);
    String user;
    int score;

    for (int i = 0; i < NUMUSERS; i++) {
      System.out.print("Enter the name for score #" + (i + 1) + ": ");
      user = input.nextLine();
      userList.add(user);

      System.out.println("");
      
      System.out.print("Enter the score for score #" + (i + 1) + ": ");
      score = input.nextInt();
      marksList.add(score);
    }

  }

}
