package shapes;

public class Circle extends GeometricObject {
	
	private double radius;

	public Circle() {
		super();
		super.color = "red";
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
		this("blue", true, radius);
//		super("blue", true);
//		this.radius = radius;
	}
	
	public Circle(String color, boolean filled, 
			double radius) {
		
		super(color, filled);
		this.radius = radius;		
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/** Return area */
	@Override
	public double area() {
		System.out.println("Circle Area: ");
		
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	
	public double diameter() {
		return 2 * radius;
	}

	/** Return perimeter */
	@Override
	public double perimeter() {
		return 2 * radius * Math.PI;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		if ( !(obj instanceof Circle ) ) {
			return false;
		}
		
		Circle temp = (Circle)obj;
		
		boolean sameRadius = this.radius == temp.radius;
		boolean sameParentData = super.equals(obj);
		
		return sameRadius && sameParentData;
		
	}
	
	
	
	@Override
	public String toString() {
		String result = "color:\t" + super.getColor() + "\n";
		result += "filled:\t" + super.isFilled() + "\n";
		result += "date:\t" + super.getDateCreated() + "\n";
		
		//result += super.toString() + "\n";
		result += "radius:\t" + this.radius;
		
		return result;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}