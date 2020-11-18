package execution;

import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;

public class Executor {
	
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 5);
		Square square = new Square(10);
		
		Shape shape = new Square(10);
		shape = new Rectangle(15, 54);
		
		System.out.println(square.area());
		System.out.println(square.perimeter());
		
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		
		Shape biggerShape = Shape.greaterArea(square, rectangle);
		System.out.println("The bigger one has " + biggerShape.area() + " Sq Unit of area");
	}

}
