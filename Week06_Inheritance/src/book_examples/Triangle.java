package book_examples;

public class Triangle extends GeometricObject {
	private int sideA, sideB, sideC;
	
	public Triangle(String color, boolean isFilled, int sideA, int sideB, int sideC) {
		super(color, isFilled);
		this.sideA = sideA;
	}
	
	@Override
	public double area() {
		return 1;
	}
}