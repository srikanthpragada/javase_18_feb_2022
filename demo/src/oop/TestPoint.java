package oop;

class Point {
	private int x, y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return this.x + "," + this.y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point other = (Point) obj; // Downcasting
			return this.x == other.x && this.y == other.y;
		} else
			return false;
	}
	
	@Override 
	public int hashCode() {
		return this.x;
	}
	
	public boolean isEqual(Point p) {
		return this.x == p.x && this.y == p.y;
	}

}

public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.isEqual(p2));
		System.out.println(p1.toString());

		System.out.println(p1.equals("abc"));

	}

}
