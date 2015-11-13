public class MySquare extends GridItem {

	private int side;

	public MySquare(int xValue, int yValue, int s) {
		x = xValue;
		y = yValue;
		side = s;
	}

	public double getArea() {
		return Math.pow(side, 2);
	}

	public boolean containsPoint(int xValue, int yValue) {
		return	xValue >= x &&
				xValue <= x + side &&
				yValue >= y &&
				yValue <= y + side;
	}
}
