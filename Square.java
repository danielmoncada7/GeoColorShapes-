import TestColorable.GeometricObject;

// Square class is extending GeometricObject and implements Colorable interface
public class Square extends GeometricObject implements Colorable {

	private double side;
	
	// Default constructor
	public Square() {
		this(0);
	}
	
	// Constructor for specified side length
	public Square(double side) {
		this.side = side;
	}
	
	// Getter for side
	public double getSide() {
		return side;
	}
	
	// Setter for side 
	public void setSide(double side) {
		this.side = side;
	}
	
	// Override getArea method to calculate area of square
	@Override
	public double getArea() {
		return side * side ;
	}
	
	// Implement howToColor method from Colorable interface
	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}
	
}
