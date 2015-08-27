import java.util.Scanner;

public class Test {

  public static void main (String [] args) {
    int count;
    char repeat = 'y';
    Scanner input = new Scanner(System.in);

    while (repeat != 'n') {
      System.out.print("how many? ");
      count = input.nextInt();

      for (int i = 0; i < count; i++) {
        System.out.print("*");
      }

      System.out.println();
      System.out.print("go again? ");
      repeat = input.next().charAt(0);
    }
  }
}
