package lecture_examples;

public class Mouse {
	//Data fields, Member data, Instance data
	//Fields, member variables
	private String color;
	private boolean on;
	private int wheelValue;
	private double length;
	private double weight;
	
	//Constructors
	//Default constructor (takes no parameters)
	//a.k.a no-arg constructor
	public Mouse() {
//		this.color = "black";
//		this.on = false;
//		this.wheelValue = 10;
//		this.length = 1;
//		this.weight = 1;
	}
	
	public Mouse(String color) {
		this.color = color;
		this.on = false;
		this.wheelValue = 10;
		this.length = 1;
		this.weight = 1;
	}
	
	public Mouse(String color, boolean on, int wheelValue,
			double length, double weight) {
		this.color = color;
		this.on = on;
		this.wheelValue = wheelValue;
		this.length = length;
		this.weight = weight;
	}
	
	//Other Methods
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void incrementWheel() {
		this.wheelValue += 1;
	}
	
	public void decrementWheel() {
		this.wheelValue -= 1;
	}
	
	//fake toString() method (for now).
	public void printMouse() {
		System.out.println("Color:\t" + this.getColor());
		System.out.println("On:\t" + this.on);
		System.out.println("wheelValue:\t" + this.wheelValue);
		System.out.println("length:\t" + this.length);
		System.out.println("weight:\t" + this.weight);
	}
	
	
}
