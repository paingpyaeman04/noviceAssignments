package novice.assignments2.interfacedemo;

public class TestPoint {

	public static void main(String[] args) {
		Movable point = new MovablePoint(4, 3);
		System.out.println("Original Coordinate: " + point);
		
		point.moveDown();
		System.out.println("After moving down: " + point);
		
		point.moveUp();
		System.out.println("After moving up: " + point);
		
		point.moveLeft();
		System.out.println("After moving left: " + point);
		
		point.moveRight();
		System.out.println("After moving right: " + point);
		
	}

}
