
public class NeverAliveCell extends AbstractCell {

	public NeverAliveCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}

	public  AbstractCell cellForNextGeneration() {
		return this;
	}

	public boolean willBeAliveInNextGeneration() {
		return false;
	}

	public char displayCharacter() {
		return 'D';
	}

	public boolean isAlive() {
		return false;
	}
}
