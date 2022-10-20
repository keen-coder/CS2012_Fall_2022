package lecture_examples;

public class Circle extends Shape{
	private double radius;
	
	public Circle() {
		super();
		
		
		this.radius = 1.0;
	}
	
	public Circle(String color, boolean filled, 
			double radius) {
		
		super(color, filled);
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	@Override
	public String toString() {
		String result = super.toString();
		
		result += "\nRadius: " + this.radius;
		
		return result;
	}
	
	
	
	
	
	
	
	
	
}
