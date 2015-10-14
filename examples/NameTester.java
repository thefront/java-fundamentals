// Code-Listing 8-17

/**
    This program creates a FullName object, and then calls the object's
    getLength method before values are established for it's reference fields. As
    a result, this program will crash.
*/

public class NameTester {
  public static void main(String[] args) {
    int len;   // to hold the name length

    // create a FullName object
    FullName name = new FullName();

    // get the length of the full name.
    len = name.getLength();

    System.out.println(len);
  }
}
