
public class BlinkCell extends AbstractCell {

	public BlinkCell(int r, int c, ConwayWorld w) {
		super(r, c, w);
	}	

	public boolean willBeAliveInNextGeneration() {
		if (getIsAlive()) {
			return false;
		} else {
			return true;
		}
	}
	
	public AbstractCell cellForNextGeneration() {
		BlinkCell next = new BlinkCell(getRow(), getColumn(), world);
		
		next.setIsAlive(willBeAliveInNextGeneration());
		
		return next;
	}
}
