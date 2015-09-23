// Code-Listing 6-3  

/**
    This program demos the Rectangle class's setLength method
*/

public class LengthDemo {
  public static void main(String[] args) {
    // create a Rectangle obj and assign its address to the box variable

    Rectangle box = new Rectangle();

    // indicate what we are doing.
    System.out.println("Sending the value 10.0 to the setLength method.");

    // call the box object's setLength method
    box.setLength(10.0);

    // indicate we are done
    System.out.println("Done.");

  }
}
