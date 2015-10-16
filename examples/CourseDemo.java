// Code-Listing 8-15

/**
    This program demonstrates the Course class.
*/

public class CourseDemo {
  public static void main(String[] args) {
    // create an Instructor object
    Instructor myInstructor = new Instructor("Kramer", "Shawn", "RH310");

    // create a TextBook object
    TextBook myTextBook = new TextBook("Starting Out With Java", "Gaddis",
                                       "Addison-Wesley");

    // create a course objec.
    Course myCourse = new Course("Instro to Java", myInstructor, myTextBook);

    // Display the course information.
    System.out.println(myCourse);
  }
}
