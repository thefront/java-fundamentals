// Code-Listing 10-26

/**
    The Student class is an abstract class that holds general data about a
    student. Classes representing specific types of students should inherit
    from this class.
*/

public abstract class Student {
  private String name;        // student name
  private String idNumber;    // student ID
  private int yearAdmitted;   // Year admitted

  /**
      The constructor sets the student's name, ID Number, and year admitted.
      @param n The student's name.
      @param id The student's ID number.
      @param year The year the student was admintted.
  */

  public Student(String n, String id, int year) {
    name = n;
    idNumber = id;
    yearAdmitted = year;
  }

  /**
      The toString method returns a String containing the student's data.
      @return A reference to a string.
  */

  public String toString() {
    String str;

    str = "Name: " + name + "\nID Number: " + idNumber + "\nYear Admitted: " +
          yearAdmitted;
    return str;
  }

  /**
      The getRemainingHours method is abstract. It must be overridden in a
      subclass.
      @return The hours remaining for the student.
  */

  public abstract int getRemainingHours();
}
