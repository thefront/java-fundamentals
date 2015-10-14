// point tests

public class TestPoint {
  public static void main(String[] args) {
    Point o   = new Point(1.0, 10.0);
    Point oo  = new Point(2.0, 20.0);
    Point ooo = new Point(3.0, 30.0);

    Point copyO = new Point(o);

    Circle cir, cir2, cir3;
    cir = new Circle();
    System.out.println("This is cir origin " + cir.getOrigin());

    cir.setX(1.1);

    System.out.println("This is cir origin after setX " + cir.getOrigin());

    cir2 = new Circle(3.4, 4.3, 5.0);

    System.out.println("Print point 1" + o);
    System.out.println("This is a point 1 copy " + copyO);

    System.out.println("This is cir2 orig " + cir2.getOrigin());
    cir2.setOrigin(oo);
    System.out.println("This is cir2 new orig " + cir2.getOrigin());
    cir2.setY(2.1);
    System.out.println("This is cir2 new orig " + cir2.getOrigin());
    cir3 = new Circle(cir2);
    System.out.println("This is cir3 which is copy of cir2 " + cir2.getOrigin());
    System.out.println(cir.toString());
    System.out.println(cir2.toString());
    System.out.println(cir3.toString());
  }
}
