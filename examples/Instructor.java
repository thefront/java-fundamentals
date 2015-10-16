// Code-Listing 8-12
/**
    This class stores data about an instructor.
*/

public class Instructor {
  private String lastName;      // Last Name
  private String firstName;     // First Name
  private String officeNumber;  // Office number

  /**
      This constructor initializes the last name, first name, and office number.
      @param lname The Instructor's last Name.
      @param fname The Instructor's first Name.
      @param office The Instructor's office number.
  */

  public Instructor(String lname, String fname, String office) {
    lastName  = lname;
    firstName = fname;
    officeNumber = office;
  }

  /**
      The copy constructor initializes the object as a copy of another Instructor
      object.
      @param object2 The object to copy.
  */

  public Instructor(Instructor object2) {
    lastName  = object2.lastName;
    firstName = object2.firstName;
    officeNumber = object2.officeNumber;
  }

  /**
      The set method sets a value for each field.
      @param lname The instructor's last name.
      @param fname The instructor's first name.
      @param office The office number.
  */

  public void set(String lname, String fname, String office) {
    lastName  = lname;
    firstName = fname;
    officeNumber = office;
  }

  /**
      The toString method
      @return A string containing the instructor information.
  */

  public String toString() {
    // create a string representing the ojbect.
    String str = "Last Name: " + lastName + "\nFirst Name: " + firstName +
                 "\nOffice Number: " + officeNumber;
    // Return the string
    return str;
  }
}
