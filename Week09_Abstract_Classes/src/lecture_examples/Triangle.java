package lecture_examples;

public abstract class Triangle extends Shape{
	private double side1, side2, side3;
	
	public Triangle(String color, boolean isFilled,
			double side1, double side2, double side3) {
		
	}

	@Override
	public double area() {
		double s = (this.perimeter() / 2.0);
		return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.side1 + this.side2 + this.side3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
