package shapes;

public class Rectangle 
    extends GeometricObject {
	
	private double width;
	private double height;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(String color, boolean filled,
			double width, double height) {
		
		super(color, filled);

		this.width = width;
		this.height = height;
	}

	/** Return width */
	public double getWidth() {
		return width;
	}

	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}

	/** Return height */
	public double getHeight() {
		return height;
	}

	/** Set a new height */
	public void setHeight(double height) {
		this.height = height;
	}

	/** Return area */
	@Override
	public double area() {
		System.out.println("Rectangle Area: ");
		
		return this.width * this.height;
	}

	/** Return perimeter */
	@Override
	public double perimeter() {
		return 2 * (width + height);
	}

	@Override
	public String toString() {
		String result = super.toString() + "\n" + 
				"width:\t" + this.width + "\n" +
				"height:\t" + this.height;
		
		return result;
	}
}