package shapes;

public class Square extends Shape {

	public Square(int side) {
		super(side, side);
	}
	
	@Override
	public int area() {
		return (int) Math.pow(getLength(), 2);
	}

	@Override
	public int perimeter() {
		return 4 * getLength();
	}

}
