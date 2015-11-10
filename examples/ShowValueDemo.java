// Code-Listing 10-17

/**
    This program demonstrates the methods in the SuperClass3 and SubClass3 classes.
*/

public class ShowValueDemo {
  public static void main(String[] args) {
    // create a SubClass3 object.
    SubClass3 myObject = new SubClass3();

    myObject.showValue(10);       // pass an int.
    myObject.showValue(1.2);      // pass a double.
    myObject.showValue("Hello");  // pass a string.
  }
}
