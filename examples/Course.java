// Code-Listing 8-14

/**
    This class stores data about a course.
*/

public class Course {
  private String courseName;          // Name of the course
  private Instructor instructor;      // The instructor
  private TextBook textBook;          // The textbook

  /**
      This constructor initializes the courseName, instructor, and text fields.
      @param name The name of the course.
      @param instr An instructor object.
      @param text A TextBook object.
  */

  public Course(String name, Instructor instr, TextBook text) {
    // Assign the course name
    courseName = name;

    // create a new Instructor object, passing instr as an argument to the copy
    // constructor
    instructor = new Instructor(instr);

    // create a new TextBook object, passing text as an argument to the copy
    // constructor
    textBook = new TextBook(text);
  }

  /**
      getName method
      @return The name of the course.
  */

  public String getName() {
    return courseName;
  }

  /**
      getInstructor method
      @return A reference to a copy of this course's Instructor object.
  */

  public Instructor getInstructor() {
    return new Instructor(instructor);
  }

  /**
      getTextBook method
      @return A reference to a copy of this course's TextBook object.
  */

  public TextBook getTextBook() {
    return new TextBook(textBook);
  }

  /**
      toString method
      @return A string containing the course information.
  */

  public String toString() {
    // create a string representing the object.
    String str = "Course Name: " + courseName + "\nInstructor Information:\n" +
                 instructor + "\nTextbook Information:\n" + textBook;
    // Return the string
    return str;
  }

}
