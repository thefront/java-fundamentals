import java.util.*;

public class ConwayMain {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ConwayWorld world = new ConwayWorld();
		
		// Add some live conway cells, in a horizontal line		
		for (int i = 0; i < 8; i++) {
			ConwayCell c = new ConwayCell(5, 5 + i, world);
			c.setIsAlive(true);
			world.replaceCell(c);
		}
		
		// Add an always-alive cells
		AbstractCell a = new AlwaysAliveCell(12, 12, world);
		world.replaceCell(a);
			
		// Add an always-alive cells
		AbstractCell n = new NeverAliveCell(17, 17, world);
		world.replaceCell(n);
			
		// Add a blinker cells
		AbstractCell b1 = new BlinkCell(16, 17, world);
		b1.setIsAlive(true);
		world.replaceCell(b1);

		// Add a blinker cells
		AbstractCell b2 = new BlinkCell(18, 17, world);
		b2.setIsAlive(true);
		world.replaceCell(b2);

		// Add a blinker cells
		AbstractCell b3 = new BlinkCell(17, 16, world);
		world.replaceCell(b3);

		// Add a blinker cells
		AbstractCell b4 = new BlinkCell(17, 18, world);
		world.replaceCell(b4);

		// Go!	
		do {
			world.display();
			world.advanceToNextGeneration();
			
			System.out.print("Another? (y/n): ");
		} while (input.nextLine().charAt(0) == 'y');
	}
}
