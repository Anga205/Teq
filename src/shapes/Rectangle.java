package shapes;

public class Rectangle extends Shape {

	public Rectangle(int l, int b) {
		super(l, b);
	}

	@Override
	public int perimeter() {
		return 2 * (getLength() + getBreadth());
	}

	@Override
	public int area() {
		return getLength() * getBreadth();
	}

}
