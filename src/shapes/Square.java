package shapes;

public class Square extends Shape {

	public Square(int side) {
		super(side, side);
	}
	
	@Override
	public int area() {
		return 4 * getLength();
	}

	@Override
	public int perimeter() {
		return (int) Math.pow(getLength(), 2);
	}

}
