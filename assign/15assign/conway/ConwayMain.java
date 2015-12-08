import java.util.*;

public class ConwayMain {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		ConwayWorld world = new ConwayWorld();

		// Ask user for center of blinker cells
		Scanner key = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 10 for the " +
						" center of the blinker cell: ");
		int center = key.nextInt();
		int offset = center - 1;

		// Add some live conway cells, in a horizontal line
		for (int i = 0; i < 8; i++) {
			ConwayCell c = new ConwayCell(5, 5 + i, world);
			c.setIsAlive(true);
			world.replaceCell(c);
		}

		// Add an always-alive cells
		AbstractCell a = new AlwaysAliveCell(12, 12, world);
		world.replaceCell(a);

		// Add an never-alive cells
		AbstractCell n = new NeverAliveCell(17, 17, world);
		world.replaceCell(n);

		// Blinker section

		// Add an always-alive cell for center cell
		AbstractCell cen = new AlwaysAliveCell(center, center, world);
		world.replaceCell(cen);

		// Add a blinker cells
		for (int i = 0; i <= 2; i+=2) {
			AbstractCell b1 = new BlinkerCell(offset + i, center, world);
			b1.setIsAlive(true);
			world.replaceCell(b1);

			// Add a blinker cells
			AbstractCell b2 = new BlinkerCell(center, offset + i, world);
			world.replaceCell(b2);
		}

		// Go!
		do {
			world.display();
			world.advanceToNextGeneration();

			System.out.print("Another? (y/n): ");
		} while (input.nextLine().charAt(0) == 'y');
	}
}
