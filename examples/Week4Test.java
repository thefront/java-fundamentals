// java practice methods
import java.util.*;

public class Week4Test {
  public static void main (String [] args) {
    int deal1, deal2, dealN;

    char playAgain = 'y', hit = 'y';

    System.out.println("Let's play blackjack");
    Random deal = new Random();
    Scanner input = new Scanner(System.in);

    do {
      System.out.println("deal the cards");
      deal1 = deal.nextInt(10) + 1;
      deal2 = deal.nextInt(10) + 1;
      System.out.println("You got " + deal1 + "," + deal2);
      int totalc = deal1 + deal2;
      System.out.println("total: " + totalc);
      do {
        System.out.print("do you want to hit? [y/n]:");
        hit = input.next().charAt(0);

        if (hit == 'y') {
          dealN = deal.nextInt(10) + 1;
          totalc += dealN;
          System.out.println("you got " + dealN);
          System.out.println("total " + totalc);

          if (totalc > 21) {
            System.out.println("bust.");
            hit = 'n';
          }
          else if (totalc == 21) {
            System.out.println("Winner Winner, chicken dinner!");
            hit = 'n';
          }
        }

      } while (hit != 'n');


      System.out.print("do you want to play again? [y/n]");
      playAgain = input.next().charAt(0);

    } while (playAgain == 'y');

  }
}
