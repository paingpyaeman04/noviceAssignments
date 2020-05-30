package novice.assignments2.interfacedemo;

public class MovablePoint implements Movable {

	private int x;
	private int y;
	
	public MovablePoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public void moveUp() {
		this.y++;
		
	}

	@Override
	public void moveDown() {
		this.y--;
		
	}

	@Override
	public void moveLeft() {
		this.x--;
		
	}

	@Override
	public void moveRight() {
		this.x++;
		
	}
	
	@Override
	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}
	

}
