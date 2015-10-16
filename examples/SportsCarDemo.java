// Code-Listing 8-22
/**
    This program deomonstrates the SportsCar class.
*/

public class SportsCarDemo {
  public static void main(String[] args) {
    // create a SportsCar object.
    SportsCar yourNewCar = new SportsCar(CarType.PORSCHE, CarColor.RED, 10000);

    // display the object's values.
    System.out.println(yourNewCar);
  }
}
