package shapes;

public abstract class Shape {

	private int length;
	private int breadth;
	
	public Shape(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public abstract int area();
	
	public abstract int perimeter();
	
	public static Shape greaterArea(Shape a, Shape b) {
		if (a.area() > b.area()) 
			return a;
		else if (a.area() < b.area())
			return b;
		else
			return null;
	}
}
