package lecture_examples;

public class Rectangle extends Shape {
	private double length;
	private double width;

	
	public Rectangle() {
		super();
		this.length = 1.0;
		this.width = 1.0;
	}
	
	public Rectangle(String color, boolean filled,
			double length, double width) {
		super(color, filled);
		this.length = length;
		this.width = width;
	}
	 
	@Override
	public String toString() {
		String result = super.toString();
		
		result += "Length: " + this.length + "\n";
		result += "Width: " + this.width;
		
		return result;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
