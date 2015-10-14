// Code-Listing 8-6

/**
    This program passes an object as an argument.
    the object is modifited by the receiving method.
*/

public class PassObject2 {
  public static void main(String[] args) {
    // create a Rectangle object
    Rectangle r = new Rectangle(12.0,5.0);

    // display the ojbects contents
    System.out.println("Contents of the box object:");
    System.out.println("Length : " + r.getLength() +
                       " Width : " + r.getWidth());

    // Pass a reference to the object to the changeRectangle method.
    changeRectangle(r);

    // display the ojbects contents again
    System.out.println("Contents of the box object:");
    System.out.println("Length : " + r.getLength() +
                       " Width : " + r.getWidth());
  }

  /**
      The changeRectangle method sets a Rectangle object's length and width to 0.
      @param r The Rectangle object to change
  */

  public static void changeRectangle(Rectangle r) {
    r.setLength(0.0);
    r.setWidth(0.0);
  }
}
