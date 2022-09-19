package lecture_examples;

public class MyClass {
	private int x;
	static int y;
	
	private static final double PI = 3.14159265;
	
	
	public MyClass(int x, int y) {
		this.setX(x);
		MyClass.y = y;
	}
	
	//getters or accessor methods
	public int getX() {
		return this.x;
	}
	
	public void setX(int x) {
		if (x < 0) {
			System.out.println("New X is negative, value not updated");
		}
		else {
			this.x = x;
		}
	}
	
	
	
	
	
	
}
