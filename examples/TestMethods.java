// writing test methods in java


public class TestMethods {
  public static void main(String[] args) {

    double first = 3.0;
    double second = 6.0;
    System.out.println("This is static, void main method");
    System.out.println("Static means the method belongs to the class and not");
    System.out.println("a specific object.");
    System.out.println("Void means this method is not a value returning method");

    outputMethodNoValue();
    System.out.println(stateAdd(first, second));
  }

  /** this method just prints out some text
  */

  public static void outputMethodNoValue() {
    System.out.println("just print some text");
  }

  /** this method will take 2 double and return the sum
      @param flo1 first letter
      @param flo2 second letter
      @return sum
  */

  public static double stateAdd (double flo1, double flo2) {
    return flo1 + flo2;
  }
}
